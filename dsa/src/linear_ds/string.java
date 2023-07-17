package linear_ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class string {
    static int count(String str) {
        int count=0;
        for(int i=0;i<str.length();i++) {
            for(int j=i;j<=str.length();j++) {
                String string=str.substring(i,j);
                if(bool(string)&&string.length()>0) {

                    count+=1;
                }
            }
        }
        return count;
    }
    static boolean bool(String str) {
        ArrayList<Character> arr=new ArrayList<>();
        //ArrayList
        for(int i=0;i<str.length();i++) {
            arr.add(str.charAt(i));
        }
        if(arr.contains(Character.valueOf('a'))) {


            if (arr.contains(Character.valueOf('b'))) {


                if (arr.contains(Character.valueOf('c'))) {
                    return false;

                }
            }
        }
        return true;
    }




    public static void main(String[] arg) {
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
    System.out.println(count(str));
    }

}
