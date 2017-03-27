package Mapy;

/**
 * Created by RENT on 2017-03-22.
 */
public class Data implements Comparable {
    int day;
    int month;
    int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Data{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        if (o != null) {
            if (o instanceof Data) {
                Data d = (Data) o;
                int vDay = Integer.compare(day, d.getDay());
                int vMonth = Integer.compare(month, d.getMonth());
                int vYear = Integer.compare(year, d.getYear());
                if (vYear == 1) {
                    return 1;
                } else if (vYear == 0) {
                    if (vMonth == 0) {
                        if (vDay == 0)
                            return 0;
                        else if (vDay == 1)
                            return 1;
                        else return -1;
                    } else if (vMonth == 1) {
                        return 1;
                    } else
                        return 0;
                } else
                    return -1;


            }
        }

        return 1;
    }
}
