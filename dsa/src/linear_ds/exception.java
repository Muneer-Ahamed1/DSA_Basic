package linear_ds;

public class exception {
    public static void main(String arg[]) {
        try{
            throw new Error();
        }
        catch (Throwable t) {
            System.out.println(t);
        }
    }
}
