package threadsexercise.macierzethreads;

/**
 * Created by RENT on 2017-02-28.
 */
public class MnozenieMacierzy {
    public static int[][] mnozenie(int[][] tablicaA, int[][] tablicaB) {
        int[][] tablicaOut = new int[tablicaB.length][tablicaA[0].length];
        for (int x = 0; x < tablicaOut.length; x++) {
            for (int y = 0; y < tablicaOut[0].length; y++) {
                int[] bColumn = tablicaB[x];
                int[] aRow = new int[tablicaA.length];
                for(int i=0;i<aRow.length;i++){
                    aRow[i]=tablicaA[i][y];
                }

                int multSum = 0;
                for (int i = 0; i < bColumn.length; i++) {
                    multSum+=aRow[i]*bColumn[i];
                }
                tablicaA[x][y] = multSum;

            }

        }
        return tablicaOut;
    }

    private static void printArray(int[][] array) {
        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array[0].length; x++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] tabA = {{1, 3}, {2, 4}};
        int[][] tabB = {{5, 3}, {6, 4}, {7, 5}};
        printArray(tabA);
        System.out.println();
        printArray(tabB);
        System.out.println();
        printArray(mnozenie(tabA, tabB));
    }
}
