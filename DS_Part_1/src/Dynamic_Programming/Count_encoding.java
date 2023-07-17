package Dynamic_Programming;

import java.io.*;
import java.util.*;

 class Main6 {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int[] dp=new int[str.length()];
        dp[0]=1;
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i-1)==0 && str.charAt(i)==0) {
                dp[i]=0;
            }
            else if(str.charAt(i-1)==0 && str.charAt(i)!=0) {
                dp[i]=dp[i-1];
            }
            else if(str.charAt(i-1)!=0 && str.charAt(i)==0) {
                if(str.charAt(i-1)=='1' || str.charAt(i-1)=='2') {
                    dp[i]=(i<2)?1:dp[i-2];
                }
            }
            else{
                if(Integer.parseInt(str.substring(i-1,i+1))<=26) {
                    int sum=(i<2)?1:dp[i-2];
                    dp[i]=dp[i-1]+sum;
                }
                else{
                    dp[i]=dp[i-1];
                }
            }
        }
        System.out.println(dp[str.length()-1]);

    }
}
