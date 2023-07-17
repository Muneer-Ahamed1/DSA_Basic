import java.io.*;
import java.util.*;

public class Solution01 {


    static void spiralMatrix(int[][] arr,int r,int c) {
        int count=0;
        int r1=0;
        int r2=r-1;
        int c1=0;
        int c2=c-1;
        try{
        while(true) {
            count%=2;
            if(count==0) {
                for(int i=r1,j=c1;j<=c2;j++) {
                    System.out.print(arr[i][j]);
                }
                ++count;
                r1++;
            }
            if(count==1) {
                for(int i=r1,j=c2;i<=r2;i++) {
                    System.out.print(arr[i][j]);
                }
                count++;
                c2--;
            }
            if(count==2) {
                for(int j=c2,i=r2;j>=c1;j--) {
                    System.out.print(arr[i][j]);
                }
                count++;
                r2--;
            }
            if(count==3) {
                for(int i=r2,j=c1;i>=r1;i--) {
                    System.out.print(arr[i][j]);
                }
                count++;
                c1++;

            }
        }


    }
    catch (Exception e) {
        return;}
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        spiralMatrix(arr,r,c);
    }
}