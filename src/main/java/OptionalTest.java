import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by RENT on 2017-03-21.
 */
public class OptionalTest {
    public static void main(String[] args) {

        Optional<Double> a = Optional.of(1.0);
        Optional<Double> b = Optional.of(1.0);
        Optional<Double> c = Optional.of(1.0);


        Optional<List<Double>> opd = findZeroValues(a, b, c);
        opd.get().stream().forEach(x -> System.out.println(x));

    }

    public static Optional<List<Double>> findZeroValues(Optional<Double> a, Optional<Double> b, Optional<Double> c) {

        if (!a.isPresent()) {
            throw new NullPointerException();
        }
        if (!b.isPresent()) {
            throw new NullPointerException();
        }
        if (!c.isPresent()) {
            throw new NullPointerException();
        }

        double delta = Math.pow(b.get(), 2.0) - (4 * a.get() * c.get());
        double x1 = (-b.get() + Math.sqrt(delta)) / (2 * a.get());
        double x2 = (-b.get() - Math.sqrt(delta)) / (2 * a.get());
        List<Double> lista = new ArrayList<>();
        lista.add(x1);
        lista.add(x2);

        Optional<List<Double>> optional = Optional.of(lista);

        return optional;
    }
}
