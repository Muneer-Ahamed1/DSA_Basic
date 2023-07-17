package inftq;

import java.util.ArrayList;

public class Concatenation {
    public static void main(String arg[]) {
        String str="3,2,6,5,1,4,8,9";
        String[] arr=str.split(",");
        ArrayList<String> array=new ArrayList<>();
        for(String s:arr) {
            array.add(s);
        }
        System.out.println(array);
        int a=array.indexOf("5");
        int b=array.indexOf("8");
        ArrayList<String> array2=new ArrayList<>();
        array2.addAll(array);
        System.out.println(array2);

        array2.subList(0,a-1);
        System.out.println( );


        int sum=0;
       for(String s:array2.subList(0,a)) {
           sum+=Integer.parseInt(s);
       }
       System.out.println(sum);
        ArrayList<String> array3=new ArrayList<>();

        array3.addAll(array);
        System.out.println(array3+"  "+b);


        for(int i=b+1;i<array3.size();i++) {
            sum+=Integer.parseInt(array3.get(i));
        }
        System.out.println(sum);



        //array.subList(a,b);
        String sum1="";
        for(String v:array.subList(a,b)) {
            sum1+=v;
        }
        System.out.println(sum1);
        int ab= (int) Integer.parseInt(sum1);
        System.out.println(ab);


    }
}
