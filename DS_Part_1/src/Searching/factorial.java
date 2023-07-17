package Searching;

import java.util.Scanner;

public class factorial {


    public static int fact(int n) {
        if(n==0) {
            return 1;
        }
        int fact=fact(n-1)*n;
        return fact;
    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println(fact(s.nextInt()));
    }
}
