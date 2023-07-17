package linear_ds;

import java.util.ArrayList;

class abc{
    private void naruto() {
        System.out.println("PRIVATE");
    }
    public int divide(int num) {
        if (num == 0)
            return 0;
        else {
            System.out.print(num % 2);
            System.out.println(num);
            return divide(num / 2);
        }

    }

}



public class pack extends abc {

public void naruto() {
    System.out.println("BEN");
}
public static void main(String arg[]) {
    abc n= new pack();
    n.divide(10);

}

}
