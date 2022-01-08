import java.util.ArrayList;
import java.util.List;
public class Methode_Main {
    public static void afficherTableau(int[][] tab, List<ArrayList> listCo) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + 1+"\t");
            for (int j = 0; j < tab[1].length; j++) {
                if (tab[i][j] == 1) {
                    System.out.print("⬡" + "\t");
                } else if (tab[i][j] == 2) {
                    System.out.print("⬢" + "\t");
                } else if (tab[i][j] == 0) {
                    System.out.print("." + "\t");
                } else {
                    System.out.print("\u001B[31m" + "X" + "\u001B[0m" + "\t");
                }
            }System.out.println();
        }
        System.out.println(" \t1   2   3   4   5   6   7   8");
        for (int k = 0; k < listCo.size(); k++) {
                System.out.println(listCo.size());
                ArrayList<Integer> cojouable = listCo.get(k);
                System.out.println("X " + cojouable.get(0));
                System.out.println("Y " + cojouable.get(1));
                System.out.println("Departx " + cojouable.get(2));
                System.out.println("Departy " + cojouable.get(3));
                System.out.println("nbrjeton " + cojouable.get(4));
                System.out.println("------------------------------------");
            }
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static ArrayList listDesCoJouablesFct(int[][] tab, int joueur) {
        int compteur;
        ArrayList<ArrayList> ListeCoJouable = new ArrayList<>();
        int CoDepX = -1, CoDepY = -1;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                if (joueur == 1) {
                    if (tab[j][i] == 1) {
                        System.out.println("pions trouver en "+j+" "+i);
                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, -1, -1, compteur, 2, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 1, -1, compteur, 2, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, -1, 1, compteur, 2, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 1, 1, compteur, 2, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, -1, 0, compteur, 2, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 1, 0, compteur, 2, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 0, -1, compteur, 2, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 0, 1, compteur, 2, ListeCoJouable, CoDepX, CoDepY);
                    }
                }
                else {
                    if (tab[i][j] == 2) {
                        System.out.println("pions trouver en "+j+" "+i);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, -1, -1, compteur, 1, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 1, -1, compteur, 1, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, -1, 1, compteur, 1, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 1, 1, compteur, 1, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, -1, 0, compteur, 1, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 1, 0, compteur, 1, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 0, -1, compteur, 1, ListeCoJouable, CoDepX, CoDepY);

                        compteur = 0;
                        verifjouable(Menu.tabint, i,j, 0, 1, compteur, 1, ListeCoJouable, CoDepX, CoDepY);
                    }
                }
            }
        }
        return ListeCoJouable;
    }

    public static void verifjouable(int[][] tab, int pionsX, int pionsY, int modx, int mody, int compteur, int pion, ArrayList<ArrayList> listCo, int CoDepX, int CodepY) {
        try {
            int newPosX = pionsX + modx, newposY = pionsY + mody;
            if (tab[newposY][newPosX] == pion) {
                if (compteur == 0) {
                    CoDepX = pionsX;
                    CodepY = pionsY;
                }
                compteur++;
                verifjouable(tab, newPosX, newposY, modx, mody, compteur, pion, listCo, CoDepX, CodepY);
            } else if (tab[newposY][newPosX] <= 0 && compteur >= 1) {
                tab[newposY][newPosX]=tab[newposY][newPosX]-compteur;
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


