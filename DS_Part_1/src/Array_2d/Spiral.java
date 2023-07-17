package Array_2d;

import java.util.Scanner;

public class Spiral {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        int r2 = s.nextInt();
        int c2 = s.nextInt();
        int[][] arr = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<r2;i++) {
            for(int j=0;j<c2;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int count=0;
        int count1=0;
        int size=(r2*c2)-1;
        int r1=0;
        int c1=0;
        r2=r2-1;
        c2=c2-1;

        while(count1<=size) {
            if (count % 4 == 0) {
                int i = r1;
                for (; i <= r2; i++) {
                    System.out.println(arr[i][c1]);
                    count1++;

                }
                count++;
                //r2--;
                c1++;
            } else if (count % 4 == 1) {
                int i=c1;

                for (; i <= c2; i++) {
                    System.out.println(arr[r2][i]);
                    count1++;
                }
                count++;
                r2--;
            }
            else if (count % 4 == 2) {
                for (int i = r2; i >= r1; i--) {
                    System.out.println(arr[i][c2] );
                    count1++;

                }
                count++;
                c2--;
            }
        else  if(count%4==3) {
            int i=c2;
            for(;i>=c1;i--) {
                System.out.println(arr[r1][i]);
                count1++;

            }
            count++;
            r1++;
            }

        //System.out.print(count);

        }

System.out.println("Count="+count);










    }
}
