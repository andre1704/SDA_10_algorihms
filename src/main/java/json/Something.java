package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-03-23.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Something {


    ArrayList<Weatcher> weather;
    Something(){}

    public ArrayList<Weatcher> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Weatcher> weather) {
        this.weather = weather;
    }

    public Something(ArrayList<Weatcher> weather) {

        this.weather = weather;
    }
}
