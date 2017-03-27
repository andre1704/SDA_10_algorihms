package Mapy;

import java.util.Comparator;

/**
 * Created by RENT on 2017-03-22.
 */
public class Komparator implements Comparator<Data> {



    @Override
    public int compare(Data o1, Data o2) {
        int vDay = Integer.compare(o2.getDay(),o1.getDay());
        int vMonth = Integer.compare(o2.getMonth(),o1.getMonth());
        int vYear = Integer.compare(o2.getYear(),o1.getYear());
        if (vYear == 1) {
            return -1;
        } else if (vYear == 0) {
            if (vMonth == 0) {
                if (vDay == 0)
                    return 0;
                else if (vDay == 1)
                    return -1;
                else return 1;
            } else if (vMonth == 1) {
                return -1;
            } else
                return 0;
        } else
            return 1;
    }
}
