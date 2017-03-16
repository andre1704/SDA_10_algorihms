package threadsexercise;

import java.util.Objects;

/**
 * Created by RENT on 2017-03-16.
 */
public class Deadlock {
    Object monitor1=new Object();
    Object monitor2=new Object();
    public static void main(String[] args) throws InterruptedException {
        Message message=new Message();
        Thread thread1=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000000; i++) {
                    message.setMsg("ABC");
                }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10000000; i++) {
                    message.setMsg("XYZ");
                }

            }
        };
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(message.getMsg());
    }
}
