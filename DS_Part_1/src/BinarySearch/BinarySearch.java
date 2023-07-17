package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr,int search) {
        int s=0;
        int e= arr.length-1;
        int mid=(s+e)/2;
        while(s<=e) {
            if(arr[mid]==search) {
                return mid;
            }
            else if(arr[mid]<search) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            mid=(s+e)/2;
        }
        return -1;
    }

    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(binarySearch(arr,5));
    }






}
