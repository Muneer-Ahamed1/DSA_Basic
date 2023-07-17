package inftq;
class Demo {
    public int value = 20;

    Demo() {
        value = 40;
    }
}

class Tester {
    static int a;
    public static void main(String args[]) {
        Demo demo = new Demo();
        System.out.println(demo.value+" "+a);
        float abc=175;
        System.out.println(Math.ceil(abc/8));
    }
}
