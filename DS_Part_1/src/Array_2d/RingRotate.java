package Array_2d;

import java.util.Scanner;

public class RingRotate {
    static int[] fillthearr(int[] []arr ,int shell,int rotate) {
        int r1=shell-1;
        int c1=shell-1;
        int r2=arr.length-shell;
        int c2=arr[0].length-shell;
        int len=2*(r2-r1)+2*(c2-c1);
        int[] ans=new int[len];

        int count=0;
        int k=0;
        while(k<len) {
            if (count % 2 == 0) {
                for (int i = r1; i <= r2; i++) {
                    ans[k++] = arr[i][c1];
                }
                c1++;
                count++;
            }
            else if(count%2==1) {
                for(int i=c1;i<=c2;i++) {
                    ans[k++]=arr[r2][i];
                }
                r2--;
                count++;
            }
            else if(count%2==2) {
                System.out.println(r2+"SSCC");
                for(int i=r2;i>=r1;i--) {
                    System.out.println(arr[i][c2]+"SDSDS");
                    ans[k++]=arr[i][c2];
                }
                c2--;
                count++;
            }
            else if(count%2==3) {
                for(int i=c2;i>=c1;i--) {
                    ans[k++]=arr[i][c2];
                }
                count++;
            }
        }
        for(int i:ans) {
            System.out.println(i+" ");
        }
        rotate(ans,0,ans.length-rotate-1);
        rotate(ans,ans.length-rotate,ans.length-1);
        rotate(ans,0,ans.length-1);

        return ans;
    }
    static void fillarr(int[] ans,int[][]arr,int shell)
    {

        int r1=shell-1;
        int c1=shell-1;
        int r2=arr.length-shell;
        int c2=arr[0].length-shell;
        int len=ans.length;

        int count=0;
        int k=0;
        while(k<len) {
            if (count % 2 == 0) {
                for (int i = r1; i <= r2; i++) {
                    arr[i][c1]=ans[k++];
                }
                c1++;
                count++;
            }
            else if(count%2==1) {
                for(int i=c1;i<=c2;i++) {
                    arr[r2][i]=ans[k++];
                }
                r2--;
            }
            else if(count%2==2) {
                for(int i=r2;i>=r1;i--) {
                    arr[i][c2]=ans[k++];
                }
                c2--;
            }
            else if(count%2==3) {
                for(int i=c2;i>=c1;i--) {
                    arr[i][c2]=ans[k++];
                }
            }

        }
    }
    static  void rotate(int[] ans,int i,int j) {
        while(i<j) {
            int k=ans[i];
            ans[i]=ans[j];
            ans[j]=k;
        }
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
        int shell=s.nextInt();
        int rotate=s.nextInt();
        display(arr);

        int[] ans=fillthearr(arr,shell,rotate);
        fillarr(ans,arr,shell);
        display(arr);

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



}
