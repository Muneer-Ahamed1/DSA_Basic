import java.util.*;

 class Sltion {

    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        // Write your code here.
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for(int i:arr1) {
            if(hmp.containsKey(i)) {
                hmp.put(i,hmp.get(i));
            }
            else{
                hmp.put(i,1);
            }
        }
        ArrayList<Integer> array=new ArrayList<>();
        for(int i:arr2) {
            if(hmp.containsKey(i)) {
                array.add(i);
            }

        }
        return array;
    }
}