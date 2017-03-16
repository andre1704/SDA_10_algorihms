package memory;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-03-15.
 */
public class VisualVMDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        for (int i = 1; i <1000000 ; i++) {
            ArrayList<Integer> integers=new ArrayList<>();
            for (int j = 0; j <1000 ; j++) {
                integers.add(j);
            }
            Thread.sleep(100000);
        }
    }
}
