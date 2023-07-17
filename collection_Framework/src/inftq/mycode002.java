package inftq;

import java.util.*;
class mycode002{


    static boolean isprime(int n) {
        int i,m=0,flag=0;
        //int n=3;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { return true; }

        }//end of else
        return true;
    }










    static int substr(String str) {
      ArrayList<String> arrayList=new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            for(int j=i+1;j<=str.length();j++) {
                if (str.substring(i, j).charAt(0) != '0') {

                    arrayList.add(str.substring(i, j));
                }
            }
        }
        System.out.println(arrayList);
       ArrayList<Integer> array=new ArrayList<>();
       for(String s:arrayList) {
           if(isprime(Integer.parseInt(s))) {
               array.add(Integer.valueOf(s));
           }
       }
       int a=array.isEmpty()?Collections.max(array):-1;
        return a;
    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println(substr(s.nextLine()));
    }
}