package Dynamic_Programming;
import java.io.*;
import java.util.*;

 class gold {

     public static void main(String[] args) throws Exception {
         // write your code here
         Scanner s = new Scanner(System.in);
         int r = s.nextInt();
         int c = s.nextInt();
         int[][] arr = new int[r][c];
         int[][] dp = new int[r][c];
         for (int i = 0; i < r; i++) {
             for (int j = 0; j < c; j++) {
                 arr[i][j] = s.nextInt();
             }
         }
         for (int j = c - 1; j >= 0; j--) {
             for (int i = r - 1; i >= 0; i--) {
                 if (j == c - 1) {
                     dp[i][j] = arr[i][j];
                 } else if (i == 0) {
                     dp[i][j] = Math.max(dp[i][j+1], dp[i + 1][j + 1]) + arr[i][j];
                 } else if (i == r - 1) {
                     dp[i][j] = Math.max(dp[i][j+1], dp[i - 1][j + 1])+arr[i][j];
                 } else {
                     int max = Math.max(dp[i][j+1], dp[i - 1][j + 1]);
                     dp[i][j] = Math.max(max, dp[i + 1][j + 1]) + arr[i][j];
                 }
             }
         }
         int max=Integer.MIN_VALUE;
         for(int i=0;i<r;i++) {

             max=Math.max(dp[i][0],max);

     }
         System.out.print(max);
 }

            }