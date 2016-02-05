package pattern.design.factory;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class SimpleMotorcycleFactory {

    public static final String VIXION = "Vixion";

    public static final String NINJA250 = "Ninja250";

    public static Motorcycle buildMotorcycle(String type) {
        Motorcycle motorcycle = null;
        if (type.equals(VIXION)) {
            motorcycle = new Vixion();
        } else if (type.equals(NINJA250)) {
            motorcycle = new Ninja250();
        }
        return motorcycle;
    }

}
