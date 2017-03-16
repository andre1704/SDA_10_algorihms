package threadsexercise;

/**
 * Created by RENT on 2017-03-15.
 */
public class TestThread extends Thread {
    @Override
    public void run() {

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < 50000; i++) {
            s += "ABC";

        }
        double duration = System.nanoTime() - start;
        duration = duration / 1_000_000_000d;
        System.out.println(duration);

    }
}
