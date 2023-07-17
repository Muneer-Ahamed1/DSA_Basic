package Sorting;

import java.util.Scanner;

public class insertion {


    public static int[] insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (isSmaller(arr, j-1, j )) {
                    swap(arr, j, j - 1);

                } else {
                    break;
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
        int[] arr=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<6;i++) {

            arr[i]=s.nextInt();

        }
        for(int i:insertion(arr)) {
            System.out.print(i+" ");
        }
    }




















}
