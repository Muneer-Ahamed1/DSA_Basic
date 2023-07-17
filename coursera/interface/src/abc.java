
public class abc {
    public static void main(String arg[]) {

        KidUsers k = new KidUsers(11, "no");
        k.registerAccount();
        k.requestBook();
        AdultUsers a = new AdultUsers(23, "FACT");
        a.registerAccount();
        a.requestBook();
    }
}
