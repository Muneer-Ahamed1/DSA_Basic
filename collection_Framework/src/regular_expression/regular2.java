package regular_expression;

class Tester {
    public static void main(String args[]) {
        String regex1 = "[Employee].?";
        String str1 = "E";

        String regex2 = "[Employee].*";
        String str2 = "Employeee";

        String regex3 = "[P-Z]{8,10}";
        String str3 = "QRSTUVWX";

        String regex4 = "[Employee]+";
        String str4 = "Employeeeeee";

        System.out.println(str1.matches(regex1));
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex3));
        System.out.println(str4.matches(regex4));

    }
}