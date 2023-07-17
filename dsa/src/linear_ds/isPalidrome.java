package linear_ds;

import java.util.*;
import java.util.regex.Pattern;

public class isPalidrome {


    static int ispali(int n) {

        int sum=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0) {
            int r=n%10;
            arr.add(r);
            n/=10;
        }
        for(int i:arr) {
            sum=sum^i;
        }
//        System.out.println(sum);


        TreeSet<Integer> treeSet=new TreeSet<>(Comparator.reverseOrder());
        String str="";
        if(sum%10!=0) {

            treeSet.addAll(arr);
            treeSet.remove(Integer.valueOf(sum));
            for(int i:treeSet) {
                str+=i;

            }
            StringBuilder stringBuilder =new StringBuilder(str);
            System.out.println(stringBuilder);
            str=str+sum+stringBuilder.reverse();
        }
        else{
            treeSet.addAll(arr);


            for(int i:treeSet) {
                str+=i;

            }
            StringBuilder stringBuilder =new StringBuilder(str);
            str=str+stringBuilder.reverse();

        }

    //return Integer.parseInt(str);

return Integer.parseInt(str);
    }

    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println(ispali(s.nextInt()));
    }





}
