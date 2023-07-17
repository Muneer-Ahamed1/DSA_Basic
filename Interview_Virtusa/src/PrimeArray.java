public class PrimeArray {


    public int sumOfArray(int[] input1,int n) {
        int sum=0;
        for(int i=0;i<input1.length;i++) {
            if(!isPrime(i,2)) {
                sum+=input1[i];
            }
        }
        return sum;

    }
    boolean isPrime(int n,int i) {




        // Corner cases
        if (n == 0 || n == 1)
        {
            return false;
        }

        // Checking Prime
        if (n == i)
            return true;

        // Base cases
        if (n % i == 0)
        {
            return false;
        }
        i++;
        return isPrime(n,i);
    }


        public static void main(String arg[]) {
        PrimeArray pa=new PrimeArray();
        int[] arr={-1,-2,-3,3,4,-7};
        System.out.println(pa.sumOfArray(arr,6));

    }



}
