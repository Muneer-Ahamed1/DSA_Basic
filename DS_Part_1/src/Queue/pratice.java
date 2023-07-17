package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Queue<Integer> qp=new ArrayDeque<>();
        qp.add(0);
        int n=A.length();
        String str=""+A.charAt(qp.peek());
        for(int i=1;i<n;i++) {
            if(qp.size()>0 && A.charAt(qp.peek())==A.charAt(i)) {
                str+="#";
            }
            else{
                qp.remove();
                qp.add(i);
                str+=A.charAt(i);
            }
        }
        return str;
    }
}