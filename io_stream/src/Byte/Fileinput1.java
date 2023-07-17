package Byte;
import java.io.FileInputStream;
import java.io.IOException;

public class Fileinput1 {
    public static void main(String arg[]) throws IOException {
        FileInputStream fin=new FileInputStream("D:/JAVA/io_stream/Text/Text.txt");
        int b= fin.read();
        while(fin.available()!=0) {
            System.out.print(b);

            b=fin.read();

        }
    }
}
