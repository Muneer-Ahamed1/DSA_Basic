 class add {
    private int a;
    private int b;
    public void set(int a,int b) {
        this.a=a;
        this.b=b;
    }
    public void get() {
        System.out.println(a+","+b);
    }
    public int  addition() {
        return a+b;
    }
}
class ad{
    public static void main(String arg[]) {
        add a=new add();
//        a.a=23;
  //      a.b=12;
        a.get();

    }
}
