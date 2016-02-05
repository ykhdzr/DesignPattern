package pattern.design.factory;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class Ninja250 extends Motorcycle {

    @Override
    void prepare() {
        System.out.println("Preparing for Ninja 250");
    }

    @Override
    void speed() {
        System.out.println("Speed is 200");
    }

    @Override
    void acceleration() {
        System.out.println("Acceleration is 120");
    }

    @Override
    void balance() {
        System.out.println("Balance is 100");
    }

    public String getName() {
        return Ninja250.class.getSimpleName();
    }
}
