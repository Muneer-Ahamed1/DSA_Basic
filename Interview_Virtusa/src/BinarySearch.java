public class BinarySearch {
    int mid=0;
int k;
    int binarySearch(int[] arr,int i,int j,int search) {
        mid=(i+j)/2;
        if(arr[mid]==search) {
            return mid;
        }
        System.out.println(mid);
        if(arr[mid]<search) {
      return     binarySearch(arr,mid+1,j,search);
        }
        if(arr[mid]>search) {
        return      binarySearch(arr,i,mid-1,search);
        }
        return -1;

    }


    public static void main(String arg[]) {
        BinarySearch bs=new BinarySearch();
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(bs.binarySearch(arr,0,8,7));
    }


}
