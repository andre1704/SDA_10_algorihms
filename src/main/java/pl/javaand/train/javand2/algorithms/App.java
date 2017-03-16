package pl.javaand.train.javand2.algorithms;

/**
 * Hello world!
 */

public class App {


    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] table = {4, 3, 7, 3, 2};
        ArrayAlg.deleteEven(table);

//        System.out.println(ArrayAlg.sum(table));
        ArrayAlg.wypisz(table);
        System.out.println("aaaaaaaaaaaaaaaaa");
        int [] nowa;
        nowa=ArrayAlg.odwrocona(table);
        ArrayAlg.wypisz(nowa);
        int [] now2;
        now2=ArrayAlg.sumaDwochTablic(table,nowa);
        ArrayAlg.wypisz(now2);
    }
}
