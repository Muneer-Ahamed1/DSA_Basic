package Arrays_1d;

import java.util.Scanner;

public class input {
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];

        String str=s.nextLine();

        String[] string=str.split(",");
        System.out.println(string);
        for(int i=0;i< string.length;i++) {
            arr[i]=(int) Integer.parseInt(string[i]);
        }
        display(arr);
    }
    public static void display(int [] arr) {
        for(int i:arr) {
            System.out.print(i);
        }
    }
}
