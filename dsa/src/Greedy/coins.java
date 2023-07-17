package Greedy;
import java.util.*;
import java.util.*;
class Solution {
    public int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);

        ArrayList<Integer> array=new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--) {
            if(coins[i]<amount) {
                int c=amount/coins[i];
                System.out.println(c);
                array.add(c);
                amount=amount-(coins[i]*c);
            }
        }
        if(array.size()==0) {
            int i=-1;
            array.add(Integer.valueOf(i));
        }

        return array.size()+1;

    }
    public static void main(String arg[]) {
        Solution s=new Solution();
        System.out.println(s.coinChange(new int[]{1,2,5},11));
    }
}