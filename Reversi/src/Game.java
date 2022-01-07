import java.util.Scanner;

public class Game {

    public static boolean playGame= true ;
    public static boolean rejouer  = true ;
    public static void myGame(){
        Scanner sc = new Scanner(System.in) ;
        Methode_Main.listDesCoJouablesFct(Menu.tabint,1);

        System.out.println("Il faut saisire l'axe verticale puis l'axe horizontal ");
        while (playGame) {
            int x = 0;
            int y = 0;

            rejouer = true ;
            if ( Methode_Main.listDesCoJouablesFct(Menu.tabint, 1).size() != 0 ){

           
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
                    Methode_Bastien.placerJeton(Methode_Main.listDesCoJouablesFct(Menu.tabint, 1), x, y, "⬡");
                }while (rejouer) ;

            }
            else
                System.out.println("Le joueur ⬡ ne peut pas jouer" );
            rejouer = true;
            //coordoner dans un int


            do {
                x = 0;
                y = 0;
                do {
                    System.out.println("c'est au blanc de jouer ");

                    Methode_Main.afficherTableau(Menu.tabint,Methode_Main.listDesCoJouablesFct(Menu.tabint, 2));

                    try {
                        x = Integer.parseInt(sc.nextLine());
                        y = Integer.parseInt(sc.nextLine());
                    } catch (Exception E) {
                        System.out.println("il faut ecrire des coordoner ");
                        x = -1;
                        y = -1;
                    }


                }while (x <1 || x > 8 || y < 1 || y > 8 ) ;
                x-- ;
                y-- ;
                Methode_Bastien.placerJeton(Methode_Main.listDesCoJouablesFct(Menu.tabint , 2) , x , y ,"⬢");
            }while (rejouer) ;




        }


    }

}