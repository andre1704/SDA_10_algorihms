package threadsexercise;

import rekurencja.Fibonaci;

import java.util.Objects;

/**
 * Created by RENT on 2017-03-16.
 */
public class ThreadFibonaci {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        final boolean[] bol = {true};
        Thread thread1 = new Thread() {
            @Override
            public void run() {

                Fibonaci.fibonaci(33);
                bol[0] = false;
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                String[] strings = {"-", "\\", "|", "/"};
                while (bol[0]) {
                    for (String el : strings) {
                        System.out.println(el);
                        for (int i = 0; i < 10; i++) {
                            System.out.println();
                        }

                    }
                }
            }
        };


        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

}
