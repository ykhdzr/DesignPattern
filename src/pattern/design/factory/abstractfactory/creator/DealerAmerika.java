package pattern.design.factory.abstractfactory.creator;

import pattern.design.factory.abstractfactory.factory.AbstractMotorcycleFactory;
import pattern.design.factory.abstractfactory.factory.EropaMotorcycleFactory;
import pattern.design.factory.abstractfactory.factory.AmerikaMotorcycleFactory;
import pattern.design.factory.abstractfactory.product.Motorcycle;
import pattern.design.factory.abstractfactory.product.Ninja250;
import pattern.design.factory.abstractfactory.product.Vixion;
import pattern.design.factory.abstractfactory.sparepart.AbstractSparepartFactory;

/**
 * Created by ykhdzr on 2/5/16.
 */
public class DealerAmerika extends AbstractDealer {

    private AbstractMotorcycleFactory factory;

    public DealerAmerika() {
        AbstractMotorcycleFactory.addMotorcycle(Vixion.class.getSimpleName(), Vixion.class);
        AbstractMotorcycleFactory.addMotorcycle(Ninja250.class.getSimpleName(), Ninja250.class);
    }

    @Override
    public Motorcycle buildMotorCycle(String type, AbstractSparepartFactory sparepartFactory) {
        Motorcycle motorcycle = null;
        if (type.equals(AbstractMotorcycleFactory.VIXION)) {
            factory = new EropaMotorcycleFactory();
            motorcycle = factory.buildMotorcycle(type, sparepartFactory);
        } else if (type.equals(AbstractMotorcycleFactory.NINJA250)) {
            factory = new AmerikaMotorcycleFactory();
            motorcycle = factory.buildMotorcycle(type, sparepartFactory);
        }
        return motorcycle;
    }

    @Override
    public String toString() {
        return "Dealer Amerika at Sesame street";
    }
}
