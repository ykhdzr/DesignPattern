package pattern.design.factory;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class DealerJakarta {

    private SimpleMotorcycleFactory simpleMotorcycleFactory;

    public DealerJakarta(SimpleMotorcycleFactory simpleMotorcycleFactory) {
        this.simpleMotorcycleFactory = simpleMotorcycleFactory;
    }

    public Motorcycle orderMotorcycle(String type) {
        Motorcycle motorcycle;
        motorcycle = SimpleMotorcycleFactory.buildMotorcycle(type);
        motorcycle.speed();
        motorcycle.acceleration();
        motorcycle.balance();
        return motorcycle;
    }

    @Override
    public String toString() {
        return "Dealer Jakarta at Jalan Senopati, Kebayoran baru";
    }
}
