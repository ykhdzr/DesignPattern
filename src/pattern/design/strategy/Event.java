package pattern.design.strategy;

/**
 * Created by ykhdzr on 1/17/16.
 */
public abstract class Event {

    public EventComponent eventComponent;

    public String eventType;

    public void showComponent(){
        System.out.println(eventType);
        System.out.println("------------");
        eventComponent.listComponent();
        System.out.println();
    }

    public void setEventComponent(EventComponent eventComponent) {
        this.eventComponent = eventComponent;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
