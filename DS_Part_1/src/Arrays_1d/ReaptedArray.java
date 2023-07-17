package Arrays_1d;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class ReaptedArray {

    public static int findRepArray(int[] input1,int input2) {
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        for(int i:input1) {
            arrayDeque.add(i);
        }
       int last= input1[input2-1];
        int count=1;
        //ArrayList<Integer> arr=new ArrayList<>();
        while(!arrayDeque.isEmpty()) {
            if(arrayDeque.peekFirst()>0) {
                int value=arrayDeque.removeLast();
                if(arrayDeque.contains(value)) {
                    return value;
                }
            }
            else {
                arrayDeque.removeLast();
                count++;
            }
        }
        if(count==input2) {
            return 0;
        }
        return last;
    }
    public static void main(String arg[]) {
        int[] arr={1,2,4,1,2,8};
        int n=6;
        System.out.print(findRepArray(arr,n));
    }
}
