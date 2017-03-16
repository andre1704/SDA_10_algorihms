package pl.javaand.train.javand2.algorithms;

/**
 * Created by RENT on 2017-02-25.
 */
public class ArrayAlg {
    public static int sum(int[] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum = sum + table[i];
        }
        return sum;
    }

    public static void deleteEven(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 2 == 0) {
                table[i] = -1;
            }
        }
    }

    public static void wypisz(int[] table) {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
    public static int[] odwrocona(int [] tablica){
        int [] tab=new int[tablica.length];
        for (int i = 0; i < tab.length; i++) {
            tab[i]=tablica[tablica.length-1-i];
        }
        return tab;

    }
    public static int [] sumaDwochTablic(int [] tab1, int[] tab2){
        int [] nowa=new int[tab1.length];
        for (int i = 0; i <nowa.length ; i++) {
            nowa[i]=tab1[i]+tab2[i];
        }
        return nowa;

    }

}
