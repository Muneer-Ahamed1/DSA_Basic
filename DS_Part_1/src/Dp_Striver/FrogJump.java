package Dp_Striver;


import java.util.Arrays;

public class FrogJump{
    public int minimumEnergy(int arr[],int N){
        //code here
        int[] dp=new int[N];
        dp[0]=0;
        for(int i=1;i<N;i++) {
            int x=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            int y=Integer.MAX_VALUE;
            if(i>1) {
                y=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(x,y);
            System.out.println(dp[i]);
        }
        return dp[N-1];
    }
    public static void main(String args[]) {
      FrogJump fg=new FrogJump();
      int[] arr={10,50,10};
      System.out.println(fg.minimumEnergy(arr,3));
    }
}