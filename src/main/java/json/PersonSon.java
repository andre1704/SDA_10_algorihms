package json;

/**
 * Created by RENT on 2017-03-22.
 */
public class PersonSon {
    String lastName;
    String firstName;
    String idNumber;
    String birthYear;
    PersonSon(){}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }



    public PersonSon(String firstName, String lastName, String birthYear, String idNumber, String jsonString) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.idNumber = idNumber;

    }


}
