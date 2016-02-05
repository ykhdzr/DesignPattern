package pattern.design.factory.abstractfactory.product;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class Vixion extends Motorcycle {

    @Override
    public void prepare() {
        System.out.println("Preparing for Vixion");
    }

    @Override
    public void speed() {
        System.out.println("Speed is 100");
    }

    @Override
    public void acceleration() {
        System.out.println("Acceleration is 80");
    }

    @Override
    public void balance() {
        System.out.println("Balance is 50");
    }
}
