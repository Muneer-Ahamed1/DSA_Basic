package String;

import java.util.Scanner;

public class Elimate_blank_space {
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] string=str.split(" ");
       String ans="";
        for(String i:string) {
            ans+=i;
        }
        System.out.print(ans);
    }

}
