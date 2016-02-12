package pattern.design.factory.factory.product;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class Ninja250 extends Motorcycle {

    @Override
    public void prepare() {
        System.out.println("Preparing for Ninja 250");
    }

    @Override
    public void speed() {
        System.out.println("Speed is 200");
    }

    @Override
    public void acceleration() {
        System.out.println("Acceleration is 120");
    }

    @Override
    public void balance() {
        System.out.println("Balance is 100");
    }

    public String getName() {
        return Ninja250.class.getSimpleName();
    }
}
