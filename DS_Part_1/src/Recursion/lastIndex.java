package Recursion;

import java.io.*;
import java.util.*;

 class Mi {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(lastIndex(arr,0,s.nextInt()));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length) {
            return -1;
        }
        //System.out.println(idx);
        if(arr[idx]==x) {
            return idx;
        }
        int index=lastIndex(arr,idx+1,x);
        //System.out.print(idx);

        return index;
    }

}