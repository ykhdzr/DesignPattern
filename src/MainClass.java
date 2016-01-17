import pattern.design.strategy.ComingSoonEvent;
import pattern.design.strategy.Event;
import pattern.design.strategy.OnSaleEvent;
import pattern.design.strategy.WithoutSchedule;

/**
 * Created by ykhdzr on 1/17/16.
 */
public class MainClass {

    public static void main(String[] args){

        // Strategy Pattern
        Event onSale = new OnSaleEvent();
        onSale.showComponent();

        Event comingSoon = new ComingSoonEvent();
        comingSoon.showComponent();

        Event pendingEvent = new OnSaleEvent();
        pendingEvent.setEventType("On Sale(Cancelled)");
        pendingEvent.setEventComponent(new WithoutSchedule());
        pendingEvent.showComponent();

    }
}
