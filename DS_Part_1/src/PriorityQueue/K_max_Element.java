package PriorityQueue;

import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int k = Integer.parseInt(br.readLine());
        // write your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        int i=0;
        for(;i<n;i++) {
            pq.offer(arr[i]);
        }
        int j=0;
        Stack<Integer> st=new Stack<>();
        while(j<k) {
            st.push(pq.peek());
            pq.poll();
            j++;
        }
        while(!st.isEmpty()) {
            System.out.print(st.peek());
            st.pop();
        }
    }

}