package pattern.design.factory.simplefactory.factory;

import pattern.design.factory.simplefactory.product.Motorcycle;

import java.util.HashMap;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class SimpleMotorcycleFactory {

    private static HashMap map;

    public static void addMotorcycle(String type, Class<? extends Motorcycle> motorcycle) {
        if (null == map) {
            map = new HashMap();
        }
        map.put(type, motorcycle);
    }

    public static Motorcycle buildMotorcycle(String type) {
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
