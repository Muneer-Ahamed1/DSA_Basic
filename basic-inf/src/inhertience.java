/* class Customer {
    public Customer() {
        // 3: Parent constructor will be executed
        System.out.println("Creating a customer...");
        // 4: The flow will go back to the child constructor
    }
}
class RegularCustomer extends Customer {
    public RegularCustomer() {
        // 2: This constructor will then call the parent constructor
        System.out.println("It is a regular customer!");
        // 5: The flow will finally come here
    }
}
class Tester {
    public static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer();
        // 1: This line will be executed first and the flow will go to [2]
    }
}*/

//super
/*Please also note that the call to a super constructor has to be the first statement inside a constructor.

In fact, the parameterless constructor of the parent class gets implicitly called by the child class constructors due to an implicit super() statement. This can also be done explicitly as shown below.*/



/*class Customer {

    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public Customer() {
        System.out.println("Parent parameterless constructor");
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
        System.out.println("sddas");
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***************************");
        System.out.println("Customer Id : " + this.customerId);
        System.out.println("Customer Name : " + this.customerName);
        System.out.println();
    }

}

class RegularCustomer extends Customer {

    private float discount;

    public RegularCustomer(String custId, String custName) {

        super(custId,custName);


        this.discount = 5.0f;
        System.out.println("Child parameterized constructor");
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

}

class Tester {

    public static void main(String[] args) {

        RegularCustomer regularCustomer = new RegularCustomer("C1010", "Johns Kora");
        regularCustomer.displayCustomerDetails();

    }
}
*/
//super-2
class cal{
    int a;
    int b;
    cal() {
        a=10;
        this.b=0;
    }
    int sum(int a,int b) {
        return a+b;
    }
    int square(int x) {
        return x*x;
    }


}

class Main extends cal {
    int a, b;

    Main( int b, int c) {
        super();
        this.a = b;
        this.b = c;
    }

    void calculation() {
        int c = super.sum(a, b);
        int sq = super.square(c);
        System.out.println(sq + "" + c);
        System.out.println(super.a + " " + super.b);

    }

}
class bc {
    public static void main(String arg[]) {
        Main n=new Main(1,3);
        n.calculation();
    }


}
























