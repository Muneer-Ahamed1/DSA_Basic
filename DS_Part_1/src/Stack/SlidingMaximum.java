package Stack;

import java.io.*;
import java.util.*;

class Main{


    public static void main(String[] args) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s=new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        int k = s.nextInt();

        // code

        int[] ans=new int[a.length];
        int n1=a.length;
        Stack<Integer> st=new Stack<>();
        st.push(a.length-1);
        for(int i=n1-2;i>=0;i--) {
            while(st.size()>0 && a[i]>=a[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                ans[i]=n1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        for(int i:ans) {
            System.out.print(i+" ");
        }
        int j=0;
        for(int i=0;i<=n1-k;i++) {
            j=i;
            while(ans[j]<i+k) {
                j=ans[j];
            }
            System.out.println(a[j]);
        }

    }
}