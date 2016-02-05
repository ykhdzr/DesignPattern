package pattern.design.factory.abstractfactory.creator;

import pattern.design.factory.abstractfactory.product.Motorcycle;

/**
 * Created by ykhdzr on 2/5/16.
 */
public abstract class AbstractMotorcycleFactory {
    public static final String VIXION = "Vixion";

    public static final String NINJA250 = "Ninja250";

    public abstract Motorcycle buildMotorcycle(String type);
}
