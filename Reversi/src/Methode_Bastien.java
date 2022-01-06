import java.util.ArrayList;
import java.util.List;



// list (xpla , ypla , xdep ydep , nbrjetonrt)
public class Methode_Bastien {

    public static void placerJeton(List<List> Listco , int x , int y , String jeton){
        System.out.println("X " + x);
        System.out.println("Y "+ y );
        int poid =  Listco.size() ;
        boolean canPlace = false ;


        for (int i = 0; i < poid; i = i + 1) {
            List<Integer> Listeplacement =  Listco.get(i) ;

            if (x == Listeplacement.get(0) && y == Listeplacement.get(2)){
                canPlace = true ;

            }


        }
        if (canPlace){
            System.out.println("jeton placé");
            Menu.plateau[x][y] = jeton ;
            Game.rejouer = false ;
            retournerjeton( Listco , x , y , jeton);
        }
        else {
            System.out.println("impossible jouer ici ");
        }

    }




    public static void retournerjeton(List<List> allco, int x , int y ,  String jeton ){

        //faire une troisieme list qui contien seulement le nombre de jeton retourné


//        System.out.println("max "+coArrive.size());
//        System.out.println("maxdepart "+coDepart.size());
//        System.out.println("nbrJeton "+nbrJeton.size());
        for (int i = 0; allco.size() > i; i = i + 1) {
            List<Integer> Listeplacement =  allco.get(i) ;
            if (Listeplacement.get(0) == x && Listeplacement.get(1) == y){

                int xDebut = Listeplacement.get(0);
                int yDebut = Listeplacement.get(1);



                int diffX =  Listeplacement.get(2) - xDebut ;
                int diffY = Listeplacement.get(3) - yDebut ;

                System.out.println("diffX "+diffX);
                System.out.println("DiffY "+diffY);
                int incrementX ;
                int incrementY ;
                if(diffX > 0 )
                    incrementX = 1 ;
                else if ( diffX< 0 )
                    incrementX = -1 ;
                else
                    incrementX = 0 ;



                if(diffY > 0 )
                    incrementY = 1 ;
                else if ( diffY< 0 )
                    incrementY = -1 ;
                else
                    incrementY = 0 ;


                for (int j = 0; j < Listeplacement.get(4) ; j++) {


                    System.out.println("x " + (xDebut + incrementX));
                    System.out.println("y " + (yDebut + incrementY));
                    Menu.plateau[xDebut + incrementX][yDebut + incrementY] = jeton;


                    if(diffX > 0 )
                        incrementX = incrementX + 1 ;
                    else if ( diffX< 0 )
                        incrementX = incrementX -1 ;
                    else
                        incrementX = 0 ;



                    if(diffY > 0 )
                        incrementY = incrementY + 1 ;
                    else if ( diffY< 0 )
                        incrementY = incrementY -1 ;
                    else
                        incrementY = 0 ;



                }

                break;
            }


        }

    }

}



















