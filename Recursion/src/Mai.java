import java.io.*;
import java.util.*;

class Soltion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner s=new Scanner(System.in);

        int[] arr=new int[8];
        for(int i=0;i<8;i++) {

            arr[i]=s.nextInt();

        }

        ArrayList<Integer> array=new ArrayList();
        if(arr[1]!=arr[0]) {
            array.add(1);
        }
        else{
            array.add(0);
        }
        //int previous=0;
        //int next=0;
        for(int current=1;current<7;current++) {
            if(arr[current-1]!=arr[current+1]) {
                array.add(1);
            }
            else{
                array.add(0);
            }
        }

        if(arr[6]==arr[7]){array.add(0);}
        else{array.add(1);}

        System.out.println(array);














    }
}