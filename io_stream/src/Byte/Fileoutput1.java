package Byte;

import  java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Fileoutput1 {

    public static void main(String[] args) {
        // write your code here
        try {
            FileOutputStream fout = new FileOutputStream("D:/JAVA/io_stream/Text/Text.txt");
            String str="SHAIK MUNEER AHAMED";
            fout.write(str.getBytes());
            System.out.println("COMPLETE");


        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
