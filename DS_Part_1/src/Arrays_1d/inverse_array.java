package Arrays_1d;

public class inverse_array {
    public static boolean inverse(int[] arr) {
        int temp=0;
        for(int i=0;i<arr.length;i++) {
            temp=arr[i];
            if(arr[temp]!=i) {
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]) {
        int[] arr={3,4,2,0,1};
        System.out.println(inverse(arr));
        int[] arr2={1,2,3,0};
        System.out.println(inverse(arr2));
    }
}
