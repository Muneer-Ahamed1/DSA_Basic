package Array_2d;

import java.util.Scanner;

public class Transpose_MAtrix {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int[][] arr2=new int[c][r];
        for(int i=0;i<c;i++) {
            for(int j=0;j<r;j++) {
                arr2[i][j]=arr[j][i];
            }
        }
        System.out.println("Matrix");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }














    }
}
