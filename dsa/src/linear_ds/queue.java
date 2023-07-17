package linear_ds;

import java.util.Queue;
import java.util.Scanner;

public class queue {

    int r,f,max;
    int[] q;
    queue(int n){
        max=n;
        r=f=-1;
        q=new int[n];
    }
    public void Enqueue(int e) {
        if(!isFull()) {
            q[++r]=e;
            if(f==-1) {
                ++f;
            }
        }
        else{
            throw new ArrayIndexOutOfBoundsException("QueueFull");
        }
    }
    public void Dequeue() {
        if(!isEmpty()) {
            System.out.println("DELETED ELEMENT"+q[f]);
            ++f;
        }

        else{
            throw new ArrayIndexOutOfBoundsException("QueueFull");
        }
    }
    boolean isFull() {

        if(r==max-1) {
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(f==-1) {
            return true;
        }
        return false;
    }
    void display() {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("sorry");
        }
        for(int i=f;i<=r;i++) {
            System.out.println("ELEMENT:"+q[i]);
        }
    }
    public static void main(String arg[]) {
       Scanner s=new Scanner(System.in);

        queue q=new queue(s.nextInt());
        boolean b=true;
        while(b) {
            System.out.println("CHOOSE WHAT TO DO \n1.Enqueue\n 2.Dequeue\n3.display ");
            switch (s.nextInt()) {
                case 1:
                    q.Enqueue(s.nextInt());
                    break;
                case 2:
                    q.Dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    b=true;
                    break;



            }



        }
    }





















}
