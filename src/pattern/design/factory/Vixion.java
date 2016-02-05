package pattern.design.factory;

/**
 * Created by ykhdzr on 2/4/16.
 */
public class Vixion extends Motorcycle {

    @Override
    void prepare() {
        System.out.println("Preparing for Vixion");
    }

    @Override
    void speed() {
        System.out.println("Speed is 100");
    }

    @Override
    void acceleration() {
        System.out.println("Acceleration is 80");
    }

    @Override
    void balance() {
        System.out.println("Balance is 50");
    }
}
