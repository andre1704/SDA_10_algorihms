package threadsexercise;

/**
 * Created by RENT on 2017-03-18.
 */
public class MySearchThread extends Thread {
    MyThread[] myThreads;
    static int startInd = 0;
    static int endInd=0;
    private int threadNumber;
    private int wynik;

    int []array;

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    @Override
    public void run() {
        myThreads=new MyThread[threadNumber];
        int pom=array.length/threadNumber;
        for (int i = 0; i < threadNumber; i++) {
            startInd=i*pom;
            endInd=(i+1)*pom-1;
            myThreads[i] = new MyThread(startInd, endInd, array);
            myThreads[i].start();
        }
        for(MyThread el:myThreads){
            try {
                el.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        wynik=minValue();
        System.out.println(wynik);
    }

    MySearchThread(int[] array, int threadNumber) {
        this.threadNumber=threadNumber;
        this.array=array;

    }
    public int minValue(){
        int min=myThreads[0].getWynik();
        for (int i = 0; i <myThreads.length ; i++) {
            if(myThreads[i].getWynik()<min){
                min=myThreads[i].getWynik();
            }
        }
        return min;
    }




}
