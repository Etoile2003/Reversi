import java.util.ArrayList;
import java.util.List;

public class Methode_Bastien {

    public static void placerJeton(List[] Listco , int x , int y , String jeton){
        System.out.println("X " + x);
        System.out.println("Y "+ y );
        int poid =  Listco[1].size() ;
        boolean canPlace = false ;
        List<Integer> listco1 = Listco[1] ;

        for (int i = 0; i < poid; i = i + 2) {

            if (x == listco1.get(i) && y == listco1.get(i+1)){
                canPlace = true ;
            }
        }
        if (canPlace){
            System.out.println("jeton placé");
            Menu.plateau[x][y] = jeton ;
            Game.rejouer = false ;
            retournerjeton(Listco[0] , Listco[1] , Listco[2],  x , y , jeton);
        }
        else {
            System.out.println("impossible jouer ici ");
        }

    }




    public static void retournerjeton(List<Integer> coDepart , List<Integer> coArrive , List<Integer> nbrJeton, int x , int y ,  String jeton ){

        //faire une troisieme list qui conyien seulement le nombre de jeton retourné
        System.out.println("max "+coArrive.size());
        System.out.println("maxdepart "+coDepart.size());
        System.out.println("nbrJeton "+nbrJeton.size());
        for (int i = 0; coArrive.size() > i; i = i + 2) {

            if (coArrive.get(i) == x && coArrive.get(i+1) == y){

                int xDebut = coDepart.get(i) ;
                int yDebut = coDepart.get(i+1);



                int diffX =  coArrive.get(i) - xDebut ;
                int diffY = coArrive.get(i+1) - yDebut ;

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


                for (int j = 0; j < nbrJeton.get(i) ; j++) {


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



















