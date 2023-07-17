package HashMap;

import java.util.*;

class  frequency{

    public static String Map(String str1,String str2) {
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<str1.length();i++) {
        int j=str1.charAt(i)-64;
        arr.add(j);
    }
    Collections.sort(arr,Comparator.reverseOrder());
    String count1="";
    for(int i:arr) {
        count1+=i;
    }
    arr.clear();
        for(int i=0;i<str2.length();i++) {
            int j=str2.charAt(i)-64;
            arr.add(j);
        }
        Collections.sort(arr,Comparator.reverseOrder());
        String count2="";
        for(int i:arr) {
            count2+=i;
        }
if(Integer.parseInt(count1)>Integer.parseInt(count2)) {
    return str1;
}
return str2;

    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.print(Map(str1,str2));


    }
}
