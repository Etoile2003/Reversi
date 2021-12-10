import java.util.ArrayList;
import java.util.List;

public class Methode_Main {
    public static void afficherTableau(String[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static List listDesCoJouables(String[][] tab, int joueur) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[1].length; j++) {
                if (joueur == 1) {
                    if (tab[i][j].equals("⬡")) {
                        int compteur;
                        int[]cojouable=new int[3];
                        System.out.println("x"+i);
                        System.out.println("y"+j);
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,-1,-1,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,-1,1,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,1,-1,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,1,1,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,0,-1,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,0,1,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,-1,0,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                        cojouable[0]=-1;
                        cojouable[1]=-1;
                        cojouable[2]=-1;
                        compteur=0;
                        verifjouable(Menu.plateau,i,j,1,0,compteur,"⬢",cojouable);
                        for (int k = 0; k <cojouable.length ; k++) {
                            System.out.println(cojouable[k]);
                        }
                    }

                }


            }
        }

        return myArrayList;
    }
    public static void verifjouable(String[][]tab,int pionsX,int pionsY,int modx,int mody,int compteur,String pion,int[]coPositionJouable){
        int newPosX=pionsX+modx,newposY=pionsY+mody;
        if (tab[newPosX][newposY].equals(pion)){
            compteur++;
            verifjouable(tab,newPosX,newposY,modx,mody,compteur,pion,coPositionJouable);
        }
        else if (tab[newPosX][newposY].equals(".")&&compteur>=1){
            coPositionJouable[0]=newPosX;
            coPositionJouable[1]=newposY;
            coPositionJouable[2]=compteur;
        }
    }
}

