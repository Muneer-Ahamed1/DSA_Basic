import java.util.*;



 class NewClass4 {
    public static void main(String[] args)
    {
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);
        Set<Map.Entry<Integer,Integer>> en=map.entrySet();
        Object[] arr=en.toArray();
      //  Set<Map.Entry<Integer,Integer>> a=(Set) arr[0];
        for(Object i:arr) {
            System.out.println(i);
        }
        




        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the HashMap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }

    }
}