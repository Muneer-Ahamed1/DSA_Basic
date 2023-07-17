package linear_ds;

import java.util.Scanner;

public class Exchange_coin {




    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        if(n>=0 && n<=1000000000) {
            sum=(int) n/2+n/3+n/4;
        }
        System.out.println(sum);
    }



}
