package Dynamic_Programming;

import java.io.*;
import java.util.*;

class Main2 {

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
        int[] dp=new int[total+1];
        dp[0]=0;
        for(int i=1;i<=total;i++) {
            int max=0;

            for(int j=0;j<n;j++) {

                if(i>=weight[j]) {
                    int sum=cost[j]+dp[i-weight[j]];
                    if(max<=sum) {
                        max=sum;
                    }
                    //  System.out.println(max);
                }
            }
            dp[i]=max;
        }
        System.out.println(dp[total]);

    }
}