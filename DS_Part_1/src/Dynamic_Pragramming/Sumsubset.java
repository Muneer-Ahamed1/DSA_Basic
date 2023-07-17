package Dynamic_Pragramming;
import java.io.*;
import java.util.*;

class subset {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[s.nextInt()];
        for(int i=0;i<arr.length;i++) {
            arr[i]=s.nextInt();
        }
        int tar=s.nextInt();
        boolean[][] dp=new boolean[arr.length+1][tar+1];
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[0].length;j++) {
                if(i==0 && j==0) {
                    dp[i][j]=true;
                }
                else if(i==0) {
                    dp[i][j]=false;
                }
                else if(j==0) {
                    dp[i][j]=true;
                }
                else{
                    if(dp[i - 1][j]) {
                        dp[i][j]=true;
                    }
                    else{
                        int val=arr[i-1];
                        if(j>=val) {
                            if(dp[i - 1][j - val]=true) {
                                dp[i][j]=true;
                            }
                        }


                    }
                }

            }
        }
        System.out.println(dp[arr.length][tar]);

    }
}