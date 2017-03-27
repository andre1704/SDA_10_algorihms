package wzorceprojektowe.builder;

/**
 * Created by RENT on 2017-03-27.
 */
public class Person {
    public static void main(String[] args) {
        Person person=new Builder("Kowal","234532").build();
    }

    private String name;
    private String lastname;
    private String id;
    private double weight;
    private int birthYear;
    private String hairColor;


    public static class Builder{
        private String name;
        private String lastname;
        private String id;
        private double weight;
        private int birthYear;
        private String hairColor;
        public Builder(String name, String id){
            this.name=name;
            this.id=id;
        }

        public Person build(){
            Person person=new Person();
            person.id=id;
            person.name=name;
            person.lastname=lastname;
            person.birthYear=birthYear;
            person.hairColor=hairColor;
            person.weight=weight;
            return person;
        }

    }

}
