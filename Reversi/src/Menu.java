import java.util.ArrayList;
import java.util.List;
public class Menu {


    public static String[][]plateau=
            {{".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".","."},
            {".","X",".",".",".",".",".","."},
            {".",".",".","⬢","⬡",".",".","."},
            {".",".",".","⬡","⬢",".",".","."},
            {".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".","."},
            {".",".",".",".",".",".",".","."}
    };

    public static void lancementJeu(){


        for (int i = 0; i <Methode_Main.listDesCoJouables(plateau,1).size(); i++) {

                System.out.print(Methode_Main.listDesCoJouables(plateau,1).get(i));



        }

    }
}
