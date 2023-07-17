import java.io.*;
import java.util.*;

 class Main{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        // solve
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int[] a=new int[arr.length];
        a[arr.length-1]=-1;
        int count=a.length-1;
        st2.push(arr[count]);
        for(int i:arr) {
            st1.push(i);
        }
        st1.pop();
        //System.out.println(st1);
        //System.out.println(count);
        while(!st1.isEmpty()) {
            if(st1.peek()>=st2.peek()) {
                System.out.println(a[count] + " "+ count);

                while(st1.peek()>st2.peek()) {
                    st2.pop();
                    if (st2.isEmpty()) {
                        break;
                    }
                }
                if(st2.isEmpty()) {
                    a[--count]=-1;
                    System.out.println(count);
//                    System.out.println(a[count]);


                }
                else{
                    a[--count]=st2.peek();
                }
                st2.push(st1.peek());
                st1.pop();
            }
            System.out.println(count);
            if(st1.peek()<=st2.peek()) {
                a[--count]=st2.peek();
                st2.push(st1.peek());
                st1.pop();
            }

        }

        return a;
    }

}