import java.util.ArrayList;
import java.util.List;



// list (xpla , ypla , xdep ydep , nbrjetonrt)
public class Methode_Bastien {

    public static void placerJeton( int x , int y , String jeton){
        System.out.println("X " + x);
        System.out.println("Y "+ y );

        boolean canPlace = false ;

        if (Menu.tabint[y][x] < 0   )
            canPlace = true ;

        if (canPlace){
            System.out.println("jeton placé");
            if (jeton == "⬡")
                Menu.tabint[y][x] = 1 ;
            else
                Menu.tabint[y][x] = 2 ;

            Game.rejouer = false ;
            retournerjeton( x , y , jeton);
        }
        else {
            System.out.println("impossible jouer ici ");
        }

    }




    public static void retournerjeton( int x , int y ,  String jeton ){

        //faire une troisieme list qui contien seulement le nombre de jeton retourné


//        System.out.println("max "+coArrive.size());
//        System.out.println("maxdepart "+coDepart.size());
//        System.out.println("nbrJeton "+nbrJeton.size());
        if (jeton == "⬡") {


            look(x , y , -1 , 0 ,2 , 1 , 0  , x , y );
            look(x , y , -1 , -1 ,2 , 1 , 0  , x , y );
            look(x , y , 0 , -1 ,2 , 1 , 0  , x , y );
            look(x , y , 1 , 1 ,2 , 1 , 0  , x , y );
            look(x , y , 1 , 0 ,2 , 1 , 0  , x , y );
            look(x , y , 1 , 1 ,2 , 1 , 0  , x , y );
            look(x , y , 0 , 1 ,2 , 1 , 0  , x , y );
            look(x , y , -1 , 1 ,2 , 1 , 0  , x , y );

        }
        else
        {
            look(x , y , -1 , 0 ,1 , 2 , 0  , x , y );
            look(x , y , -1 , -1 ,1 , 2 , 0  , x , y );
            look(x , y , 0 , -1 ,1 , 2 , 0  , x , y );
            look(x , y , 1 , 1 ,1 , 2 , 0  , x , y );
            look(x , y , 1 , 0 ,1 , 2 , 0  , x , y );
            look(x , y , 1 , 1 ,1 , 2 , 0  , x , y );
            look(x , y , 0 , 1 ,1 , 2 , 0  , x , y );
            look(x , y , -1 , 1 ,1 , 2 , 0  , x , y );


        }

        }






    public static void look(int x , int y , int directionX , int directionY , int what , int valjoueur , int compteur , int xini , int yini ){
    try {
        if(compteur == 0 ){
            if(Menu.tabint[y+directionY][x+directionX] == what  ){
                compteur++ ;
                System.out.println("je ai trouvé en x "+ directionX + " y "+directionY);
                look(x+directionX ,y+directionY , directionX , directionY ,  what , valjoueur , compteur  , xini , yini);
            }
            else
                System.out.println("je n'ai rien trouvé en x "+ directionX + " y "+directionY);
        }
        else {
            if(Menu.tabint[y+ directionY][x+ directionX] == valjoueur){
                System.out.println("fin des recherche en x "+( x+directionX) + " y "+ (y+ directionY) +" je vais fill");
                fill(xini , yini , x  , y , valjoueur);
            }
            else if (Menu.tabint[y+ directionY][x+ directionX] == what){
                System.out.println("j'ai trouvé un "+ what + " en x "+ (x+ directionX) + " y "+ (y+ directionY) +" je continue de chercher ");
                compteur++ ;
                look(x+directionX ,y+directionY , directionX , directionY ,  what , valjoueur , compteur ,  xini ,yini );
            }
            else {
                System.out.println("je n'ai finalement rien trouvé en x "+ (x+ directionX) +" y "+ (y+ directionY)+ " :(");
            }
    }



        }catch (Exception e){



    }

    }



    public static void fill(int Xdep , int Ydep ,int Xend , int Yend , int valJoueur) {
        System.out.println("fill se lance ");
        System.out.println("Xdep "+Xdep);
        System.out.println("Ydep "+Ydep);
        System.out.println("Xdend "+Xend);
        System.out.println("Yend "+Yend);
        int Directx = (  Xend -Xdep );
        int Directy = (  Yend -Ydep) ;


        System.out.println("Directx " + Directx);
        System.out.println("Directy " + Directy);
        if (Directx < 0 )
            Directx = -1 ;
        else if (Directx > 0 )
            Directx = 1 ;


         if (Directy < 0 )
            Directy = -1 ;
        else if (Directy > 0 )
            Directy = 1 ;


        System.out.println("NewDirectx " + Directx);
        System.out.println("NewDirecty " + Directy);
        if (Xdep != Xend || Ydep != Yend ){
            System.out.println("je vais fill en x "+ (Xdep +Directx) + " y " + (Ydep +Directy ));
            Menu.tabint[Ydep +Directy][Xdep +Directx] = valJoueur ;
            fill(Xdep+Directx ,Ydep+Directy , Xend , Yend , valJoueur );



    }
        else
            System.out.println("fill a fini");


    }
}










