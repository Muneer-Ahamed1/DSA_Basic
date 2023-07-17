public class Exception {
    int a;
    Exception(int a) {
        a=a;
        System.out.print(a);
    }
    public static void main(String arg[]) {
        int a=3;
        int c=0;
        try {
            c=a/2;
        }
        finally {
            System.out.print(c);
        }
        Exception e=new Exception(3);

    }
}
