package pattern.design.factory.abstractfactory.dealer;

import pattern.design.factory.abstractfactory.creator.AbstractMotorcycleFactory;
import pattern.design.factory.abstractfactory.creator.IndonesiaMotorcycleFactory;
import pattern.design.factory.abstractfactory.creator.JapanMotorcycleFactory;
import pattern.design.factory.abstractfactory.product.Motorcycle;

/**
 * Created by ykhdzr on 2/5/16.
 */
public class DealerBekasi extends AbstractDealer {

    private AbstractMotorcycleFactory factory;

    @Override
    public Motorcycle buildMotorCycle(String type) {
        Motorcycle motorcycle = null;
        if (type.equals(AbstractMotorcycleFactory.VIXION)) {
            factory = new IndonesiaMotorcycleFactory();
            motorcycle = factory.buildMotorcycle(type);
        } else if (type.equals(AbstractMotorcycleFactory.NINJA250)) {
            factory = new JapanMotorcycleFactory();
            motorcycle = factory.buildMotorcycle(type);
        }
        return motorcycle;
    }

    @Override
    public String toString() {
        return "Dealer Bekasi at Jalan Dukuh, Jatiasih";
    }
}
