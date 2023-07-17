package PriorityQueue;
import java.io.*;
import java.util.*;

 class code3 {

    public static class MedianPriorityQueue {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue() {
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        public void add(int val) {
            // write your code here
            if(right.size()>0 && right.peek()<val) {
                right.offer(val);
            }
            else{
                left.offer(val);
            }
            if(right.size()-left.size()>=2) {
                left.offer(right.poll());
            }
            else if(left.size()-right.size()>=2) {
                right.offer(left.poll());
            }

        }

        public int remove() {
            // write your code here
            if(this.size()==0) {
                System.out.println("underflow condition");
            }
            if(left.size()>=right.size()) {
                return left.poll();
            }
            else{
                return right.poll();
            }
        }

        public int peek() {
            // write your code here

            if(this.size()==0) {
                System.out.println("underflow condition");
            }
            if(left.size()>=right.size()) {
                return left.peek();
            }
            else{
                return right.peek();
            }
        }
    public int size() {
        // write your code here
        return left.size()+right.size();
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MedianPriorityQueue qu = new MedianPriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}}