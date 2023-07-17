package Array_2d;

import java.util.Scanner;

public class Matrix_90 {

    public static void main(String arg[]) {

        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c =r;
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        //Transpose..
        int[][] arr2=new int[c][r];
        for(int i=0;i<c;i++) {
            for(int j=0;j<r;j++) {
                arr2[i][j]=arr[j][i];
            }
        }
        //reverse column
        for(int i=0;i<r;i++) {
            for(int j=c-1,k=0;j>k;k++,j--) {
                int temp=arr2[i][j];
                arr2[i][j]=arr2[i][k];
                arr2[i][k]=temp;
            }
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
