package pl.javaand.train.javand2.algorithms;

/**
 * Created by RENT on 2017-03-04.
 */
public class Date {
    public static final int MIN_DAY = 0;
    public static final int MAX_DAY = 31;
    public static final int MIN_YEAR = 0;
    public static final int MIN_MONTH = 1;
    public static final int MAX_MONTH = 12;
    public static final int[] DAYS_PER_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= MIN_DAY && day <= MAX_DAY) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Błędna data, niepoprawny dzień");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= MIN_MONTH && month <= MAX_MONTH) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Błędna data, niepoprawny miesiac");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > MIN_YEAR)
            this.year = year;
        else
            throw new IllegalArgumentException("Błędna data, niepoprawny rok");
    }

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void addMonth(int x) {

        month += x;
        addYear((month -1)/ MAX_MONTH);
        month = (month-1) % MAX_MONTH+1;
    }

    public void addYear(int x) {
        year += x;
    }

    public void addDay(int x) {
        if(x>=0){
            while(x>0){
                if(x>=DAYS_PER_MONTH[month-1]){
                    x=x-DAYS_PER_MONTH[month-1];
                    addMonth(1);
                }else{
                    day+=x;
                    break;
                }
            }

        }else
            throw new IllegalArgumentException("nie odejmujemy dni");

//ALTERNATYWA
//        public void addDay(int x) {
//            day += x;
//            while (day > DAYS_PER_MONTH[month - 1]) {
//                day -= DAYS_PER_MONTH[month - 1];
//                addMonth(1);
//            }
//        }


    }
    public void addDate(Date date){
        addYear(date.year);
        addMonth(date.month);
        addDay(date.day);
    }
}



