package wzorceprojektowe.singleton;

/**
 * Created by RENT on 2017-03-27.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();

        return instance;
    }
}
