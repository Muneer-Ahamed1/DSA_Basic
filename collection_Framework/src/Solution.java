
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String rotate1(String str) {
        String[] s1=str.split(":");
        String s=s1[1];
        int sum=0;
        for(int i=0;i<s.length();i++) {
            int j=Integer.parseInt(String.valueOf(s.charAt(i)));
            double k=j;
            sum+=Math.pow(j,2.0);
        }
        StringBuilder stringBuilder=new StringBuilder(s1[0]);
        String abc="";
        if(sum%2==0) {
            char c=stringBuilder.charAt(stringBuilder.length()-1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            stringBuilder.insert(0,c);
            abc=String.valueOf(stringBuilder);
        }
        else{
            //  System.out.println(stringBuilder);
            String hm=s1[0].substring(0,2);
            stringBuilder.deleteCharAt(0);
            //System.out.println(stringBuilder);
            stringBuilder.deleteCharAt(0);
            //System.out.println(stringBuilder);
            abc=stringBuilder+hm;
        }


        return abc;




    }
    static String rotate(String str) {
        String[] s1=str.split(",");
        String string="";
        for(String i:s1) {
            String b=rotate1(i);
            string+=b;
            string+=" ";
        }
        // System.out.println(string);
        return string;

    }
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner(System.in);
        System.out.println(rotate(s.nextLine()));
    }
}