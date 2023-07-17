import java.util.*;
 class CTJ1600{
     public static List<Short> zeroTwoSort(List<Short> list) {
         TreeMap<Integer, Integer> hmp = new TreeMap<Integer, Integer>();
         ArrayList<Short> arr1=new ArrayList<>();
         ArrayList<Short> arr2=new
                 ArrayList<>();
         ArrayList<Short> arr3=new ArrayList<>();
         for(short i : list) {
             if(i==0) {
                 arr1.add(i);
             }
             if(i==1) {
                 arr2.add(i);
             }
             if(i==2) {
                 arr3.add(i);
             }
             if(i>2){
                 arr1.clear();
                 short s=-1;
                 arr1.add(s);
                 return arr1;
             }

         }
         arr1.addAll(arr2);
         arr1.addAll(arr3);
         return arr1;

     }
     public static void main(String args[]) {
         Scanner s=new Scanner(System.in);
         List<Short> list=new ArrayList<Short>();
         int n=s.nextShort();
         for(int i=0;i<n;i++) {
            list.add(s.nextShort());
         }

          for(short i :zeroTwoSort(list)){
              System.out.print(i);

         }
             // System.out.print(i);

     }
 }