package threadsexercise.macierzethreads;

/**
 * Created by RENT on 2017-02-28.
 */
public class MultiArray {
    public static void main(String[] args) {
//        int[] array=new int[10];
//        int[] array2=new int[]{1,2,3};
//        int[] array3={1,2,3};
//
//        int[][] array4=new int[10][];
//        int[][] array5=new int[10][10];
//        int[][] array6=new int[][]{{1,2},{3,4}};
//
//        int[] embArr=array6[0];
//        int b=array6[0][1];

        int[][] array6 = new int[][]{
                {1, 2, 3},
                {3, 4, 5},
                {10, 20, 80}
        };
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                System.out.print(array6[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                System.out.print(array6[j][i] + " ");

            }
            System.out.println();


        }
        //TABLICA KOLUMN arr[x][y]
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int j = 0; j < array[0].length; j++) {
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k][j] + " ");

            }
            System.out.println();
        }

    }
}


