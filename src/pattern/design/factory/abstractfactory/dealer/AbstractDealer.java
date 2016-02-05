package pattern.design.factory.abstractfactory.dealer;

import pattern.design.factory.abstractfactory.product.Motorcycle;

/**
 * Created by ykhdzr on 2/5/16.
 */
public abstract class AbstractDealer {

    public Motorcycle orderMotorcycle(String type) {
        Motorcycle motorcycle;
        motorcycle = buildMotorCycle(type);
        motorcycle.prepare();
        motorcycle.speed();
        motorcycle.acceleration();
        motorcycle.balance();
        System.out.println();
        System.out.println();
        return motorcycle;
    }

    public abstract Motorcycle buildMotorCycle(String type);
}
