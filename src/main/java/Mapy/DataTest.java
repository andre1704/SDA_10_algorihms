package Mapy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by RENT on 2017-03-22.
 */
public class DataTest {
    public static void main(String[] args) {
        ArrayList<Data> nova=new ArrayList<Data>();
        nova.add(new Data(12,12,1222));
        nova.add(new Data(12,12,1333));
        nova.add(new Data(2,9,1456));
        nova.add(new Data(8,1,1993));

        Collections.sort(nova);
        nova.stream().forEach(x-> System.out.println(x));

//        nova.stream().sorted();
//        System.out.println();
//        nova.stream().forEach(x-> System.out.println(x));


    }
}
