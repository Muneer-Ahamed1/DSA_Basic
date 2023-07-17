package Exam;
import java.util.*;

public class code1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        HashMap<Character,Integer> hmp=new HashMap<>();
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(hmp.get(c)!=null) {
                int sum=hmp.get(c);
                hmp.put(c,sum+1);
            }
            else{
                hmp.put(c,1);
            }
         }
        int sum=0;
        for(char c : hmp.keySet()) {
            int count=hmp.get(c);
            sum=sum+(count/2);
        }
        System.out.print(sum);
    }
}
