public class Mergesort {
    static int[] arr={6,3,9,5,2,8};
    static int mid;
    static int[] temp;
    static void divide(int i,int j) {
        if(i>=j) {
            return;
        }
        else{
            mid=i+(j-i)/2;
            divide(i,mid);
            divide(mid+1,j);
            conquer(i,mid,j);
        }
    }
    static void conquer(int i,int mid,int j) {
        temp=new int[j+1];
        for(int k=i;k<=j;k++) {
            temp[k]=arr[k];
        }
        int f1=i;
        int f2=mid+1;
        int f3=j;
        int k=i;


        while(f1<=mid && f2<=j ) {
            if (temp[f1] <= temp[f2]) {
                arr[k]=temp[f1];
                f1++;
            }
            if(temp[f2]<=temp[f1]) {
                arr[k]=temp[f2];
                f2++;
            }
            k++;
        }
        while(f1<=mid) {
            arr[k]=temp[i];
            i++;
            k++;
        }

    }
    static void print() {
        for (int i:arr) {
            System.out.println(i);
        }
    }





    public static void main(String arg[]) {
        divide(0,5);
        print();
    }








}
