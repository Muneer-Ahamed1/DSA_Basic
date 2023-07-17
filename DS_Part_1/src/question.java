import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution{
    static boolean isPrime(int n)
    {

        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int sumPrime(int rangeLeft,int rightRight) {
       int neg=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=rangeLeft;i<=rightRight;i++) {
            neg=0;

            if(i<0) {
                neg=i*-1;
            }
            else {
                neg=i;
            }
            if(isPrime(neg)) {
                al.add(i);
            }
        }

    int sum= Collections.min(al)+Collections.max(al);
        return sum;
}
public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        System.out.println(sumPrime(s.nextInt(),s.nextInt()));
}



}