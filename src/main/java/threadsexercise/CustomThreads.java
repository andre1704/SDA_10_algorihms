package threadsexercise;

import java.util.Random;

/**
 * Created by RENT on 2017-03-16.
 */
public class CustomThreads {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[12];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(22);
        }
        for(int el:array){
            System.out.println(el);
        }
        MySearchThread mySearchThread=new MySearchThread(array,3);
        mySearchThread.start();
    }
}
