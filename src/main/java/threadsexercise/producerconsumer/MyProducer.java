package threadsexercise.producerconsumer;

/**
 * Created by RENT on 2017-03-18.
 */
public class MyProducer extends Thread{
    private MyMessage message;

    public MyProducer(MyMessage message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println();
    }
}
