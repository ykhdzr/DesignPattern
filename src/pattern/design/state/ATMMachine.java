package pattern.design.state;

/**
 * Created by ykhdzr on 3/15/16.
 */
/* Context */
public class ATMMachine {

    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;

    private ATMState atmState;

    private int cashInMachine;

    public ATMMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;

        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;
        }
    }

    public void setATMState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    public void requestCash(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }

    public ATMState getHasCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }
}
