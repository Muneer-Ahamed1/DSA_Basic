package Dp_Striver;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    static long mod=(long)(1e9)+7;
    static long fib(int n,long[] dp) {
        if(n==1 || n==0) {
            return n;
        }
        if(dp[n]!=-1) {
            return dp[n];
        }

        //base cod...
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];

    }

    static long topDown(int n) {
        long[] dp=new long[n+1];
        Arrays.fill(dp,-1);
        return fib(n,dp);


    }

    static long bottomUp(int n) {
        // code here

        if(n==1 || n==0) {
            return n;
        }
        long[] dp=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++) {
            dp[i]=dp[i-1]+dp[i-2];

        }
        return dp[n];

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print(bottomUp(sc.nextInt())+"hEllo");
        System.out.print(topDown(sc.nextInt()));
    }
}

