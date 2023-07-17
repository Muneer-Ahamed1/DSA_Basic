import java.io.*;
import java.util.*;

 class Min {

    public static void main(String[] args) throws Exception {


        Scanner s=new Scanner(System.in);
     //   int sr=s.nextInt();
      //  int sc=s.nextInt();
        int dr=s.nextInt();
        int dc=s.nextInt();
        printMazePaths(1,1,dr,dc,"");




    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr==dr && sc==dc) {
            System.out.println(psf);
            return;
        }
        if(sr<dr || sc<dc) {
            return;
        }



        printMazePaths(sr+1,sc,dr,dc,psf+"h");
        printMazePaths(sr,sc+1,dr,dc,psf+"v");


    }

}