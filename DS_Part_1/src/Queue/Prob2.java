package Queue;
import java.util.*;

public class Prob2 {
    public  static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> dq=new ArrayList<>();
        int n=s.nextInt();

        for(int i=0;i<n;i++) {
            dq.add(s.nextInt());
        }
        int n1=1;
        int n2=2;
        int sum=0;
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<n;i++) {
            if(i<=n-3) {
                sum=dq.get(n1)+dq.get(n2);
                arr.add(sum);
                n1++;
                n2++;
            }
            else{
                if(i==n-2) {

                    n2=0;
                    sum=dq.get(n1)+dq.get(n2);
                    arr.add(sum);
                }
                else if (i==n-1) {
                    n1=0;
                    n2=1;
                    sum=dq.get(n1)+dq.get(n2);
                    arr.add(sum);
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(arr.get(i)+" ");
        }




    }
}
