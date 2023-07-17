public class java_basic {
    public static  void main(String arg[]) {
        /*int a=10;
        int b=5;
        System.out.println(a>b);
        System.out.println(! (a>b));
        //terneray operator
        int pok=(a<b) ? a:b;
        System.out.println(pok);
        //bitwise
        int c=a|b;
        System.out.println(c);
        int d=a&b;
        System.out.println(d);
        float f =7474.33f;
        int ab=(int) f;
        System.out.println(ab);


s
        sh

        float f = 12;
        switch (f) { // Line 1
            case 10 + 1: // Line 2
                System.out.println("Twelve");
            case 0: // Line 3
                System.out.println("Zero");
            case (int) 12.0:
                System.out.println("Decimal");
            default:
                System.out.println("Default");
        }
        double i;
        char j='b';

        switch (j) {
            case 'a':
            case 'A':
                i = 7.5;
                break;
            case 'b':
            case 'B':
                i = 5.5;
                break;

            case 'c':
            case 'C':
                i = 2.5;
                break;

            default:
                i = 0.5;
        }




        int num1 = 20;
        double num2 = 0;
        if (num1 >= 20)
            num2 = 1.5;
        if (num1 < 30)
            num2 = 2;
        System.out.println("Value of num2 is " + num2);*/


        int sum = 0;
        for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1) {
            sum += i;
            System.out.println(i+" "+j);
        }
        System.out.println(sum);



        int i = 0;
        for (; i <= 3; i++) {
            System.out.println(i);
            if (i++ % 2 == 0) {
                System.out.println("i = " + i);
            }
            System.out.println(i);
        }
        System.out.println("i after the loop = " + i);

        int num1 = 0;
        int num2 = 0;
        for (int k = 0; k < 5; k++) {
            System.out.println(num1+ " ad"+num2);
            if ((++num1 > 2) && (++num2 > 2)) {
                num1++;
            }
        }
        System.out.println(num1 + " and " + num2);

















    }







    }


