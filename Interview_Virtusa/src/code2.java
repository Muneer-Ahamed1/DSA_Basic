import java.util.ArrayList;

public class code2 {
public int PositionBasedSum(int[] input1,int input2) {
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<input2;i++) {
        int n=(int)Math.pow(10,i);

        if(n<=input1[i]) {
            int num=input1[i]/n;
            num=num%10;
            arr.add(num);


        }
        else
        {
            arr.add(0);
        }
    }
    System.out.println(arr);

    for(int i=0;i<arr.size();i++) {
        int num=(int)Math.pow(arr.get(i),2);
        arr.set(i,num);
    }
    int sum=0;
    for(int i:arr) {
        sum+=i;
    }
    return sum;
}
public static void main(String arg[]) {
    code2 cd=new code2();
    int[] arr1={1,51,436,7860,41236};
    int[] arr2={234,372,81,2543};
    System.out.println(cd.PositionBasedSum(arr2,4));
    System.out.println(cd.PositionBasedSum(arr1,5));

}

}
