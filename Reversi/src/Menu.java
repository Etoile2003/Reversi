import java.util.Scanner;

public class Menu {

    public static void menu() throws InterruptedException {


        int ia ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" Voulez vous jouer contre un joueur ou contre l'ia ? \n 1. joueur \n 2. ia ");
        do {
            try{
                ia = Integer.parseInt(sc.nextLine()) ;
            }catch (Exception e){
                ia = -1 ;
            }

        }while(ia <1 || ia >3 ) ;
        if (ia != 3 )
            Game.myGame(ia != 1);
    }

}
