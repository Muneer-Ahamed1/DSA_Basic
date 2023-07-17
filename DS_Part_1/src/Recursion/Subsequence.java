package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    //abc
    /*
    m=(2^n)
    str->abc
    ---
    --c
    -b-
    -bc
    a--
    a-c
    ab-
    abc
     */
    static ArrayList<String> getseq(String str) {//Recursion

        if(str.length()==0) {
            ArrayList<String> stringArrayList=new ArrayList<>();
            stringArrayList.add("");
            return stringArrayList;
        }
        //condition...
        char c=str.charAt(0);
        String string=str.substring(1);
        ArrayList<String> arrayList=getseq(string);
        ArrayList<String> ans=new ArrayList<>();
        for(String i:arrayList) {
            ans.add(""+i);
        }
        for(String i:arrayList) {
            ans.add(c+i);
        }
return ans;



    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.print(getseq(str));
    }
}
