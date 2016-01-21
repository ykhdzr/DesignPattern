import pattern.design.observer.HeavyFansImpl;
import pattern.design.observer.SlowyFansImpl;
import pattern.design.observer.SuperstarImpl;
import pattern.design.strategy.ComingSoonEvent;
import pattern.design.strategy.Event;
import pattern.design.strategy.OnSaleEvent;
import pattern.design.strategy.WithoutSchedule;

/**
 * Created by ykhdzr on 1/17/16.
 */
public class MainClass {

    public static void main(String[] args) {

        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// Strategy Pattern //////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////");
        Event onSale = new OnSaleEvent();
        onSale.showComponent();

        Event comingSoon = new ComingSoonEvent();
        comingSoon.showComponent();

        Event pendingEvent = new OnSaleEvent();
        pendingEvent.setEventType("On Sale(Cancelled)");
        pendingEvent.setEventComponent(new WithoutSchedule());
        pendingEvent.showComponent();
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// End Of Strategy Pattern //////////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();

        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// Observer Pattern //////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////");
        SuperstarImpl superstar = new SuperstarImpl("Yoko-Yo", "he");

        HeavyFansImpl heavyFans = new HeavyFansImpl(superstar);
        SlowyFansImpl slowyFans = new SlowyFansImpl(superstar);

        superstar.setSuperstarUpdates("Born to be awesome!", "Maldive", "Blessed");

        // Superstar feel scary of Heavy fans reaction
        System.out.println(superstar.getName() + " feel scary of Heavy fans reaction and decides to remove him");
        superstar.removeFans(heavyFans);

        superstar.setSuperstarUpdates("Born to be awesome!", "Maldive", "Blessed");

        // Slowy fans feel bored with Superstar updates
        System.out.println("Slowy fans feel bored with " + superstar.getName() + " updates and decide to unfollow him");
        slowyFans.unregister();

        superstar.setSuperstarUpdates("Born to be awesome!", "Maldive", "Blessed");
        System.out.println(superstar.getName() + " notices there is no more fans, so " + superstar.getGender() +
                " decides to quit from the entertainment job and go back as a programmer");
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// End Of Observer Pattern //////////////////////");
        System.out.println("/////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
    }
}
