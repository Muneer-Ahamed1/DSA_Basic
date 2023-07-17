package inftq;

import java.util.*;

public class intqprob {
    static  Scanner s=new Scanner(System.in);
    static Object[] prime_no(int n) {

        int[] arr=new int[n];
        int num=0;
        int j=0;
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int i=1;i<=n;i++) {
            int counter=0;
            for(num=i;num>=1;num--) {
                if (i % num == 0) {
                    counter += 1;
                }
            }
                if(counter==2) {
                    hs.add(i);
                }
            }
            return hs.toArray();



    }
    static int sum(List<Integer> arr) {
        int a=arr.get(0);
        int b=arr.get(1);
        return a+b;
    }


    static  int  inftq(int a,int b,int c,int[] arr) {
        ArrayList<Integer> array=new ArrayList<>();
        for(int i:arr) {
            //int n1=(int) a;
            if(a%i==0) {
                array.add(i);
            }
            if(array.size()==2) {
                break;
            }
        }
        int n1=sum(array);
        array.clear();
        for(int i:arr) {
            if(b%i==0) {
                array.add(i);
            }
            if(array.size()==2) {
                break;
            }
        }
        int n2=sum(array);
        array.clear();





        for(int i:arr) {
            if(c%i==0) {
                array.add(i);
            }

            if(array.size()==2) {
                break;
            }
        }
        int n3=sum(array);
        array.clear();

        return n1*n2*n3;

    }
    public static void main(String arg[]) {
        Object [] array=prime_no(100);
      Scanner s=new Scanner(System.in);
       // int[] arr={2,3,5,7,11,13,17,19,23,27,29};
        int[] arrr=new int[array.length];
        int j=0;
        System.out.println();
        for(Object i:array) {
            arrr[j++]=(int) i;
        }
        System.out.println(inftq(s.nextInt(),s.nextInt(),s.nextInt(),arrr));
    }







}
