package HashMap;
import java.util.HashMap;
import java.util.Scanner;
public class NonRepeated {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String string =sc.nextLine();
        HashMap<Character,Integer> lhmp=new HashMap<>();
        for(int i=0;i<string.length();i++) {
            char c=string.charAt(i);
            if(lhmp.get(c)!=null) {
                int count=lhmp.get(c);
                lhmp.put(c,count+1);
            }
            else {
                lhmp.put(c,1);
            }
        }
        for(int i=0;i<string.length();i++){
            char c=string.charAt(i);
            if(lhmp.get(c)==1) {
                System.out.println(c);
                break;
            }
        }
    }
}
