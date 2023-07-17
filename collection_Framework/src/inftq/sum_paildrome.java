package inftq;

import java.util.Scanner;

public class sum_paildrome {
    static void num(String str) {
        StringBuilder string=new StringBuilder(str);
        string=string.reverse();
        int i=Integer.parseInt(str)+Integer.parseInt( string.toString());
        System.out.println(i);
        if(isPalidrome(String.valueOf(i))) {
            System.out.println(String.valueOf(i));
            return;
        }
        num(String.valueOf(i));

    }
    static boolean isPalidrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i<j) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }





    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        num(s.next());
    }



}
