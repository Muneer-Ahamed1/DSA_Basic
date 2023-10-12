package Accenture;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import  java.util.*;

public class Problem2 {
    public  static void main(String args[]) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++) {
            if (arr[i] % 3 == 0 && arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        

    }
}
