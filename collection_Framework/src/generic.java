import javax.print.DocFlavor;

public class generic<T1>
{
    private T1 t1;
    private  int value;
    generic(int value,T1 t1) {
        this.value=value;
        this.t1=t1;
    }
    void set(T1 t1) {
        this.t1=t1;
    }
    T1 get() {
        return t1;
    }
}
class main{
    public static void main(String arg[]) {
        generic<String> g=new generic<>(10,null);
        g.set("muneer");
        System.out.println(g.get());
    }
}