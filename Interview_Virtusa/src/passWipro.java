import java.util.*;
 class UserMainCode{


     public int findPIN(int a,int b,int c,int d) {
         int sum=0;
         int max1=maxFun(a);

         int max2=maxFun(b);
         int max3=maxFun(c);
         sum=(max1*max2*max3)+d;

     return sum;
     }

     int maxFun(int n) {

         int max=0;
         while(n!=0) {
             if(n%10>max) {
                 max=n%10;
             }
             n/=10;
         }


         return max;
     }

     public static void main(String arg[]) {

         UserMainCode umc=new UserMainCode();
System.out.println(         umc.findPIN(3521,2452,1352,38));

     }



 }