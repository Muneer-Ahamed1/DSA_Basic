package Stack;

import java.util.Scanner;

public class StackImplementation{
    int top=-1;
    int[] arr;
    public StackImplementation(int n){
        arr=new int[n];
    }
    public void push(int n) {
        if(!isFull()){
            arr[++top]=n;
        }
        else {
            System.out.println("FULL"+top);
        }
    }
    int peek(){
        return arr[top];
    }
    void pop() {
        if (!isEmpty()) {
            arr[top] = 0;
            top--;
        }
        else {
            System.out.println("EMPTY");
        }
    }
    boolean isFull() {
        if(top==arr.length-1) {
            return true;
        }
        return false;
    }
    boolean isEmpty() {
        if(top==-1) {
            return true;
        }
        return false;
    }
    public static void main(String arg[]) {
        StackImplementation st=new StackImplementation(5);
        Scanner s=new Scanner(System.in);
        while (true) {
            System.out.print("SELECTION");
            switch (s.nextInt()){
                case 1:
                    st.push(s.nextInt());
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    System.out.print(st.peek());
                    break;
            }
        }

    }
}