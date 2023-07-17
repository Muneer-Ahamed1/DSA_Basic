package Stack;

import java.util.*;
class olution
{
public static void main(String arg[]) {
Scanner s=new Scanner(System.in);
int[] arr=new int[s.nextInt()];
for(int i=0;i<arr.length;i++) {
    arr[i]=s.nextInt();
}
Stack<Integer> st=new Stack<>();
int[] ans=new int[arr.length];
int n=ans.length;
ans[n-1]=-1;
st.push(n-1);
for(int i=n-2;i>=0;i--) {
    while((!st.isEmpty())&&(arr[st.peek()]<=arr[i])) {
        st.pop();
    }
    if(st.isEmpty()) {
        ans[i]=-1;
    }
    else{
        ans[i]=arr[st.peek()];
    }
    st.push(i);
}
for(int i:ans) {
    System.out.print(i+" ");
}

}
}