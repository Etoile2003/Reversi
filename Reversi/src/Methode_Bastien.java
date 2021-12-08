import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;



public class Methode_Bastien implements NativeKeyListener {

    public static boolean canPlay = false ;
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
        System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(input.getKeyCode()));
        if (canPlay){
            switch (touche){


                case "z" :




                    break;

                case "q":



                    break;

                case "s" :




                    break;

                case "d":
                    break;
            }
        }





    }
}
