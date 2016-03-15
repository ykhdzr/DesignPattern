package pattern.design.state;

/**
 * Created by ykhdzr on 3/15/16.
 */
/* Concrete State */
public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("Correct PIN");
            atmMachine.setATMState(atmMachine.getHasPin());
        } else {
            System.out.println("Wrong PIN");
            System.out.println("Card ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN First");
    }
}
