package wzorceprojektowe.singleton;

/**
 * Created by RENT on 2017-03-27.
 */
public class Singleton {
    private static final Singleton INSTANCE=new Singleton();

    private Singleton(){

    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }
}
