package threadsexercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by RENT on 2017-03-18.
 */
public class MyExecutors {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(1);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello 1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end 1");
            }
        };
        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end 2");
            }
        };

        executorService.submit(runnable);
        executorService.submit(runnable2);
    }
}
