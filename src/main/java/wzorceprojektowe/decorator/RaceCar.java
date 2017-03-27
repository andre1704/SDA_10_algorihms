package wzorceprojektowe.decorator;

/**
 * Created by RENT on 2017-03-27.
 */
public class RaceCar implements Car {
    private Car car;
    public RaceCar(Car car){
        this.car=car;
    }

    @Override
    public void drive() {
        System.out.println("race car");
        car.drive();
    }
}
