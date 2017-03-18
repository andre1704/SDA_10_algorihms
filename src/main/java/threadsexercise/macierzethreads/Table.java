package threadsexercise.macierzethreads;

/**
 * Created by RENT on 2017-02-28.
 */
public class Table {
    public static int[][] dodajTablica(int x, int y){
        int[][] table=new int[x][y];
        for (int i = 0; i <y ; i++) {
            for (int j = 0; j <x ; j++) {
                table[i][j]=i+x*j+1;
            }
        }
        return table;
    }
    private static void printArray(int[][] array) {
        for (int y = 0; y < array[0].length; y++) {
            for (int x = 0; x < array.length; x++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int x=5;
        int y=5;
        printArray(dodajTablica(x,y));



    }
}
