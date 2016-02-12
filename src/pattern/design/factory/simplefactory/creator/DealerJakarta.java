package pattern.design.factory.simplefactory.creator;

import pattern.design.factory.simplefactory.factory.SimpleMotorcycleFactory;
import pattern.design.factory.simplefactory.product.Motorcycle;
import pattern.design.factory.simplefactory.product.Ninja250;
import pattern.design.factory.simplefactory.product.Vixion;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class DealerJakarta {

    public DealerJakarta() {
        SimpleMotorcycleFactory.addMotorcycle(Vixion.class.getSimpleName(), Vixion.class);
        SimpleMotorcycleFactory.addMotorcycle(Ninja250.class.getSimpleName(), Ninja250.class);
    }

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
