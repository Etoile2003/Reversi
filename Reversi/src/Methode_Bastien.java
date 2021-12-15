import java.util.ArrayList;
import java.util.List;

public class Methode_Bastien {

    public static void placerJeton(List<Integer> Listco , int x , int y , String jeton){

        int poid =  Listco.size() ;
        boolean canPlace = false ;

        for (int i = 0; i < poid; i = i + 3) {

            if (x == Listco.get(i) && y == Listco.get(i+1)){
                canPlace = true ;
            }
        }
        if (canPlace){
            System.out.println("jeton placé");
            Menu.plateau[x][y] = jeton ;
            Game.rejouer = false ;
        }
        else {
            System.out.println("imposibled de jouer ici ");
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