package inftq;

import java.util.*;

public class odd_subarray {

    static void num(int[] arr ) {
        int[][][] array=new int[arr.length][arr.length][arr.length];
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                for(int k=i;k<=j ;k++) {
                    array[i][j][k]=arr[k];

                }
            }
        }
        display(array);
    }
    static void display(int[][][] arr) {
        int sum;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<arr[0][0].length;i++) {
            for(int j=0;j<arr[0][0].length;j++) {
               sum=0;
                for(int k=0;k<arr[0][0].length ;k++) {
                    System.out.print(arr[i][j][k]);

                    //arrayList.addAll();

                }
                if(sum%2!=0) {


                }
                System.out.print(" ");
            }
            Queue<Integer> q=new PriorityQueue<>();

            System.out.println();
        }
    }
double d=123311;


    public static void main(String arg[]) {
        Object[] arr={1,2,3,4,5};
        Arrays.sort(arr,2,5,Collections.reverseOrder());


    }





}
