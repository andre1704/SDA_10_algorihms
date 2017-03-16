package pl.javaand.train.javand2.algorithms;

import java.util.List;

/**
 * Created by RENT on 2017-02-25.
 */
public class PrimaryName {
    public static void main(String[] args) {
//        int x=4;
//        boolean isPrimary=Primary.isPrimary(x);
//        System.out.println("liczba "+x+" jest pierwsza "+isPrimary);
//        Primary.printPrimaryNumberLessThan(40);
//        long start=System.nanoTime();
//        Primary.eartostenes(1000110);
//        long stop=System.nanoTime();
//        long czas=stop-start;
//        double czasSec=czas/1000000000;
//        System.out.println(czasSec);
        List<Integer> lista=Primary.primeFactors(160);
        System.out.println(lista.size());
        for(Integer it:lista){
            System.out.println(it);
        }
        List<Integer> lista2=Primary.primeFac(610);
        System.out.println(lista2.size());
        for(Integer it:lista2){
            System.out.println(it);
        }

    }
}
