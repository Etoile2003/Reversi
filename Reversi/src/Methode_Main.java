import java.util.ArrayList;
import java.util.List;

public class Methode_Main {
    public static void afficherTableau(String[][] tab, List<ArrayList> listCo) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < tab[1].length; j++) {
                boolean find = false;
                for (int k = 0; k < listCo.size(); k ++) {
                    ArrayList<Integer> cojouable = listCo.get(k) ;

                    if (cojouable.get(0) == j && cojouable.get(1) == i && !find) {

                        System.out.print("\u001B[31m" + "X" + "\u001B[0m" + "\t");
                        find = true;
                    }

                }
                if (!find) {
                    System.out.print(tab[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println(" 1  2   3   4   5   6   7   8");
        for (int k = 0; k < listCo.size(); k ++) {
            System.out.println(listCo.size());
            ArrayList<Integer> cojouable = listCo.get(k);
            System.out.println("X "+cojouable.get(0));
            System.out.println("Y "+cojouable.get(1));
            System.out.println("Departx "+cojouable.get(2));
            System.out.println("Departy "+cojouable.get(3));
            System.out.println("nbrjeton "+cojouable.get(4));
            System.out.println("------------------------------------");


        }


    }


    public static ArrayList listDesCoJouablesFct(String[][] tab, int joueur) {

        ArrayList<ArrayList> ListeCoJouable = new ArrayList<>();
        int CoDepX = -1, CoDepY = -1;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (joueur == 1) {
                    if (tab[i][j].equals("⬡")) {
                        System.out.println("pions trouver en "+j+" "+i);
                        int compteur;



                        compteur = 0;

                        verifjouable(Menu.plateau, i,j, -1, -1, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 1, -1, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, -1, 1, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 1, 1, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, -1, 0, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 1, 0, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 0, -1, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 0, 1, compteur, "⬢", ListeCoJouable, CoDepX, CoDepY);


                    }

                } else {
                    if (tab[i][j].equals("⬢")) {
                        int compteur;



                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, -1, -1, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 1, -1, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, -1, 1, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 1, 1, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, -1, 0, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 1, 0, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 0, -1, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);


                        compteur = 0;
                        verifjouable(Menu.plateau, i,j, 0, 1, compteur, "⬡", ListeCoJouable, CoDepX, CoDepY);


                    }
                }

            }
        }

        /*
        for (int i = 0; i < ListeCoJouable.size(); i++) {
            //  System.out.println(ListeCoJouable.get(i));

        }
        */
        return ListeCoJouable;
    }




    public static void verifjouable(String[][] tab, int pionsX, int pionsY, int modx, int mody, int compteur, String pion, ArrayList<ArrayList> listCo, int CoDepX, int CodepY) {


        try {
            int newPosX = pionsX + modx, newposY = pionsY + mody;

            if (tab[newposY][newPosX].equals(pion)) {

                if (compteur == 0) {
                    //refaire la liste d'integer ici
                    CoDepX = pionsX;
                    CodepY = pionsY;
                }

                compteur++;

                verifjouable(tab, newPosX, newposY, modx, mody, compteur, pion, listCo, CoDepX, CodepY);
            }

            else if (tab[newposY][newPosX].equals(".") && compteur >= 1) {
                ArrayList<Integer> InfoCo = new ArrayList<>();
                InfoCo.add(newPosX);
                InfoCo.add(newposY);
                InfoCo.add(CoDepX);
                InfoCo.add(CodepY);
                InfoCo.add(compteur);
                listCo.add(InfoCo);



            }
        } catch (Exception e) {

        }

    }

}


