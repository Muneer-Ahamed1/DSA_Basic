package Recursion;

import java.io.*;
import java.util.*;

class Man {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        //System.out.println("ARRAY");
        displayArr(arr,n-1);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx<0) {
            return;
        }
        displayArr(arr,idx-1);
        System.out.println(arr[idx]);

    }

}