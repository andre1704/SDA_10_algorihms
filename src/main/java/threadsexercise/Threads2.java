package threadsexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by RENT on 2017-03-16.
 */
public class Threads2 {
    public static void main(String[] args) throws InterruptedException {
        final List<Integer> ints=new ArrayList<>();
        Object object=new Object();
        Thread thread1=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100000 ; i++) {
                    synchronized (object){
                        ints.add(i);
                    }
                }
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100000 ; i++) {
                    synchronized (object){
                        ints.add(i);
                    }
                }
            }
        };
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("rozmiar list "+ints.size());
    }
}
