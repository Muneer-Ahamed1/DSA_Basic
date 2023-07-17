package Math;

public class Basic {
    public static void main(String arg[]) {
        double d=1;
        double ans=6;
        for(int i=0;i<3;i++) {
            d=d/10;
            //System.out.println("i="+i+"ans"+ans);
            for (double j=ans;j*j<37;j=j+d) {
                ans=j;
                System.out.println(ans+"d="+d);
            }
        }
        System.out.println(ans);
    }


}
