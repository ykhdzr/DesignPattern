package pattern.design.state;

/**
 * Created by ykhdzr on 3/15/16.
 */
/* Concrete State */
public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("PIN already entered");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > atmMachine.getCashInMachine()) {
            System.out.println("Out of cash");
            atmMachine.setATMState(atmMachine.getNoCardState());
        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cashToWithdraw);
            atmMachine.setATMState(atmMachine.getNoCardState());

            if(atmMachine.getCashInMachine() <= 0){
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }

        System.out.println("Card ejected");
    }
}
