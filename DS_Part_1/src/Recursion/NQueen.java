package Recursion;

import java.io.*;
import java.util.*;

 public class NQueen {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] chess=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                chess[i][j]=0;
            }
        }
        printNQueens(chess,"",0);

    }
    public static boolean queenCol(int row,int[][] chess,int col) {

        for(int i=row-1;i>=0;i--) {
            if(chess[i][col]==1) {
                return false;
            }
        }
        return true;
    }
    public static boolean queenDiagonal(int[][] chess,int row,int col) {
        for(int i=row-1,j=col-1;i>=0 && j>=0;j--,i--) {
            if(chess[i][j]==1) {
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<chess[0].length;i--,j++) {
            if(chess[i][j]==1) {
                return false;
            }
        }
        return true;
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length) {
            System.out.println(qsf);
            return;
        }

        for(int j=0;j<chess[0].length;j++) {
            if(chess[row][j]==0 &&queenCol(row,chess,j) && queenDiagonal(chess,row,j)) {
                chess[row][j]=1;
                //System.out.println(qsf+""+row);
                printNQueens(chess,qsf+row+j+",",row+1);
                chess[row][j]=0;
            }
        }
        return;
    }
}