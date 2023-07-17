package Array_2d;

import java.util.Scanner;

public class ExistMatrix {

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
        /*for(int i=0;i<r2;i++) {
            for(int j=0;j<c2;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        int count=0;
        int c1=0;
        int r1=0;

        while(true) {
            if(count%4==0) {
                for(;c1<c2;c1++) {
                    if(arr[r1][c1]==1) {
                        count+=1;
                        r1++;
                        break;
                    }
                }
                if(c1==c2) {
                    System.out.print(r1);
                    System.out.print(--c1);
                    return;
                }
            }
            if(count%4==1) {
                for(;r1<r2;r1++) {
                    if(arr[r1][c1]==1) {
                        count+=1;
                        c1--;
                        break;
                    }
                }
                if(r2==r1) {
                    System.out.print(--r1);
                    System.out.print(c1);
                    return;
                }
            }
            else if(count%4==2) {
                for(;c1>=0;c1--) {
                    if(arr[r1][c1]==1) {
                        count+=1;
                        r1--;
                        break;
                    }
                }
                if(c1==-1) {
                    System.out.print(r1);
                    System.out.print(++c1);
                    return;
                }
            }
            else if(count%4==3) {
                for(;r1>=0;r1--) {
                    if(arr[r1][c1]==1) {
                        count+=1;
                        c1++;
                        break;
                    }
                }
                if(r1==-1) {
                    System.out.println(++r1);
                    System.out.println(c1);
                    return;
                }
            }
        }
    }
}
