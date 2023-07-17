package PACKAGE001;

//package PACKAGE001;
import PACKAGE001.*;
import PACKAGE001.package002.minus;

public class base {



    public static void main(String[] args) {
	// write your code here
        int a=4;
        int b=4;
        sum ab=new sum();
        System.out.println(ab.add(a,b));
        minus m=new minus();
        System.out.println(m.sub(a,b));
    }
}
