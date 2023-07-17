package HashMap;

import java.io.*;
import java.util.*;

 class code2 {

     public static void main(String[] args) throws Exception {
         // write your code here
         Scanner s = new Scanner(System.in);
         int n1 = s.nextInt();
         int[] arr1 = new int[n1];
         for (int i = 0; i < n1; i++) {
             arr1[i] = s.nextInt();
         }
         int n2 = s.nextInt();
         int[] arr2 = new int[n2];
         for (int i = 0; i < n2; i++) {
             arr2[i] = s.nextInt();
         }

         HashMap<Integer, Integer> hmp = new HashMap<>();
         for (int i = 0; i < n1; i++) {
             if (hmp.containsKey(arr1[i])) {
                 int count = hmp.get(arr1[i]);
                 count++;
                 hmp.put(arr1[i], count);
             } else {
                 hmp.put(arr1[i], 1);
             }

         }
         for (int i : arr2) {
             if (hmp.containsKey(i)) {
                 System.out.println(i);
                 hmp.remove(i);
             }
         }

     }
 }