package pattern.design.factory.simplefactory.dealer;

import pattern.design.factory.simplefactory.creator.SimpleMotorcycleFactory;
import pattern.design.factory.simplefactory.product.Motorcycle;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class DealerJakarta {

    @Override
    public String toString() {
        return "Dealer Jakarta at Jalan Senopati, Kebayoran baru";
    }

    public Motorcycle orderMotorcycle(String type) {
        Motorcycle motorcycle;
        motorcycle = SimpleMotorcycleFactory.buildMotorcycle(type);
        motorcycle.prepare();
        motorcycle.speed();
        motorcycle.acceleration();
        motorcycle.balance();
        System.out.println();
        System.out.println();
        return motorcycle;
    }
}
