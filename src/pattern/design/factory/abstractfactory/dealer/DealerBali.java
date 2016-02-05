package pattern.design.factory.abstractfactory.dealer;

import pattern.design.factory.abstractfactory.creator.AbstractMotorcycleFactory;
import pattern.design.factory.abstractfactory.creator.JapanMotorcycleFactory;
import pattern.design.factory.abstractfactory.product.Motorcycle;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class DealerBali extends AbstractDealer{

    @Override
    public String toString() {
        return "Dealer Bali at Jalan Senopati, Tabanan";
    }

    private AbstractMotorcycleFactory factory;

    @Override
    public Motorcycle buildMotorCycle(String type) {
        Motorcycle motorcycle = null;
        if (type.equals(AbstractMotorcycleFactory.VIXION)) {
            factory = new JapanMotorcycleFactory();
            motorcycle = factory.buildMotorcycle(type);
        } else if (type.equals(AbstractMotorcycleFactory.NINJA250)) {
            factory = new JapanMotorcycleFactory();
            motorcycle = factory.buildMotorcycle(type);
        }
        return motorcycle;
    }
}
