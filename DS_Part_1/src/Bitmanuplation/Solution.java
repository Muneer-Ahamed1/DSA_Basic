package Bitmanuplation;

import java.util.Scanner;

public class Solution {
    static final int MAX = 1000;


    static int goodCell(int v[][])
    {
        int r=v.length;
        int c=v[0].length;
        int r_xor, c_xor;
        int max_xor = 0;

        for (int i = 0 ; i < r ; i++)
        {
            r_xor = 0; c_xor = 0;

            for (int j = 0 ; j < c ; j++)
            {
                // xor row element
                r_xor = r_xor^v[i][j];
                c_xor = c_xor^v[j][i];
            }
           max_xor+=r_xor+c_xor;
        }
        return max_xor;
    }

    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println(goodCell(arr));
    }
}
