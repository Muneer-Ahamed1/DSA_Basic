package String;

import java.util.Locale;
import java.util.Scanner;

public class String_Weight {
    public static int findStringWeight(int[] input1,String input2) {
        int product=1;
        int num=96;
        input2=input2.toLowerCase();
        String[] str=input2.split(" ");
        int sum=0;
        for(String i:str) {
            sum=0;
            for(int j=0;j<i.length();j++) {
                int index=(i.charAt(j)-num);
                int k=input1[index-1];


                if(j==0  && k<0) {

                    k=k+index;
                }
                else if(j==i.length()-1 && k<0) {
                    k=k+index;
                }

                sum+=k;
            }
            //SYs\
            product*=sum;
        }

        return product;
    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int[] arr={12,11,6,1,-1,23,12,1,28,-43,6,98,11,2,7,88,9,-4,-54,25,19,-12,-32,65,3,-9};
        System.out.println(findStringWeight(arr,str));
    }
}
