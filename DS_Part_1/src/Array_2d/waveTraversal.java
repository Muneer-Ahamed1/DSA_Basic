package Array_2d;

import java.io.*;
import java.util.*;

 class Code2{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < c; i++) {
            int j;
            if (i % 2 == 0) {
                j = 0;
                for(;j<r;j++) {
                    System.out.println(arr[j][i]+" ");
                }
            } else {
                j = r - 1;
                for(;j>=0;j--) {
                    System.out.println(arr[j][i]+" ");
                }
            }

            //System.out.println();

        }
    }
}