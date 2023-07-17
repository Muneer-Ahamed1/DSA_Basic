public class point{
private int a;
private int b;
public point(int x,int y) {
    this.a=x;
    this.b=y;
}
public void print() {
    System.out.println(a);
    System.out.println(b);
}
int getx() {
    return a;
}
int gety() {
    return b;
}
double distance(point p2) {
    int x1=a-p2.getx();
    int y1=b-p2.gety();
    return x1*x1+y1*y1;
}
    public static void main(String[] args) {
	// write your code here
        point p1=new point(4,5);
        p1.print();
        System.out.println("p2..");
        point p2 = new point(10,5);
        p2.print();

        System.out.println(p1.distance(p2));

    }
}
