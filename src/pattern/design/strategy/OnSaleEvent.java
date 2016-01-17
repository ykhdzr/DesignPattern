package pattern.design.strategy;

/**
 * Created by ykhdzr on 1/17/16.
 */
public class OnSaleEvent extends Event {

    public OnSaleEvent() {
        eventType = "On Sale";
        eventComponent = new WithSchedule();
    }
}
