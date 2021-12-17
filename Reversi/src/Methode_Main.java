import java.util.ArrayList;
import java.util.List;

public class Methode_Main {
    public static void afficherTableau(String[][] tab,List<Integer>listCo) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(i + 1);
            for (int j = 0; j < tab[0].length; j++) {
                boolean find = false  ;
                for (int k = 0; k <listCo.size() ; k+=3) {
                    if (listCo.get(k)==i&&listCo.get(k+1)==j && !find){
                        System.out.print("\u001B[31m"+"X"+"\u001B[0m"+"\t");
                        find = true ;
                    }

                }
                if (!find){
                    System.out.print(tab[i][j]+"\t");
                }
            }
            System.out.println();
        }
        System.out.println(" 1  2   3   4   5   6   7   8");
    }

    public static List[] listDesCoJouables(String[][] tab, int joueur) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        ArrayList<Integer> listEmplacementDepart = new ArrayList<Integer>();
        ArrayList<Integer> nombreJetonsRetourner = new ArrayList<Integer>();
        List[]coJoubleEtOriginal = new List[3];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                if (joueur == 1) {
                    if (tab[i][j].equals("⬡")) {
                        int compteur;
                        int[] cojouable = new int[3];

                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, -1, -1, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, -1, 1, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 1, -1, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 1, 1, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 0, -1, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 0, 1, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, -1, 0, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 1, 0, compteur, "⬢", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                    }

                } else {
                    if (tab[i][j].equals("⬢")) {
                        int compteur;
                        int[] cojouable = new int[3];


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, -1, -1, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, -1, 1, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 1, -1, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 1, 1, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 0, -1, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 0, 1, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, -1, 0, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);


                        compteur = 0;
                        verifjouable(Menu.plateau, i, j, 1, 0, compteur, "⬡", cojouable, myArrayList,listEmplacementDepart,nombreJetonsRetourner);

                    }
                }

            }
        }
        for (int i = 0; i < myArrayList.size(); i++) {
          //  System.out.println(myArrayList.get(i));
        }

        coJoubleEtOriginal[0]=listEmplacementDepart;
        coJoubleEtOriginal[1]=myArrayList;
        coJoubleEtOriginal[2]=nombreJetonsRetourner;
        return coJoubleEtOriginal;

    }

    public static void verifjouable(String[][] tab, int pionsX, int pionsY, int modx, int mody, int compteur, String pion, int[] coPositionJouable, ArrayList listCo,ArrayList listCoDepart, ArrayList nombreJeton) {
        coPositionJouable[0] = -1;
        coPositionJouable[1] = -1;
        coPositionJouable[2] = -1;
        int savePionsX=pionsX, savePionsY=pionsY;

        try {
            int newPosX = pionsX + modx, newposY = pionsY + mody;
            if (tab[newPosX][newposY].equals(pion)) {


                compteur++;
                verifjouable(tab, newPosX, newposY, modx, mody, compteur, pion, coPositionJouable, listCo,listCoDepart,nombreJeton);
            } else if (tab[newPosX][newposY].equals(".") && compteur >= 1) {
                coPositionJouable[0] = newPosX;
                coPositionJouable[1] = newposY;
                //System.out.println("ajout");
                ajoutCoDansListe(coPositionJouable, listCo);
                nombreJeton.add(compteur);
                nombreJeton.add(compteur);
                listCo.add(savePionsX);
                listCo.add(savePionsY);

            }
        } catch (Exception e) {

        }

    }

    public static void ajoutCoDansListe(int[] tabCo, ArrayList listCo) {
        if (tabCo[0] != -1) {
            for (int i = 0; i < tabCo.length; i++) {
                listCo.add(tabCo[i]);
            }
        }
    }
}

