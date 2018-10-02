package thread.interrupt;

import java.io.IOException;

/**
 * Created by tom on 2018/9/23.
 */
public class Interrupt1 extends Thread {
    public void run(){
        try{
            sleep(50000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Thread interrupt1 = new Interrupt1();
        System.out.println("wait 50 seconds ......");
        interrupt1.start();
        System.in.read();
        interrupt1.interrupt();
        System.out.println("is interrupt: " + interrupt1.isInterrupted());
        interrupt1.join();
        //only can be called once to show true, second time show false
        //System.out.println("is interrupt: " + interrupt1.isInterrupted());
        System.out.println("main thread end ......");
    }
}
