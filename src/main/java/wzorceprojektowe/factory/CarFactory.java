package wzorceprojektowe.factory;

/**
 * Created by RENT on 2017-03-27.
 */
public class CarFactory {
    public static Car create(String name){
        if (name.equals("mustang"))
            return new Mustang();
        else
            return new Camaro();
    }
}
