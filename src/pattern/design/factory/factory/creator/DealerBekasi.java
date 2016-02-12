package pattern.design.factory.factory.creator;

import pattern.design.factory.factory.factory.AbstractMotorcycleFactory;
import pattern.design.factory.factory.factory.IndonesiaMotorcycleFactory;
import pattern.design.factory.factory.factory.JapanMotorcycleFactory;
import pattern.design.factory.factory.product.Motorcycle;
import pattern.design.factory.factory.product.Ninja250;
import pattern.design.factory.factory.product.Vixion;

/**
 * Created by ykhdzr on 2/5/16.
 */
public class DealerBekasi extends AbstractDealer {

    private AbstractMotorcycleFactory factory;

    public DealerBekasi() {
        AbstractMotorcycleFactory.addMotorcycle(Vixion.class.getSimpleName(), Vixion.class);
        AbstractMotorcycleFactory.addMotorcycle(Ninja250.class.getSimpleName(), Ninja250.class);
    }

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
