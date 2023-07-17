import java.util.*;
import java.lang.*;
//1...
/*public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        HashMap<Character, Integer> hm=new HashMap<>();



        for(int i=0;i<len;i++) {
            char c=str.charAt(i);
            if(hm.containsKey(c)==true) {
                int num=hm.get(c);
                num+=1;
                hm.put(c,num);

            }
            else{
                int num=1;
                hm.put(c,num);
            }
        }
        char ch =str.charAt(0);

        Set<Character> keys=hm.keySet();
        for(char key :keys) {
            if(hm.get(key)>hm.get(ch)) {
                ch=key;
            }
        }
        System.out.println(ch);




}
    }
 */
public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++) {
            int num=s.nextInt();
            arr1[i]=num;
        }

        int[] arr2=new int[n];
        for(int i=0;i<n;i++) {
            int num=s.nextInt();
            arr2[i]=num;
        }
        for(int i=0;i<arr1.length;i++) {
            int num=arr1[i];
            if (hm.containsKey(num)==true) {
                int count=hm.get(num);
                count+=count;
                hm.put(num,count);

            }
            else
            {
                hm.put(num,1);
            }


        }
        Set<Integer> set=hm.keySet();
        System.out.print(set);
        int i=0;
        for(int key:arr2) {

            if(hm.containsKey(key)) {
                System.out.println(key);
                hm.remove(key);

            }
        }




    }

}