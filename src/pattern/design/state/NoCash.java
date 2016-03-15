package pattern.design.state;

/**
 * Created by ykhdzr on 3/15/16.
 */
/* Concrete State */
public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have money, You didn't enter a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have money");
    }
}
