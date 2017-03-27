package jAVA8;

import java.util.Scanner;

/**
 * Created by RENT on 2017-03-18.
 */
public class JAVA8Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj x");
        int x = in.nextInt();
        System.out.println("podaj y");
        int y = in.nextInt();
        System.out.println("podaj znak");
        String znak = in.next();
        int wynik;

        Operation operation = null;
        if(operation.equals("+")){
            operation=new AddOperation();
        }else operation=new Substract();
        wynik= (int) operation.evaluete(x,y);
        System.out.println(wynik);

    }


    public static int sum(int x, int y) {
        return x + y;
    }

    public static int odej(int x, int y) {
        return x - y;
    }

}
