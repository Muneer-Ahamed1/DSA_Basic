package Recursion;

import java.io.*;
import java.util.*;

 class in {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner (System.in);
        System.out.println(getMazePaths(1,1,s.nextInt(),s.nextInt()));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc) {
            ArrayList<String> arr=new ArrayList<>();
            arr.add("");
            return arr;
        }

        ArrayList<String> ans=new ArrayList<>();
        //coditions...
        //horizontal..
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> path=getMazePaths(sr,sc+i,dr,dc);
            for(String p:path) {
                ans.add("h"+i+p);
            }
        }
        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> path=getMazePaths(sr+i,sc,dr,dc);
            for(String p:path) {
                ans.add("v"+i+p);
            }
        }

        for(int i=1;i<=dc-sc && i<=dr-sr;i++){
            ArrayList<String> path=getMazePaths(sr+i,sc+i,dr,dc);
            for(String p:path) {
                ans.add("d"+i+p);
            }
        }

        return ans;
    }

}