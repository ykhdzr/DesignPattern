package pattern.design.strategy;

/**
 * Created by ykhdzr on 1/17/16.
 */
public class WithSchedule implements EventComponent {
    @Override
    public void listComponent() {
        System.out.println("Title");
        System.out.println("Description");
        System.out.println("Location");
        System.out.println("Schedule");
    }
}
