package pl.javaand.train.javand2.algorithms;

/**
 * Created by RENT on 2017-02-25.
 */
public class Kolo {
    final static int promien = 22;

    public static void kolo() {

        for (int i = -2*promien; i <= 2*promien; i++) {

            for (int j = -2*promien; j <= 2*promien; j++) {

                System.out.print(' ');
                if (Math.pow(j, 2) + Math.pow(i, 2) <=Math.pow(promien, 2))
                    System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        kolo();
    }


}
