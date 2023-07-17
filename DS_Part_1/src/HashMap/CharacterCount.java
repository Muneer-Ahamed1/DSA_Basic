package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        HashMap<Character,Integer> hmp=new HashMap<>();
        for(int i=0;i<string.length();i++) {
            char c=string.charAt(i);
            if(hmp.containsKey(c)) {
                int count=hmp.get(c);
                hmp.put(c,count+1);
            }
            else {
                hmp.put(c,1);
            }
        }
        int count=0;

       for(char c:hmp.keySet()) {
           if(hmp.get(c)>1) {
               count++;
           }
       }
       System.out.println(count);
    }
}
