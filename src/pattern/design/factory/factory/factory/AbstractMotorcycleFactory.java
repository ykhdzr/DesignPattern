package pattern.design.factory.factory.factory;

import pattern.design.factory.factory.product.Motorcycle;

import java.util.HashMap;

/**
 * Created by ykhdzr on 2/5/16.
 */
public abstract class AbstractMotorcycleFactory {
    public static final String VIXION = "Vixion";

    public static final String NINJA250 = "Ninja250";

    public abstract Motorcycle buildMotorcycle(String type);

    protected static HashMap map;

    public static void addMotorcycle(String type, Class<? extends Motorcycle> motorcycle) {
        if (null == map) {
            map = new HashMap();
        }
        map.put(type, motorcycle);
    }
}
