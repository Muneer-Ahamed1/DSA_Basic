import java.util.Scanner;

public class NoOfSquares {
    public static  int getNoOfSquares(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum+=i*i;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println(getNoOfSquares(s.nextInt()));
    }
}
