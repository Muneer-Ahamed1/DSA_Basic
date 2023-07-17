import java.util.*;



 class Code1 {

    public int sumOfPrimeIndexValues(int[] input1,int input2) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<input2;i++) {
            if(isprime(i)) {
                arr.add(i);
            }
        }
        int sum=0;
        for(int i:arr) {
            sum+=input1[i];
        }
        return sum;
    }
    public boolean isprime(int n) {

        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
    public static void main(String arg[]) {
        Code1 um=new Code1();
        int[] arr1={10,20,30,40,50,60,70,80,90,100};
        int[] arr2={-1,-2,-3,3,4,-7};
        int[] arr3={-4,5};
        int[] arr4={234,372,81,2543};
        System.out.println();
        System.out.println(um.sumOfPrimeIndexValues(arr4,4));
        System.out.println(um.sumOfPrimeIndexValues(arr3,2));
        System.out.println(um.sumOfPrimeIndexValues(arr2,6));
        System.out.println(um.sumOfPrimeIndexValues(arr1,9));
    }




}
