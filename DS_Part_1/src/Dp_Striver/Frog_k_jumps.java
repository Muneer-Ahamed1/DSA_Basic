package Dp_Striver;

import java.util.Arrays;

public class Frog_k_jumps {


    public int sol(int[] arr,int n,int k,int[] dp) {
        if(n==0) {
            return 0;
        }
        int min=0;
        int max=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++) {
            //k=3
            if(dp[i]!=-1) {
                return dp[i];
            }
            if(n-i>=0) {
                min=sol(arr, n - i, k, dp)+Math.abs(arr[n]-arr[n-i]);
            }
            max=Math.min(min,max);
        }
return dp[n]=max;





    }
    public int minimizeCost(int arr[],int N,int K){
        //code here
        int[] dp=new int[N];
        Arrays.fill(dp,-1);
        return sol(arr,N-1,K,dp);
    }
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int[] arr={10, 30, 40, 50, 20};
        Frog_k_jumps fg=new Frog_k_jumps();
        System.out.println(fg.minimizeCost(arr,n,k));
    }




}
