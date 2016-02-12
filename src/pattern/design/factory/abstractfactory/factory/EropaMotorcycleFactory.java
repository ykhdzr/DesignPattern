package pattern.design.factory.abstractfactory.factory;

import pattern.design.factory.abstractfactory.product.Motorcycle;
import pattern.design.factory.abstractfactory.sparepart.AbstractSparepartFactory;

/**
 * Created by ykhdzr on 2/5/16.
 */
public class EropaMotorcycleFactory extends AbstractMotorcycleFactory {

    @Override
    public Motorcycle buildMotorcycle(String type, AbstractSparepartFactory sparepartFactory) {
        System.out.println("Eropa Factory");
        sparepartFactory.setTires();
        sparepartFactory.setKnalpot();
        Motorcycle motorcycleObj = null;
        try {
            Class<?> motorcycleClass = (Class<?>) map.get(type);
            motorcycleObj = (Motorcycle) motorcycleClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return motorcycleObj;
    }
}
