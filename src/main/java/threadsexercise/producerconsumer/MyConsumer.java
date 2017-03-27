package threadsexercise.producerconsumer;

/**
 * Created by RENT on 2017-03-18.
 */
public class MyConsumer extends  Thread{
    private MyMessage message;

    public MyConsumer(MyMessage message) {
        this.message = message;
    }


}
