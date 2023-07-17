package Arrays_1d;

import java.io.*;
import java.util.*;

class code01{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        int max=0;
        int min=99;
        for(int i:arr) {
            if(i>max) {
                max=i;
            }
            if(min>i) {
                min=i;
            }
        }
        System.out.print(max-min);

    }

}