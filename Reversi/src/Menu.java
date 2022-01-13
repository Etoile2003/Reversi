

public class Menu {
//⬢⬡

    /*public static String[][]plateau=

            {{".",".",".",".",".",".",".","."},
                    {".",".",".",".",".",".",".","."},
                    {".",".",".",".",".",".",".","."},
                    {".",".",".","⬡","⬢",".",".","."},
                    {".",".",".","⬢","⬡",".",".","."},
                    {".",".",".",".",".",".",".","."},
                    {".",".",".",".",".",".",".","."},
                    {".",".",".",".",".",".",".","."}};*/
    public static int[][]tabint =
                    /*{{0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},          // changer la tab de string pour un tab de int
                    {0,0,0,1,2,2,1,0},          //1 => noire 2 => blanc 0 => vide -1 => case jouable
                    {0,0,0,2,2,0,2,0},
                    {0,0,0,2,1,0,0,0},
                    {0,0,0,0,2,2,1,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0}};*/


            {{0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},          // changer la tab de string pour un tab de int
                    {0,0,0,0,0,0,0,0},          //1 => noire 2 => blanc 0 => vide -1 => case jouable
                    {0,0,0,1,2,0,0,0},
                    {0,0,0,2,1,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0}};





    public static void lancementJeu(){


        for (int i = 0; i <Methode_Main.listDesCoJouablesFct(tabint,1).size(); i++) {


            System.out.print(Methode_Main.listDesCoJouablesFct(tabint,1).get(i));




        }

    }
}