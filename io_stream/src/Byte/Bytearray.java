package Byte;
import java.io.*;
public class Bytearray {

    public static void main(String arg[]) throws IOException {
        String string="JHHSKGUS";
        ByteArrayInputStream bip=new ByteArrayInputStream(string.getBytes());
        byte[] b=new byte[bip.available()];
        bip.read(b);
        String str=new String(b);
        System.out.println(str);
        ByteArrayOutputStream bout=new ByteArrayOutputStream(bip.available());
        bout.write(b);
        FileOutputStream fo=new FileOutputStream("D:/JAVA/io_stream/Text/Text3.txt");
        bout.writeTo(fo);
    }

}
