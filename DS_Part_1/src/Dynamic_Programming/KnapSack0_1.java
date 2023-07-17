package Dynamic_Programming;
import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] cost=new int[n];
        for(int i=0;i<n;i++) {
            cost[i]=s.nextInt();
        }
        int[] weight=new int[n];
        for(int i=0;i<n;i++) {
            weight[i]=s.nextInt();
        }
        int total=s.nextInt();
        int[][] dp=new int[n+1][total+1];
        for(int i=0;i<=n;i++) {
            for(int j=0;j<=total;j++) {
                if(i==0 & j==0) {
                    dp[i][j]=0;
                }
                else if(i==0) {
                    dp[i][j]=0;
                }
                else if(j==0) {
                    dp[i][j]=0;
                }
                else {
                    dp[i][j]=dp[i-1][j];
                    if(weight[i-1]<=j) {
                        int index=j-weight[i-1];
                        int sum=cost[i-1]+dp[i-1][index];
                        if(sum>dp[i][j]) {
                            dp[i][j]=sum;
                        }
                    }
                }
            }
        }




    }
}