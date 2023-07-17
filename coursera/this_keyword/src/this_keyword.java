/*
The this keyword refers to the current object in a method or constructor.

The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter). If you omit the keyword in the example above, the output would be "0" instead of "5".

this can also be used to:

Invoke current class constructor
Invoke current class method
Return the current class object
Pass an argument in the method call
Pass an argument in the constructor call

 */

public class this_keyword {
    int a;
    void not_this(this_keyword p) {
        a=a;
    }
    void yes_this(int a ) { this.a=a;
    this.print();}//invoke
    void print() {System.out.println(a);}

    public static void main(String[] args) {
	// write your code here
        this_keyword t1=new this_keyword();

        t1.print();
        t1.yes_this(10);
        t1.print();

    }
}
