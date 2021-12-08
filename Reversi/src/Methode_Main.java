public class Methode_Main {
    public static void afficherTableau(String[][]tab){
        for (int i = 0; i <tab.length ; i++) {
            for (int j = 0; j <tab[1].length ; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
}
