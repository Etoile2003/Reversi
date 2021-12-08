import java.util.ArrayList;

public class Methode_Main {
    public static void afficherTableau(String[][]tab,int[]coSelectionner,ArrayList<Integer[]>listeCo ){
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab[1].length ; j++) {
                System.out.print(tab[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void listDesCoJouables(String[][]tab,int joueur){
        ArrayList<Integer[]> listeCo = new ArrayList<Integer[]>();
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab[1].length ; j++) {
                if (joueur==1){
                    if (tab[i][j].equals("⬡")){

                    }
                }else {

                }
            }

        }
    }
}
