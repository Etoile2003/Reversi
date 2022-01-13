import java.util.Scanner;
import  java.util.concurrent.TimeUnit ;

public class Game {

    public static boolean playGame= true ;
    public static boolean rejouer  = true ;
    public static void myGame( boolean ia ) throws InterruptedException {
        Scanner sc = new Scanner(System.in) ;
        Methode_Main.listDesCoJouablesFct(Menu.tabint,1);

        System.out.println("Il faut saisire l'axe horizontal puis verticale ");
        int passCompt = 0 ;
        while (playGame) {
            int x = 0;
            int y = 0;


            rejouer = true ;
            //
            if (canPlay(passCompt) && playGame ){//Methode_Main.listDesCoJouablesFct(Menu.tabint, 1).size() != 0
                passCompt =  0 ;

                do {
                    x = 0;
                    y = 0;

                    do {
                        System.out.println("c'est au noir de jouer ");

                        Methode_Main.afficherTableau(Menu.tabint,Methode_Main.listDesCoJouablesFct(Menu.tabint, 1));

                        try {
                            x = Integer.parseInt(sc.nextLine());
                            y = Integer.parseInt(sc.nextLine());
                        } catch (Exception E) {
                            System.out.println("il faut ecrire des coordoner ");
                            x = -1;
                            y = -1;
                        }

                    } while (x < 1 || x > 8 || y < 1 || y > 8);

                    x-- ;
                    y-- ;
                    Methode_Bastien.placerJeton( x, y, "⬡");
                }while (rejouer) ;

            }

            else if (playGame) {
                 System.out.println("Le joueur ⬡ ne peut pas jouer" );
                 passCompt++ ;
             }

            rejouer = true;
            //coordoner dans un int
            if (canPlay(passCompt) && playGame){
                passCompt = 0 ;
                if (!ia) {
                    do {

                        do {
                            System.out.println("c'est au blanc de jouer ");

                            Methode_Main.afficherTableau(Menu.tabint, Methode_Main.listDesCoJouablesFct(Menu.tabint, 2));

                            try {
                                x = Integer.parseInt(sc.nextLine());
                                y = Integer.parseInt(sc.nextLine());
                            } catch (Exception E) {
                                System.out.println("il faut ecrire des coordoner ");
                                x = -1;
                                y = -1;
                            }


                        } while (x < 1 || x > 8 || y < 1 || y > 8);
                        x--;
                        y--;

                        Methode_Bastien.placerJeton(x, y, "⬢");

                    } while (rejouer);
                }
                else {
                    System.out.println("c'est a l'ia de jouer");
                    Methode_Main.afficherTableau(Menu.tabint, Methode_Main.listDesCoJouablesFct(Menu.tabint, 2));
                    Methode_Main.listDesCoJouablesFct(Menu.tabint, 2) ;
                    TimeUnit.SECONDS.sleep(3);
                    iaPlay() ;
                }

            }
            else if (playGame)
            {
                System.out.println("le joueur ⬢ ne peut pas jouer");
                passCompt++ ;
            }







        }
        endGame() ;

    }

    private static void iaPlay() {
        int x  = 0;
        int y = 0;
        int minus  = 0;


        for (int i = 0; i < Menu.tabint.length; i++) {
            for (int j = 0; j < Menu.tabint.length; j++) {

                if (Menu.tabint[i][j] < minus){
                    x = j ;
                    y = i ;
                    minus = Menu.tabint[i][j] ;
                }
                else if (minus ==  Menu.tabint[i][j]){
                    int number = (int)(Math.random() * 10);

                    if (number < 5 ){
                        x = j ;
                        y = i ;
                    }

                }

            }


        }
        Methode_Bastien.placerJeton(x, y, "⬢");


    }


    public static void endGame(){
        int blanc = 0 ;
        int noire = 0 ;

        for (int i = 0; i < Menu.tabint.length; i++) {
            for (int j = 0; j < Menu.tabint.length; j++) {


                if ( Menu.tabint[i][j] == 1){
                    noire++ ;
                }


                else if  ( Menu.tabint[i][j] == 2) {
                    blanc++ ;

                }




            }



        }
        if ( noire >  blanc){
            System.out.println("Victoire des noire"); // s ????

        }
        else if (blanc > noire){
            System.out.println("Victoire des blanc"); // s???
        }
        else {
            System.out.println("Egalité personne ne gagne ");
        }
        System.out.println("Nombre de jeton noire :"+noire);
        System.out.println("Nombre de jeton blanc :"+blanc);







    }
    private static boolean canPlay(int pass) {
        if (pass >= 2){
            playGame = false ;
            System.out.println("personne ne peut jouer fin de partie ");
        }

        for (int i = 0; i < Menu.tabint.length; i++) {

            for (int j = 0; j < Menu.tabint.length; j++) {

                if (Menu.tabint[i][j] < 0 ){
                    return true ;
                }

            }


        }

        return false ;
    }

}