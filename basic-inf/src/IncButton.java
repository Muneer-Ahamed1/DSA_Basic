import java.util.Collection;
import java.util.Iterator;
import java.util.*;

class abc {


    public static void main(String arg[]) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        s.add(230);
        s.add(12);
        ArrayList<Integer> arr=new
                ArrayList<>();
        arr.add(1);
        arr.add(21);
        arr.add(2);
        s.addAll(arr);

        System.out.println(s);
        


    }
}