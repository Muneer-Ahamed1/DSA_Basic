import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {


        Scanner s=new Scanner(System.in);
        ArrayList<String>arr=gss(s.nextLine());
        System.out.println(arr);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0) {
            ArrayList<String> rr=new ArrayList<>();
        rr.add("");
        return rr;
    }
    char c=str.charAt(0);
    String sub=str.substring(1);
    ArrayList<String>arr=gss(sub);
    ArrayList<String> spl=new ArrayList<>();
    for(String s1:arr) {
        spl.add(s1);
    }
    for(String s1:arr) {
        spl.add(c+s1);
    }
    return spl;


}}