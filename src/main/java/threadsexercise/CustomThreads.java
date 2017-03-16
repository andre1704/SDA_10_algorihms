package threadsexercise;

import java.util.Random;

/**
 * Created by RENT on 2017-03-16.
 */
public class CustomThreads {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[100000010];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        int pom=array.length/4;
        long start=System.nanoTime();
        int pomX=0;
        int minX=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(minX>array[i]){
                minX=array[i];
            }
        }
        double time=System.nanoTime()-start;

        System.out.println(minX);


        MyThread myThread1=new MyThread(pomX,pomX=pom,array);
        MyThread myThread2=new MyThread(pomX+1,pomX+=pom,array);
        MyThread myThread3=new MyThread(pomX+1,pomX+=pom,array);
        MyThread myThread4=new MyThread(pomX+1,pomX+=pom,array);
        long startY=System.nanoTime();
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread1.join();
        myThread2.join();
        myThread3.join();
        myThread4.join();
        int min1=myThread1.getWynik();
        int min2=myThread2.getWynik();
        int min3=myThread3.getWynik();
        int min4=myThread4.getWynik();
        int min = getMin(min1, min2, min3, min4);
        double timeY=System.nanoTime()-startY;
        System.out.println(min);
        System.out.println(time);
        System.out.println(timeY);


    }

    public static int getMin(int min1, int min2, int min3, int min4) {
        int min;
        if(min1<min2 && min1<min3 && min1<min4){
            min=min1;
        }else if (min2<min1&&min2<min3&&min2<min4){
            min=min2;
        }else if(min3<min1&&min3<min2&&min3<min4){
            min=min3;
        }else{
            min=min4;
        }
        return min;
    }


}
