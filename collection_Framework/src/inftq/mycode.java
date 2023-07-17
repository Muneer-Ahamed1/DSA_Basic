package inftq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mycode {


    static String  result(String str) {
        String[] arr=str.split(",");
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(String i:arr) {
            int j=Integer.parseInt(i);
            if(j>0) {
                arr1.add(j);
            }
            else {
                arr2.add(j);
            }
        }
        arr2.addAll(arr1);
        arr1.clear();
        int i=0;
        int j=1;
        while(j<arr2.size()) {
            int a=arr2.get(i++);
            int b=arr2.get(j++);
            int c=b-a;


            arr1.add(diff(c,a,b));
        }
        String bem="";
       for(int k=0;k<arr1.size()-1;k++) {
           bem+=arr1.get(k);
           bem+=",";
       }
       bem=bem+arr1.get(arr1.size()-1);




        return bem;
    }
    static int diff(int c,int a,int b) {
       int sum=0;
       ArrayList<Integer> arr1=new ArrayList<>();
        if(a<0 && b<0) {
            a = a * -1;
            b = b * -1;
            ++b;
            while (b < a) {
                arr1.add(b*-1);

                ++b;
            }


        }
        else{
            sum=(a>0)?a:1;
            ++sum;

            while(sum<Math.max(a,b)) {
                arr1.add(sum);
                ++sum;

            }
        }
        sum=0;

        for(int i:arr1) {
            sum+=i;
        }

        return sum;






    }


    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println(result(s.nextLine()));
    }
}
