package Byte;

import com.sun.net.httpserver.Authenticator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Locale;

public class student_work {



    public static void main(String arg[]) throws IOException {
        FileInputStream fin=new FileInputStream("D:/JAVA/io_stream/Text/Text.txt");
        String str="";
        byte b[]=new byte[fin.available()];
        fin.read(b);
        str=new String(b);
        System.out.println(str);
        str=str.toLowerCase();

        FileOutputStream fout=new FileOutputStream("D:/JAVA/io_stream/Text/Text2.txt");
        fout.write(str.getBytes());
        FileInputStream fin1=new FileInputStream("D:/JAVA/io_stream/Text/Text2.txt");


        FileOutputStream fout1=new FileOutputStream("D:/JAVA/io_stream/Text/Text3.txt");
        FileInputStream f1=new FileInputStream("D:/JAVA/io_stream/Text/s1.txt");
        FileInputStream f2=new FileInputStream("D:/JAVA/io_stream/Text/s2.txt");





        SequenceInputStream sis=new SequenceInputStream(f1,f2);
        byte by=(byte) sis.read();
        while (by!=-1) {
            fout1.write(by);
            by=(byte) sis.read();
        }



        System.out.println("Success");
    }
}
