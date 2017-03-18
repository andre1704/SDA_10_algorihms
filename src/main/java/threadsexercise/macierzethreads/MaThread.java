package threadsexercise.macierzethreads;

/**
 * Created by RENT on 2017-03-18.
 */
public class MaThread extends Thread {
    int[][] arrayX;
    int[][] arrayY;
    int startInd;
    int stopInd;
    int[][] wynik;

    MaThread(int startInd, int stopInd, int[][] arrayX, int[][] arrayY, int[][] wynik) {
        this.startInd = startInd;
        this.stopInd = stopInd;
        this.arrayX = arrayX;
        this.arrayY = arrayY;
        this.wynik = wynik;
    }

    @Override

    public void run() {
        for (int x = startInd; x < stopInd; x++) {
            for (int y = 0; y < wynik[0].length; y++) {

                int[] bColumn = arrayY[x];

                int[] aRow = new int[arrayX.length];
                for (int i = 0; i < aRow.length; i++) {
                    aRow[i] = arrayX[i][y];
                }

                int multSum = 0;
                for (int i = 0; i < aRow.length; i++) {
                    int mult = aRow[i] * bColumn[i];
                    multSum += mult;
                }

                wynik[x][y]=multSum;
            }

        }
    }
}
