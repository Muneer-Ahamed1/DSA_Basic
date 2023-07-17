import java.util.Collections;
import java.util.Scanner;

class olution{


public static int editorMiss(String str) {
    str=str.toLowerCase();
    int count=0;
    for(int i=0;i<str.length();i++) {
        char c=str.charAt(i);

        if(!(Character.isSpaceChar(c) || Character.isAlphabetic(c) || Character.isDigit(c))) {
            count++;

        }
    }
    return count;
}
public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
    System.out.print(editorMiss(s.nextLine()));
}
}
