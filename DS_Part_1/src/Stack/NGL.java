package Stack;

import java.util.Stack;

public class NGL {
    protected static int[] leftinfo(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        ans[0]=-1;
        st.push(0);
        for(int i=1;i< arr.length;i++) {
            while(st.size()>0 && arr[i]>arr[st.peek()]) {
                st.pop();
            }
            if(st.size()==0) {
                ans[i]=-1;
            }
            else{
                ans[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String arg[]) {
        int[] arr={4,5,2,0};
        for(int i:leftinfo(arr)) {
            System.out.print(i+" ");
        }
    }
}
