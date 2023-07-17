package Recursion;

import java.io.*;
import java.util.*;

 class KPC{

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(getKPC(str));

    }
    static String[] code = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};


    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0) {
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }

        //condition...
        char c=str.charAt(0);
        String strig=str.substring(1);
        ArrayList<String> arr=getKPC(strig);
        int num=Integer.valueOf(String.valueOf(c));
        ArrayList<String> ans=new ArrayList<>();
        String string=code[num];
        for(int i=0;i<string.length();i++) {
            for(String j:arr) {
                ans.add(string.charAt(i)+j);
            }
        }
        return ans;


    }

}