package Byte;

import java.io.*;

class producer extends Thread{
    Writer out;
    static byte count=0;
    producer(Writer out) {
        this.out=out;
    }
    public void run() {
        while(true){try{
            out.write(count);
            ++count;
            out.flush();
            System.out.flush();
            //Thread.sleep(10);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}}
class consumer extends Thread {
    Reader in;
    consumer(Reader in) {
        this.in=in;
    }
    int x;
    public void run() {
  while(true){      try {
            x = in.read();
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }}}
public class Producer_consumer {
public static void main(String arg[]) throws IOException {
    PipedReader pin=new PipedReader();
    PipedWriter pout=new PipedWriter();
    pout.connect(pin);
    producer p=new producer(pout);
    consumer c=new consumer(pin);
    p.start();
    c.start();
}

    }
