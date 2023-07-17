import java.io.*;
import java.util.*;

 class Solution {

    static boolean  check(int num) {
        HashMap<Integer,Integer> hmp=new HashMap();
        while(num>0) {
            int key=num%10;
            if(hmp.containsKey(key)) {
                int sum=hmp.get(key);
                sum+=1;
                hmp.put(key,sum);
            }
            else{
                hmp.put(key,1);
            }
            num/=10;
        }
        HashSet<Integer> hs=new HashSet();
        hs.addAll(hmp.values());
        if(hs.size()==1) {
            return true;
        }
        return false;
    }
    static int Password(int[] arr,int n) {
        //ArrayList<Integer> arrayList=new ArrayList();
        int sum=0;
        for(int i=0;i<n;i++) {
            if(!check(arr[i])) {
                sum+=arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=5;
        int[] arr=new int[n];
        for(int i=0;i<5;i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(Password(arr,n));
    }
}