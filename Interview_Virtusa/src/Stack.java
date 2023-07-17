import java.util.Scanner;

class Stack {
    static int max;
    static int[] arr;
    static int i=0;

    ///public static void main(String[] args) {

    //}
    Stack(int num){
        max=num;
        arr=new int[max];
    }
    void push(int e) {
        if(!isfull()){

            arr[i++]=e;
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Soory");
        }
    }
    void peek() {
        System.out.println(arr[i-1]);
    }
    void pop() {
        if(!isEmpty()) {
            arr[i]=0;
            --i;
        }
        else{
            System.out.println("Its Empty");
        }

    }
    boolean isfull() {
        if(i==max-1) {
            return true;
        }
        return false;
    }
    boolean isEmpty() {
        if(i==0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
	// write your code here
        Stack st=new Stack(5);
        Scanner s=new Scanner(System.in);

        while (true) {
            int i=s.nextInt();
            switch (i) {
                case 1:
                    st.push(s.nextInt());
                    break;
                case 2:
                    st.peek();
                    break;
                case 3:
                    st.pop();
                    break;
                default:
                    System.out.println("try again");
            }



        }









    }
}
