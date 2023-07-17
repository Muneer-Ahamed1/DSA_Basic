package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NSL {
    public int[] NSL(int[] arr) {

        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        int n=ans.length;
        ans[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++) {
            while((!st.isEmpty())&&(arr[st.peek()]<=arr[i])) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String arg[])  {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[s.nextInt()];
        for(int i=0;i<arr.length;i++) {
            arr[i]=s.nextInt();
        }
        NSL ns=new NSL();
        int[] ans=ns.NSL(arr);

        for(int i:ans) {
            System.out.print(i+" ");
        }
    }



        
    }


