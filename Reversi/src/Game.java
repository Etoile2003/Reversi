import java.util.Scanner;

public class Game {
    public static boolean playGame= true ;
    public static int turn = 0 ;
    public static void myGame(){
        Scanner sc = new Scanner(System.in) ;
        Methode_Main.listDesCoJouables(Menu.plateau,1);
        while (playGame){
            int x =0 ;
            int y = 0 ;
            do{
                System.out.println("c'est au noir de jouer ");
                Methode_Main.afficherTableau(Menu.plateau);
                try {
                    x = Integer.parseInt(sc.nextLine()) ;
                    y = Integer.parseInt(sc.nextLine() );
                }catch (Exception E){
                    System.out.println("il faut ecrire des coordoner ");
                    x = - 1 ;
                    y = - 1 ;
                }

            }while (x <1 || x > 8 || y < 1 || y > 8 ) ;
            //coordoner dans un int
            y = -1 ;
            x = - 1 ;
            do{
                System.out.println("c'est au blanc de jouer ");
                Methode_Main.afficherTableau(Menu.plateau);
                try {
                    x = Integer.parseInt(sc.nextLine()) ;
                    y = Integer.parseInt(sc.nextLine() );
                }catch (Exception E){
                    System.out.println("il faut ecrire des coordoner ");
                    x = - 1 ;
                    y = - 1 ;
                }

            }while (x <1 || x > 8 || y < 1 || y > 8 ) ;
        }












        }

    }
