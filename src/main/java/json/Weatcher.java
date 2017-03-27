package json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by RENT on 2017-03-23.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weatcher {

    String description;
    public  Weatcher(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Weatcher(String description) {

        this.description = description;
    }
}
