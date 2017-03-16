package threadsexercise;

/**
 * Created by RENT on 2017-03-15.
 */
public class StringThread extends Thread {
    public static void main(String[] args) {
        StringThread thread1=new StringThread("thread1");
        StringThread thread2=new StringThread("thread2");
        thread1.start();
        thread2.start();
    }
    private String name;
    StringThread(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+" "+i);
        }
    }
}
