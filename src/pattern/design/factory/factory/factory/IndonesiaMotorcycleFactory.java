package pattern.design.factory.factory.factory;

import pattern.design.factory.factory.product.Motorcycle;

/**
 * Created by ykhdzr on 2/5/16.
 */
public class IndonesiaMotorcycleFactory extends AbstractMotorcycleFactory {

    @Override
    public Motorcycle buildMotorcycle(String type) {
        System.out.println("Indonesia Factory");
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
