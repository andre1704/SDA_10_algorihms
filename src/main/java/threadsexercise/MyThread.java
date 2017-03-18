package threadsexercise;

/**
 * Created by RENT on 2017-03-16.
 */
public class MyThread extends Thread {
    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    private static int startIndex = 0;
    private static int endIndex;
    private int wynik;
    private int[] table;


    MyThread(int startIndex, int endIndex, int[] table) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.table = table;
    }

    @Override
    public void run() {
        minFromArray(table, startIndex, endIndex);
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public int getWynik() {

        return wynik;
    }




    public int minFromArray(int[] array, int startIndex, int endIndex) {
        int min = array[startIndex];
        for (int i = startIndex; i <= endIndex; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        this.setWynik(min);
        return min;
    }
}
