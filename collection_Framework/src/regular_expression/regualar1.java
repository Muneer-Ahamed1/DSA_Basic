package regular_expression;
class Test {
    public static void main(String args[]) {
        String regex1 = "Welcome.*";
        String str1 = "Welcome to India";

        String regex2 = "Welcome to (India|Mysore)";
        String str2 = "Welcome to Mysore";

        String regex3 = "[^Welcome]";
        String str3 = "1";

        System.out.println(str1.matches(regex1));
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex3));

    }
}