package Mapy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by RENT on 2017-03-22.
 */
public class PiontExex {
    public static void main(String[] args) {
//        ArrayList<Point> nova= Arrays.asList(new Point(12,4),new Point(12,2),new Point(44,3),new Point(1,1));
        ArrayList<Point> nova=new ArrayList<Point>();
        nova.add(new Point(12,22));
        nova.add(new Point(12,5));
        nova.add(new Point(155,122));
        nova.add(new Point(2,9));
        Collections.sort(nova);
        nova.forEach(x-> System.out.println(x));

    }
}
