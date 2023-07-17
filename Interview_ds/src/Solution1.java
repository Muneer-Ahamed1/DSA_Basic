import java.util.*;
public class Main {
    static void permut(String str,String ans) {

        if(str.length()==0) {
            System.out.println(ans);
            return;
        }


        //..base
        int n=str.length();
        for(int i=0;i<n;i++) {
            char c=str.charAt(i);
            String sub=str.substring(0,i)+str.substring(i+1,n);
            permut(sub,ans+c);


        }
    }












    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
        permut(str,"");
    }









}
