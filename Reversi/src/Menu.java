import java.util.ArrayList;
import java.util.List;
public class Menu {
//⬢⬡

    public static String[][]plateau=
            {{".",".",".",".",".",".",".","."},
             {".",".",".",".",".",".",".","."},
             {".",".",".",".",".",".",".","."},
             {".",".",".","⬡","⬢",".",".","."},
             {".",".",".","⬢","⬡",".",".","."},
             {".",".",".",".",".",".",".","."},
             {".",".",".",".",".",".",".","."},
             {".",".",".",".",".",".",".","."}};

    public static void lancementJeu(){


        for (int i = 0; i <Methode_Main.listDesCoJouablesFct(plateau,1).size(); i++) {

                System.out.print(Methode_Main.listDesCoJouablesFct(plateau,1).get(i));



        }

    }
}
