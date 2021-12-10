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
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                int newX = i, newY = j, compteurNBRPionRetourner = 0;
                if (joueur == 1) {
                    if (tab[i][j].equals("⬡")) {
                        System.out.println("oui");

                    }

                }


            }
        }

        return myArrayList;
    }
}

