import java.util.ArrayList;
import java.util.List;

public class Methode_Main {
    public static void afficherTableau(String[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static List listDesCoJouables(String[][] tab, int joueur) {
        List myArrayList = new ArrayList();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                int newX = i, newY = j, compteurNBRPionRetourner = 0;
                if (joueur == 1) {
                    if (tab[i][j].equals("⬡")) {
                        try {
                            newX--;
                            newY--;
                            while (tab[newX][newY].equals("⬢")) {
                                newX--;
                                newY--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {

                            newY--;
                            while (tab[newX][newY].equals("⬢")) {
                                newY--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX++;
                            newY--;
                            while (tab[newX][newY].equals("⬢")) {
                                newX++;
                                newY--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX--;

                            while (tab[newX][newY].equals("⬢")) {
                                newX--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX++;

                            while (tab[newX][newY].equals("⬢")) {
                                newX++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX--;
                            newY++;
                            while (tab[newX][newY].equals("⬢")) {
                                newX--;
                                newY++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {

                            newY++;
                            while (tab[newX][newY].equals("⬢")) {

                                newY++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX++;
                            newY++;
                            while (tab[newX][newY].equals("⬢")) {
                                newX++;
                                newY++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                    }
                } else {
                    if (tab[i][j].equals("⬢")) {
                        try {
                            newX--;
                            newY--;
                            while (tab[newX][newY].equals("⬡")) {
                                newX--;
                                newY--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {

                            newY--;
                            while (tab[newX][newY].equals("⬡")) {
                                newY--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX++;
                            newY--;
                            while (tab[newX][newY].equals("⬡")) {
                                newX++;
                                newY--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX--;

                            while (tab[newX][newY].equals("⬡")) {
                                newX--;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX++;

                            while (tab[newX][newY].equals("⬡")) {
                                newX++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX--;
                            newY++;
                            while (tab[newX][newY].equals("⬡")) {
                                newX--;
                                newY++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {

                            newY++;
                            while (tab[newX][newY].equals("⬡")) {

                                newY++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                        try {
                            newX++;
                            newY++;
                            while (tab[newX][newY].equals("⬡")) {
                                newX++;
                                newY++;
                                compteurNBRPionRetourner++;
                            }
                            int[] tabCo = {newX, newY, compteurNBRPionRetourner};
                            myArrayList.add(tabCo);
                        } catch (Exception E) {
                        }
                    }
                }


            }
        }

        return myArrayList;
    }
}

