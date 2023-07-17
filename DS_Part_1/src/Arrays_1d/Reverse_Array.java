package Arrays_1d;

public class Reverse_Array {

    public static void reverse_op(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int swap=0;
        while (i<j) {
            swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
    }
    public static void display(int[] arr) {
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
    public static void reverse_bt(int[] arr) {
        int[] arr2=new int[arr.length];
        int i=0;
        for(int j=arr.length-1;j>=0;j--) {
            arr2[i++]=arr[j];

        }
        for(int k=0;k<arr.length;k++) {
            arr[k]=arr2[k];
        }

    }
    public static void main(String arg[]) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Display the array");
        display(arr);
        System.out.println();
        System.out.println("Brute Force");//It reverse the orginal array
        reverse_bt(arr);
        display(arr);
        System.out.println();
        System.out.println("optimization");//It reverse the brute force array
        reverse_op(arr);
        display(arr);
    }


}
