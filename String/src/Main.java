import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

class Main{
    public static void main(String arg[]) {
        ArrayList arr=new ArrayList();
        arr.add(10);
        arr.add(12);
        arr.set(1,13);
        arr.add(12);
        arr.add(14);
        arr.add(0,81);
        System.out.println(arr);
        ArrayList arr1=new ArrayList();
        arr1.add(41);
        arr1.add(32);
        arr1.add(8.870);

        arr.addAll(1,arr1);
        arr.remove(1);

        System.out.println(arr.toString()+12+"iamhere"+arr.size());
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(12);
        st.push(12);
        System.out.println(st.search(12));

        TreeSet li=new TreeSet(arr);
        System.out.println(arr);
        System.out.println(arr);




    }
}
