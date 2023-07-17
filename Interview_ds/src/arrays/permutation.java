package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class permutation {





    public static ArrayList<String> permut(String str,String string) {


        if(str.length()==0 && string.length()==3) {
            ArrayList<String> arr=new ArrayList<>();
            arr.add(string);
            return arr;
        }



        //case...........
        char c=str.charAt(0);
        String sub="";
        for(int i=1;i<str.length();i++) {
            sub = str.substring(i);

            ArrayList<String> ben = permut(sub, string + c);
        }
        ArrayList<String> arr = new ArrayList<>();
      //  arr.addAll(ben);



        return arr;
    }






    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
System.out.println(permut(s.nextLine(),""));
    }







}
