package pattern.design.strategy;

/**
 * Created by ykhdzr on 1/17/16.
 */
public class ComingSoonEvent extends Event {

    public ComingSoonEvent() {
        eventType = "Coming Soon";
        eventComponent = new WithoutSchedule();
    }

}
