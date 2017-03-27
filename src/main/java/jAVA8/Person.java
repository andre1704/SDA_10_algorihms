package jAVA8;

/**
 * Created by RENT on 2017-03-18.
 */
public class Person {
    private String firsNae;
    private String lastName;
    private String city;

    @Override
    public String toString() {
        return (" " +firsNae+"  "+lastName+"  "+city);
    }

    public String getFirsNae() {
        return firsNae;
    }

    public void setFirsNae(String firsNae) {
        this.firsNae = firsNae;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person(String firsNae, String lastName, String city) {

        this.firsNae = firsNae;
        this.lastName = lastName;
        this.city = city;
    }
}
