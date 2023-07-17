package inftq;
import java.io.*;
import java.util.*;

class Solution {
    static Object[] list(String st) {
        String[] arr=st.split(",");
        int i=0;
        int j=1,k=2;
        String str="";
        ArrayList<Integer> srt=new ArrayList<>();
        Set<Integer> set=new LinkedHashSet<>();
        while(k<arr.length) {
            if(Integer.parseInt(arr[i])+Integer.parseInt(arr[j])==Integer.parseInt(arr[k])) {

                set.add(Integer.parseInt(arr[i]));
                set.add(Integer.parseInt(arr[j]));
                set.add(Integer.parseInt(arr[k]));

            }
            else{
                if(srt.size()==0) {
                    srt.addAll(set);
                }
                if( srt.size()<set.size()) {
                    srt.remove(0);
                    srt.addAll(set);
                }
                str="";
            }
            ++i;
            ++j;
            ++k;
        }
        return srt.toArray();

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        Object[] arr=list(s.nextLine());
        for(Object i:arr) {
            System.out.print(i+",");
        }
        int a=-40;
        System.out.println(a%10);
        int Class;
    }
}