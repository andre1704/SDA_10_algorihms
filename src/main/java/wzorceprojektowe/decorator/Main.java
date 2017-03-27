package wzorceprojektowe.decorator;

/**
 * Created by RENT on 2017-03-27.
 */
public class Main {
    public static void main(String[] args) {
        Car car=new RaceCar((new Mustang()));
        car.drive();
    }
}
