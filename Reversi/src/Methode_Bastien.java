import java.util.ArrayList;
import java.util.List;

public class Methode_Bastien {

    public static void placerJeton(List[] Listco , int x , int y , String jeton){

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
            retournerjeton(Listco[0] , Listco[1] ,Listco[2],  x , y , jeton);
        }
        else {
            System.out.println("impossible jouer ici ");
        }

    }




    public static void retournerjeton(List<Integer> coDepart , List<Integer> coArrive ,  List<Integer> nbrJeton ,int x , int y ,  String jeton ){

        //faire une troisieme list qui conyien seulement le nombre de jeton retourné
        System.out.println("max "+coArrive.size());
        System.out.println("maxdepart "+coDepart.size());

        for (int val:coDepart
             ) {
            System.out.println(val);
        }
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
                for (int j = 0; j < nbrJeton.get(i); j++) {



                    Menu.plateau[xDebut + incrementX][yDebut+incrementY] = jeton ;



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


            }


        }

    }

}















































































































/*import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;



public class Methode_Bastien implements NativeKeyListener {

    public static boolean canPlay = true ;
    public static String caseSave = "."  ;
    public static String touche = " "  ;

    public static void keyListener() {
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (NativeHookException ex) {
            System.err.println("BUG getinput");
            System.exit(1);
        }
        GlobalScreen.addNativeKeyListener(new Methode_Bastien());
    }

    // Detection de la touche pressee + mouvement du joueur
    public void nativeKeyPressed(NativeKeyEvent input) {
        String touche = NativeKeyEvent.getKeyText(input.getKeyCode());
         int[] pos = whereCursor(Menu.plateau) ;
        System.out.println();
        System.out.println("je suis en x" + pos[0]);
        System.out.println("je suis en y" + pos[1]);
        System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(input.getKeyCode()));

        if (canPlay){
            switch (touche){


                case "A" :
                try {
                    if (Menu.plateau[pos[1]][pos[0] - 1] != "#"){
                        Menu.plateau[pos[1]][pos[0]] = caseSave;
                        caseSave = Menu.plateau[pos[1]][pos[0] - 1] ;
                        Menu.plateau[pos[1]][pos[0] - 1] = "X";
                    }


                }catch (Exception e){

                }

                    break;

                case "W":
                try{
                    if (Menu.plateau[pos[1]-1][pos[0]] != "#"){
                        Menu.plateau[pos[1]][pos[0]] = caseSave;
                        caseSave =Menu.plateau[pos[1]-1][pos[0]] ;
                        Menu.plateau[pos[1]-1][pos[0]] = "X";
                    }


                }catch (Exception e){

                }




                    break;

                case "D" :
                try {
                    if (Menu.plateau[pos[1]][pos[0]+1]  != "#"){
                        Menu.plateau[pos[1]] [pos[0]]= caseSave;
                        caseSave = Menu.plateau[pos[1]][pos[0]+1] ;
                        Menu.plateau[pos[1]][pos[0]+1] = "X";
                    }


                }catch (Exception e){

                }




                    break;

                case "S":

                    try {

                        if (Menu.plateau[pos[1]+1][pos[0]] != "#"){
                            Menu.plateau[pos[1]][pos[0]] = caseSave;
                            caseSave = Menu.plateau[pos[1]+1][pos[0]] ;
                            Menu.plateau[pos[1]+1][pos[0]] = "X";

                        }


                    }catch (Exception e){

                    }


                    break;

                case "Entrée" :
                    if (caseSave.equals(".")){
                        canPlay = false  ;

                        System.out.println("i play here ");


                        canPlay = true ;
                    }
                    else {
                        System.out.println("tu ne peux pas jouer ici :/");
                    }

            }
        }
        Methode_Main.afficherTableau(Menu.plateau);




    }



    public static int[] whereCursor(String[][] tab){
        int[] result = new int[2];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j <tab[0].length; j++) {
                if (tab[i][j].equals("X")) {

                    result[1] = i;
                    result[0] = j;
                    return result;
                }
            }
        }
        return result ;
        }



}
*/