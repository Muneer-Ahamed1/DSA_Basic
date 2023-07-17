package linear_ds;

public class digit {







    public int addDigits(int num) {

        int r=0;
        System.out.println(num);
        while(num>0) {
            r+=num%10;
            num/=10;
        }
       // System.out.println(r);


        if(r>10) {
            addDigits(r);
        }

        return r;

    }
    public static void main(String arg[]) {
        digit d=new digit();
        System.out.println(d.addDigits(38));
    }





}
