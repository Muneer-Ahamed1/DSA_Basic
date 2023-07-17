package linear_ds;
import java.util.*;
class Soluton {
   public static void main(String arg[]) {

   int[] arr={1,-2,4,-5,1};
   for(int i=0;i<arr.length;i++) {
       for(int j=i+1;j<=arr.length;j++) {
           for(int k=i;k<j;k++) {
               System.out.print(arr[k]);

           }
           System.out.println();

       }
   }



   }
}