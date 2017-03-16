package rekurencja;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-27.
 */
public class Reminder {
    public static List<Integer> reminder(int x) {
        if (x <= 0)
            return new ArrayList<Integer>();
        else {
            int[] nominals = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
            for (int nominal : nominals) {
                if (nominal <= x) {
                    x -= nominal;
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(x);
                    list.addAll(reminder(x));
                    return list;
                }
            }
        }return new ArrayList<Integer>();
    }

    public static void main(String[] args) {
       for(int r:reminder(147)){
           System.out.println(r);
       }
    }
}








