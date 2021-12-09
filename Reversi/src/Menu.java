import java.util.ArrayList;
import java.util.List;
public class Menu {


    public static String[][]plateau=
            {{".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".","."},
            {".",".",".","⬢","⬡",".",".","."},
            {".",".",".","⬡","⬢",".",".","."},
            {".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".","."}
    };

    public static void lancementJeu(){

        List test = Methode_Main.listDesCoJouables(plateau,1);

        for (int i = 0; i <test.size(); i++) {
            for (int j = 0; j <(test.get(i)).lenght ; j++) {

            }
        }

    }
}
