package Stack;

import java.util.Scanner;

public class Span {
    public static void main(String arg[]) {
        //NEXT GREATER TO LEFT
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        NSL ns=new NSL();
        int[] nsl=ns.NSL(arr);
        int[] ans=new int[nsl.length];
        ans[0]=1;
        for(int i=1;i<arr.length;i++) {
            ans[i]=Math.abs(nsl[i]-i);
        }
        for(int i:ans) {
            System.out.print(i+" ");
        }
    }

}
