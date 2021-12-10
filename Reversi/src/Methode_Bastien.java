import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;



public class Methode_Bastien implements NativeKeyListener {

    public static boolean canPlay = true ;
    public static String touche = "n"  ;

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
         touche = NativeKeyEvent.getKeyText(input.getKeyCode());
         int[] pos = whereCursor(Menu.plateau) ;
        System.out.println();
        System.out.println("je suis en x" + pos[0]);
        System.out.println("je suis en y" + pos[1]);
        System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(input.getKeyCode()));
        if (canPlay){
            switch (touche){


                case "A" :
                try {

                    Menu.plateau[pos[1]][pos[0] - 1] = "X";
                    Menu.plateau[pos[1]][pos[0]] = ".";
                }catch (Exception e){

                }

                    break;

                case "W":
                try{

                    Menu.plateau[pos[1]-1][pos[0]] = "X";
                    Menu.plateau[pos[1]][pos[0]] = ".";
                }catch (Exception e){

                }




                    break;

                case "D" :
                try {

                    Menu.plateau[pos[1]][pos[0]+1] = "X";
                    Menu.plateau[pos[1]] [pos[0]]= ".";
                }catch (Exception e){

                }




                    break;

                case "S":

                    try {

                        Menu.plateau[pos[1]+1][pos[0]] = "X";
                        Menu.plateau[pos[1]][pos[0]] = ".";
                    }catch (Exception e){

                    }


                    break;

                case "Entrée" :
                    canPlay = false  ;
                    int[] playHere = whereCursor(Menu.plateau) ;
                    System.out.println("i play here ");
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
