import java.util.ArrayList;
import java.util.Collections;

public class Rakii {

    public  String  Find(int i1,int i2,int i3) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(i1/1000);
        arr.add(i2/1000);
        arr.add(i3/1000);

        String max="";
                int c=Collections.max(arr);
                max+=c;
                arr.clear();

        arr.add((i1/100)%10);
        arr.add((i2/100)%10);
        arr.add((i3/100)%10);
        max+=Collections.max(arr);
        arr.clear();
        arr.add((i1/10)%10);
        arr.add((i2/10)%10);
        arr.add((i3/10)%10);
        max+=Collections.max(arr);
        arr.clear();
        arr.add(i1%10);
        arr.add(i2%10);
        arr.add(i3%10);
        max+=Collections.max(arr);


return max;




    }

    public static void main(String arg[]) {
        Rakii r=new Rakii();
        System.out.println(r.Find(3521,2452,1352));
    }


}
