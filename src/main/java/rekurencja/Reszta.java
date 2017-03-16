package rekurencja;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-27.
 */
public class Reszta {

    final static int[] tab = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
    static ArrayList<Integer> lista = new ArrayList<Integer>();

    public static ArrayList<Integer> reszta(int x) {
        int i = 0;
        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        while (x / tab[i] ==0) {
            i++;
        }
        if (x % tab[i] > 0) {
            x = x % tab[i];
            lista2.add(x);
            lista.addAll(lista2);
            reszta(x);
        }
        return lista;

    }

    public static void main(String[] args) {
        for (int r: reszta(147)){
            System.out.println(r);
        }
    }

}
