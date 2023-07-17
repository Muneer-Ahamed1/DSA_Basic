//{ Driver Code Starts
package Stack;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {


    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            long n = Long.parseLong(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[(int)n];
            for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
            System.out.println(new Solution().getMaxArea(arr, n));
        }
    }
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.


    public static long[] leftinfo(long[] arr) {
        Stack<Integer> st=new Stack<>();
        long[] ans=new long[arr.length];
        ans[0]=-1;
        st.push(0);
        for(int i=1;i< arr.length;i++) {
            while(st.size()>0 && arr[i]<arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static long[] rightinfo(long[] arr) {
        Stack<Integer> st=new Stack<>();
        long[] ans=new long[arr.length];
        int n= arr.length;
        ans[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--) {
            while(st.size()>0 && arr[i]<=arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                ans[i]=n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;

    }

    public static long getMaxArea(long hist[], long n)
    {
        // your code here
        long[] nsl=leftinfo(hist);
        long[] nsr=rightinfo(hist);
        ArrayList<Long> array=new ArrayList<>();
        for(int i=0;i<n;i++) {
            //   System.out.println(nsr[i]+"+"+nsl[i]);
            long sum=nsr[i]-nsl[i]-1;
            sum=sum*hist[i];
            array.add(sum);
        }
        return Collections.max(array);

















    }

}



