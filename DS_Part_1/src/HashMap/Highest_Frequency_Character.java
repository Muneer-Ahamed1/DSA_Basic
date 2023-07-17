package HashMap;

import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        HashMap<Character,Integer> hmp=new HashMap<>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(hmp.containsKey(c)) {
                int count=hmp.get(c);
                count+=1;
                hmp.put(c,count);
            }
            else{
                hmp.put(c,1);
            }
        }
        Set<Character> st=hmp.keySet();
        int max=0;
        char val='0';
      //  System.out.print(hmp);

        for(char c:st) {
            if(max<hmp.get(c)) {
                max=hmp.get(c);
                val=c;
            }
        }
        System.out.println(val);
    }

}