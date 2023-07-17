package regular_expression;

import java.util.Comparator;
import java.util.TreeSet;

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m)
    {
        // code here
        TreeSet<Long> ts1=new TreeSet<>();
        TreeSet<Long> ts2=new TreeSet<>();
        for(long i:arr1) {
            ts1.add(i);

        }
        for(long i:arr2) {
            ts2.add(i);
        }
        ts1.addAll(ts2);
        int[] arr3=new int[ts1.size()];
        int j=0;
        for(long i:ts1) {
            arr3[j++]=(int) i;
        }
        for(int i:arr3) {
            System.out.print(i);
        }

    }
    public static void main(String arg[]) {
        long[] arr={1 ,3 ,5 ,7};
        long[] arr2={0 ,2, 6, 8, 9};
        merge(arr,arr2,2,1);
    }
}
