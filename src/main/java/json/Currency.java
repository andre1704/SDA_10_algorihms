package json;

import java.util.Map;

/**
 * Created by RENT on 2017-03-23.
 */
public class Currency {
    String base;
    String date;
    Map<String,Double> rates;

    Currency(){
    }
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public Currency(String base, String date, Map<String, Double> rates) {

        this.base = base;
        this.date = date;
        this.rates = rates;
    }
}
