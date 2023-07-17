package BinarySearch;
import java.util.Scanner;

public class pivot_Array {
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(pivot(arr));
    }
    static int pivot(int[] arr) {
        int s=0;
        int e=arr.length;
        int mid=(s+e)/2;
        while(s<e) {
            if (arr[mid] > arr[0]) {
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=(s+e)/2;
        }
        return s;
    }
}
