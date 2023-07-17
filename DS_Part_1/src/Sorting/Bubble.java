package Sorting;

import java.util.Scanner;

public class Bubble {
    /**Element are sorted..
    two elements are compared..
     sorted to right(max) or left(min)
    * */
    public static int[] bubble(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(isSmaller(arr,j,j+1)) {
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    public static boolean isSmaller(int[] arr,int i,int j) {
        return (arr[i]>arr[j])?true:false;
    }
    public static void swap(int[] arr,int i,int j) {
        int swap=arr[i];
        arr[i]=arr[j];
        arr[j]=swap;
    }
    public static void main(String arg[]){
        int[] arr=new int[6];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<6;i++) {

                arr[i]=s.nextInt();

        }
        for(int i:bubble(arr)) {
            System.out.print(i+" ");
        }
    }
}
