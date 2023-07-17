package linear_ds;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'waiter' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */
    static List<Integer> st=new Stack<>();
    public static List<Integer> num(int i, List<Integer> ls) {
        List<Integer> lst=new Stack();
        for(int j:ls) {
            if(j%i==0) {
                st.add(j);
                //   System.out.print(st);
            }
            else{
                lst.add(j);
                //     System.out.println(lst);
            }
        }
        return lst;
    }

    public static List<Integer> waiter(List<Integer> number, int q) {
        // Write your code here
        //List<Integer> st=new Stack<>();
        int arr[]={2,3,5,7,11,13};
        List<Integer> ben=null;
        for(int i=0;i<q;i++) {

            if(i==0) {
                ben=num(arr[i],number);
                System.out.println(ben);
                continue;
            }

            System.out.println(ben);
            ben=num(arr[i],ben);



        }


        return st;}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> number = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.waiter(number, q);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
