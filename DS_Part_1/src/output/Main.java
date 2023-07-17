package output;
import Stack.NGL;

public class Main extends NGL {
    public static void main(String arg[]) {
        int[] arr={4,57,76,55,90,14};
        int n=arr.length;
        for (int i=0;i<n;i++) {
            if(arr[i]==30) {
                System.out.print(1);
            }
        }
        System.out.print(-1);


        int[] array={4,5,2,0};

        int[] ans=NGL.leftinfo(array);
        for(int i:ans) {
            System.out.print(i+" ");
        }

    }

}
