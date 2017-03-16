package threadsexercise;

/**
 * Created by RENT on 2017-03-15.
 */
public class TestThreadRunnable implements Runnable {
    public static void main(String[] args) {
        TestThreadRunnable myRunnable=new TestThreadRunnable();
        Thread thread=new Thread((myRunnable));
        thread.start();
    }
    @Override
    public void run() {
        System.out.println("wątek uruchomiony");
    }
}
