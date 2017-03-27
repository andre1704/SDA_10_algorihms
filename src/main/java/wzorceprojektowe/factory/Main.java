package wzorceprojektowe.factory;

/**
 * Created by RENT on 2017-03-27.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Mustang();
        car.drive();

        String name = "mustang";
        if (name.equals("mustang")) {
            car = new Mustang();
        } else {
            car = new Camaro();
        }


        Car car1=CarFactory.create("mustang");
        car1.drive();
    }
}
