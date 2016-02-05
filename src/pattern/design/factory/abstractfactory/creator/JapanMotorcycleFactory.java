package pattern.design.factory.abstractfactory.creator;

import pattern.design.factory.abstractfactory.product.Motorcycle;
import pattern.design.factory.abstractfactory.product.Ninja250;
import pattern.design.factory.abstractfactory.product.Vixion;

/**
 * Created by ykhdzr on 2/5/16.
 */
public class JapanMotorcycleFactory extends AbstractMotorcycleFactory {
    @Override
    public Motorcycle buildMotorcycle(String type) {
        System.out.println("Japan Factory");
        Motorcycle motorcycle = null;
        if (type.equals(VIXION)) {
            motorcycle = new Vixion();
        } else if (type.equals(NINJA250)) {
            motorcycle = new Ninja250();
        }
        return motorcycle;
    }
}
