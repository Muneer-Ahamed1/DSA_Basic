package String;

import java.util.HashMap;
import java.util.Scanner;

class Decoder {
    static String StringDecoder(String str) {
        String ap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count=1;
        HashMap<Integer,Character> hmp=new HashMap<>();
        for(int i=0;i<ap.length();i++) {
            char c=ap.charAt(i);
            hmp.put(count++,c);
        }
        count=0;
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c=='1') {
                count++;
            }
            else{
                string+=hmp.get(count);
                count=0;
            }
        }
        return string;
    }
     public static void main(String arg[]) {
         Scanner s=new Scanner(System.in);
         String str=s.nextLine();
         System.out.println(StringDecoder(str));
     }
}
