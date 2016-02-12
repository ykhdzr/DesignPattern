package pattern.design.factory.abstractfactory.factory;

import pattern.design.factory.abstractfactory.product.Motorcycle;
import pattern.design.factory.abstractfactory.sparepart.AbstractSparepartFactory;

import java.util.HashMap;

/**
 * Created by ykhdzr on 2/5/16.
 */
public abstract class AbstractMotorcycleFactory {
    public static final String VIXION = "Vixion";

    public static final String NINJA250 = "Ninja250";

    public abstract Motorcycle buildMotorcycle(String type, AbstractSparepartFactory sparepartFactory);

    protected static HashMap map;

    public static void addMotorcycle(String type, Class<? extends Motorcycle> motorcycle) {
        if (null == map) {
            map = new HashMap();
        }
        map.put(type, motorcycle);
    }
}
