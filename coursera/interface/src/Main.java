import java.util.HashMap;

interface LibraryUser {
    void registerAccount();
    void requestBook();
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    KidUsers(int age,String bookType){
        this.age=age;
        this.bookType=bookType;
    }
    public void registerAccount() {
        if(age<12){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public void requestBook() {
        if(bookType == "KIDS") {System.out.println("KIDOO");}
        else{System.out.println("SOORRYY");}
    }
}


class AdultUsers implements LibraryUser{
    int age;
    String bookType;
    AdultUsers(int age,String bookType){
        this.age=age;
        this.bookType=bookType;
    }
    public void registerAccount() {
        if(age>12){
            System.out.println("Yah");
        }
        else{
            System.out.println("Nah");
        }
    }
    public void requestBook() {
        if(bookType == "FACT") {System.out.println("FACT");}
        else{System.out.println("FML");}
    }
}
                        //...........HASHMAP........

class Hashing{
    public static void main(String arg[]) {

        HashMap<Character,int> h=new HashMap<Character, int>();


    }
}




public class Main{
    public static void main(String arg[]) {

        KidUsers k=new KidUsers(11,"no");
        k.registerAccount();
        k.requestBook();
        AdultUsers a=new AdultUsers(23,"FACT");
        a.registerAccount();
        a.requestBook();
    }
}



