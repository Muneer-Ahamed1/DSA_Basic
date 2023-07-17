package sorting;

import java.util.Scanner;

public class buble_sort {

    static void sort(int[] arr) {
        display(arr);
        for(int i=0;i< arr.length;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println("SORTED___BUBBLE");
        display(arr);
    }
    //time_complexity:o(n^2)..............

    static void display(int[] arr) {
        for(int i:arr) {
            System.out.println(i+" ");
        }
    }
    static void swap(int[] arr,int i,int j) {
        int c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }













    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        sort(arr);
    }
}
