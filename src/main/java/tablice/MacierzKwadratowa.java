package tablice;

/**
 * Created by RENT on 2017-02-28.
 */
public class MacierzKwadratowa {
    public static void transpozycja(int [][] data){
        int[][] tablica;
        for (int i = 0; i <data[0].length ; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] tablica={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        transpozycja(tablica);
    }
}
