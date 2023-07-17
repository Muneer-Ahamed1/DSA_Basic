package BinarySearch;

import java.util.Scanner;

public class Square_root {
    static int leftside(int n){
        int s=0;
        int e=n;
        int mid=(s+e)/2;
        int ans=0;
        while (s<=e) {
            if(mid*mid==n) {
                return mid;
            }
            else if(mid*mid>n) {
                e=mid-1;
            }
            else {
                ans=mid;
                s=mid+1;
            }
            mid=(s+e)/2;
        }
        return ans;
    }
    static double rightside(int m,int n) {
        double ans=m;
        double  d=1;
        for(int i=0;i<3;i++) {
            d=d/10.0;

            for(double j=ans;j*j<n;j=j+d) {
                ans=j;
                System.out.println(ans+"+"+d);
            }

        }
        return ans;
    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER=");
        int n=s.nextInt();
        int left=leftside(n);
        double right=rightside(left,n);
        System.out.print(right+"left"+left);
    }
}
