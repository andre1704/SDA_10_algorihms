package pl.javaand.train.javand2.algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by RENT on 2017-02-25.
 */
public class Primary {
    public static boolean isPrimary(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimaryNumberLessThan(int x) {
        for (int i = 1; i < x; i++) {
            if (isPrimary(i)) {
//                System.out.println(i);
            }
        }
    }

    public static void wypisz(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != -1)
                System.out.println(tab[i]);
        }

    }

    public static List<Integer> eartostenes(int x) {
        int sqrtX = (int) Math.sqrt(x);
        List<Integer> lista = new ArrayList<Integer>();
        int[] tab = new int[x + 1];
        for (int i = 0; i < x; i++) {
            tab[i] = i;
        }
        for (int i = 0; i < sqrtX; i++) {
            if (tab[i] != -1 && tab[i] >= 2) {
                for (int j = i; j < tab.length; j += i) {
                    if (tab[j] != i)
                        tab[j] = -1;
                }
            }

        }
        for (int i = 2; i < tab.length; i++) {
            if (tab[i] > -1) {
                lista.add(tab[i]);

            }
        }
        return lista;
    }

    public static List<Integer> primeFactors(int x) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int pom = x;
        do {
            for (int i = 2; i <= x; i++) {
                if (pom % i == 0) {
                    pom = pom / i;
                    lista.add(i);
                }
            }


        }
        while (pom != 1);
        return lista;
    }

    public static List<Integer> primeFac(int x) {
        List<Integer> lista = eartostenes(x);
        List<Integer> lista2 = new ArrayList<Integer>();
        int primeNumIndex = 0;
        while (x > 1) {
            Integer currentPrimNum = lista.get(primeNumIndex);
            if (x % currentPrimNum == 0) {
                x = x / currentPrimNum;
                lista2.add(currentPrimNum);
            } else {
                primeNumIndex++;
            }
        }
        return lista2;
    }
}

