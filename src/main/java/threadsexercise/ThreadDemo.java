package threadsexercise;

/**
 * Created by RENT on 2017-03-15.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        TestThread testThread1=new TestThread();
        TestThread testThread2=new TestThread();
        TestThread testThread3=new TestThread();
        TestThread testThread4=new TestThread();
        TestThread testThread5=new TestThread();
        TestThread testThread6=new TestThread();
        TestThread testThread7=new TestThread();
        TestThread testThread8=new TestThread();
        testThread1.start();
        testThread2.start();
        testThread3.start();
        testThread4.start();
        testThread5.start();
        testThread6.start();
        testThread7.start();
        testThread8.start();
    }

}
