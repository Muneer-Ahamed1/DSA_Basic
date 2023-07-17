package Searching;
//TimeComplexity:log(n)
public class BinarySearch_Iteration {

    int searchBinary(int[] n,int num) {
        int i=0;
        int j=n.length-1;
        int mid=0;
        while(i<j) {
            mid=j-(j-i)/2;
            if(n[mid]==num) {
                return mid;
            }
            if(n[mid]>num) {
                i=mid+1;
            }
            if(n[mid]<num) {
                j=mid-1;
            }
        }
        return -1;
    }
    public static void main(String arg[]) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        BinarySearch_Iteration bn=new BinarySearch_Iteration();

        System.out.println(bn.searchBinary(arr,16));
    }
}
