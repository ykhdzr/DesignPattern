package pattern.design.state;

/**
 * Created by ykhdzr on 3/15/16.
 */
/* State */
public interface ATMState {

    /* State transitions */
    void insertCard();

    void ejectCard();

    void insertPin(int pinEntered);

    void requestCash(int cashToWithdraw);

}
