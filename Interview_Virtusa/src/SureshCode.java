public class SureshCode {


    public int findStringWeight(int[] input1, String input2) {

        int num1 = 0;
        int num2 = 'a';
        int sum = 1;
        int sum1 = 0;
        String[] arr = input2.split(" ");

        for (String i : arr) {
            i = i.toLowerCase();
            for (int j = 0; j < i.length(); j++) {
                int num = i.charAt(j);
                num=num-num2;
                 if(input1[num]<0 && j==i.length()-1 || j==0) {
                     num1=input1[num]+(num+1);

                     sum1+=num1;
                 }
                 else {
                     sum1 += input1[num];
                 }
            }
            System.out.println(sum1);
            sum = sum1*sum;
            sum1 = 0;
        }

        return sum;


    }
    public static void main(String arg[]) {
        SureshCode sc=new SureshCode();
        int[] arr1={15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        int[] arr2={12,11,6,1,-1,23,12,1,28,-43,6,98,11,2,7,88,9,-4,-54,25,19,-12,-32,65,3,-9};
        String str1="Spring AND Hibernate";
        String str="Wipro Limited";
        System.out.println(sc.findStringWeight(arr2,str1));
        System.out.println(sc.findStringWeight(arr1,str));
    }
}
