package Array_2d;

import java.util.Scanner;

public class Diagonalised_array {
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=r;
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j]=s.nextInt();
            }
        }

        //Dioganised...
        int num=0;
        r=r-1;
        c=c-1;
        for(int i=0;i<arr.length;i++) {
            for(int j=0,k=num;j<=r && k<=c;j++ ,k++) {
                System.out.println(arr[j][k]);
            }
            r--;
            num++;
        }
    }
}
