public class Solution {

    public static int fun1(int n) {
        int sum=0;
        while(n!=0) {
            sum+=n%10;
            n/=10;
        }

        return sum;
    }
    public static int FindMeOut(int input1) {
        int val=-1;
        for(int i=input1+1;i<10000;i++) {
            if(i%input1==0) {

                int a=fun1(i);
                if(a==input1) {
                   val=i;
                    break;
                }
            }
        }
        return val;
    }

    public static void main(String arg[]) {
       System.out.println( FindMeOut(9));





    }


}
