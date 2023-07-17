package Dp_Striver;

import java.util.Arrays;
import java.util.Scanner;

public class sum_nonadj_subseq {
    int sol(int[] arr,int n,int[] dp) {
        if(n<0) {
            return 0;
        }

        if(n==0) {
            return arr[n];
        }

        if(dp[n]!=-1) {
            return dp[n];
        }
        int x=sol(arr,n-2,dp)+arr[n];
        int y=sol(arr,n-1,dp)+0;
        dp[n]=Math.max(x,y);
        return dp[n];

    }
    int findMaxSum(int arr[], int n) {
        // code here
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        n=dp.length-1;
        return sol(arr,n,dp);

    }
    int tab(int[] arr,int n) {
        int[] dp=new int[n];
        n=n-1;
        dp[0]=arr[0];
        for(int i=1;i<=n;i++) {
            int x=arr[i]+dp[n-2];
            int y=dp[n-1];
            dp[i]=Math.max(x,y);

        }
        return dp[n];
    }

    public static void main(String args[]) {
         sum_nonadj_subseq ac=new sum_nonadj_subseq();
        int N = 6;
        int Arr[] = {5, 5, 10, 100, 10, 5};

         System.out.println(ac.findMaxSum(Arr,N));
    }







}
