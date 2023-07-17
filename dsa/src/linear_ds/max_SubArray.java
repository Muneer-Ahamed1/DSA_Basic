package linear_ds;

import java.util.ArrayList;
import java.util.Scanner;

public class max_SubArray {

    public static String maximum(int n,int[] arr) {
        int max=-99;
        int sum;
        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                sum=0;
                for(int k=i;k<=j;k++) {
                  sum+=arr[k];
                  arrayList1.add(arr[k]);
                }
                //System.out.println(sum);
                if(sum>max) {
                    max=sum;
                 //   System.out.println(max);
                    arrayList2.clear();
                    arrayList2.addAll(arrayList1);
                }
                arrayList1.clear();
            }
        }
        String str="";
        for (int i=0;i<arrayList2.size()-1;i++){
            str=str+arrayList2.get(i)+" ";
        }
        str=str+arrayList2.get(arrayList2.size()-1);
        return str;
    }

    public static  void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String str=s.nextLine();


        int[] arr=new int[n] ;
        String[] strings=str.split(" ");
       int j=0;
        for(int i=0;i<n;i++) {
            arr[i]=Integer.parseInt(strings[j++]);
        }

        System.out.println(maximum(n,arr));
    }
}
