import java.util.ArrayList;
import java.util.List;



// list (xpla , ypla , xdep ydep , nbrjetonrt)
public class Methode_Bastien {

    public static void placerJeton( int x , int y , String jeton){

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
            look(x , y , 1 , -1 ,2 , 1 , 0  , x , y );
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
            look(x , y , 1 , -1 ,1 , 2 , 0  , x , y );
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

                    look(x+directionX ,y+directionY , directionX , directionY ,  what , valjoueur , compteur  , xini , yini);
                }

            }
            else {
                if(Menu.tabint[y+ directionY][x+ directionX] == valjoueur){
                    fill(xini , yini , x  , y , valjoueur);
                }
                else if (Menu.tabint[y+ directionY][x+ directionX] == what){
                    compteur++ ;
                    look(x+directionX ,y+directionY , directionX , directionY ,  what , valjoueur , compteur ,  xini ,yini );
                }
            }



        }catch (Exception e){



        }

    }



    public static void fill(int Xdep , int Ydep ,int Xend , int Yend , int valJoueur) {
        int Directx = (  Xend -Xdep );
        int Directy = (  Yend -Ydep) ;
        if (Directx < 0 )
            Directx = -1 ;
        else if (Directx > 0 )
            Directx = 1 ;

        if (Directy < 0 )
            Directy = -1 ;
        else if (Directy > 0 )
            Directy = 1 ;


        if (Xdep != Xend || Ydep != Yend ){
            Menu.tabint[Ydep +Directy][Xdep +Directx] = valJoueur ;
            fill(Xdep+Directx ,Ydep+Directy , Xend , Yend , valJoueur );
        }
    }
}









