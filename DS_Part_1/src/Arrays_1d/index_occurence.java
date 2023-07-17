package Arrays_1d;
import java.util.*;
import java.io.*;
import java.util.*;

 class Main {
     public static void display(int[] a) {
         StringBuilder sb = new StringBuilder();

         for (int val : a) {
             sb.append(val + "\n");
         }
         System.out.println(sb);
     }

     public static void main(String[] args) throws Exception {
         Scanner s = new Scanner(System.in);
         int[] arr = new int[s.nextInt()];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = s.nextInt();
         }
         int[] d = solve(arr);
         display(d);
     }

     public static int[] solve(int[] arr) {
         int[] ans=new int[arr.length];
         Stack<Integer>st=new Stack<>();
         ans[0]=1;
         st.push(0);
         for(int i=1;i< arr.length;i++) {
             while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                 st.pop();
             }
             if (st.size() == 0) {
                 ans[i] = i + 1;
             } else {
                 ans[i] = (i) - st.peek();
             }
             st.push(i);
         }
return ans;
     }
 }