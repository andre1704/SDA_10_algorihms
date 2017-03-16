package rekurencja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by RENT on 2017-02-25.
 */
public class Fibonaci {
    public static int fibonaci(int x) {
        int y = 1;
        if (x > 2)
            y = fibonaci(x - 1) + fibonaci(x - 2);
        return y;
    }

    public static void main(String[] args) {
        System.out.println(fibonaci(3333));
    }
}

//    public static List<Integer> fibonaci(int x) {
//        if (x == 1) {
//            List<Integer> list = new ArrayList<Integer>();
//            list.add(1);
//            return list;
//        } else {
//            if (x == 2) {
//                List<Integer> list = new ArrayList<Integer>();
//                list.add(1);
//                list.add(1);
//                return list;
//            } else {
//                List<Integer> list = new ArrayList<Integer>();
//                List<Integer> fibprevious = fibonaci(x - 1);
//                int lastElem = list.get(fibprevious.size() - 1);
//                int prevlastElem = list.get(fibprevious.size() - 2);
//                int currentElem = lastElem + prevlastElem;
//                fibprevious.add(currentElem);
//                return fibprevious;
//            }
//        }
//    }
//}
