import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.*;
public class hashmap{
    public static void main(String arg[]) {
        Map<String,Integer> mp=new HashMap<>();
        mp.put("as",1);
        mp.put("gas",22);
        mp.put("has",32);
        mp.put("ras",52);
        mp.put("nas",62);
        mp.remove("as");
        mp.values();
        mp.keySet();
        mp.size();
       // mp.
        mp.replace("has",32,1000);
        System.out.println(mp.containsKey("nas"));
        System.out.println(mp.containsValue(52));

        Set<Map.Entry<String,Integer>> s=mp.entrySet();
        for(Map.Entry i:mp.entrySet()) {
            System.out.println(i);
            System.out.println("KEY"+i.getKey());
            System.out.println("VALUE"+i.getValue());
        }



    }
}