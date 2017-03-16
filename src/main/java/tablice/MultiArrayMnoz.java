package tablice;

/**
 * Created by RENT on 2017-02-28.
 */
public class MultiArrayMnoz {
        public static void main(String[] args) {
            int[][] arrrayA = {{1, 3}, {2, 4}};
            System.out.println("Array A");
            printArray(arrrayA);
            System.out.println("----------------------------");

            int[][] arrrayB = {{5, 3}, {6, 4}, {7, 5}};
            System.out.println("Array B");
            printArray(arrrayB);
            System.out.println("----------------------------");


            int[][] result = multiplyArrays(arrrayA, arrrayB);
            System.out.println("RESULT");
            printArray(result);

        }

        private static int[][] multiplyArrays(int[][] arrayA, int[][] arrayB) {
            int[][] result = new int[arrayB.length][arrayA[0].length];

            for (int x = 0; x < result.length; x++) {
                for (int y = 0; y < result[0].length; y++) {

                    int[] bColumn = arrayB[x];

                    int[] aRow = new int[arrayA.length];
                    for (int i = 0; i < aRow.length; i++) {
                        aRow[i] = arrayA[i][y];
                    }

                    int multSum = 0;
                    for (int i = 0; i < aRow.length; i++) {
                        int mult = aRow[i]*bColumn[i];
                        multSum += mult;
//                    multSum += aRow[i]*bColumn[i];
                    }

//                int sum2 = 0;
//                for (int i = 0; i < arrayA.length; i++) {
//                    sum2 += arrayA[i][y]*arrayB[x][i];
//                    sum2 = sum2 + arrayA[i][y]*arrayB[x][i];
//                }


                    result[x][y] = multSum;

                }

            }


            return result;
        }

        private static void printArray(int[][] array) {
            for (int y = 0; y < array[0].length; y++) {
                for (int x = 0; x < array.length; x++) {
                    System.out.print(array[x][y] + " ");
                }
                System.out.println();
            }
        }

}
