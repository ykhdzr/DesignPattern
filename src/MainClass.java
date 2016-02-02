import pattern.design.decorator.*;
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

        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////// [B]Strategy Pattern (FAVOR COMPOSITION OVER INHERITANCE) //////////////");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
        Event onSale = new OnSaleEvent();
        onSale.showComponent();

        Event comingSoon = new ComingSoonEvent();
        comingSoon.showComponent();

        Event pendingEvent = new OnSaleEvent();
        pendingEvent.setEventType("On Sale(Cancelled)");
        pendingEvent.setEventComponent(new WithoutSchedule());
        pendingEvent.showComponent();
        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////////////// End Of Strategy Pattern /////////////////////////////");
        System.out.println("////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// [B]Observer Pattern (Holywood Principle) //////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
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
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("/////////////////////////////// End Of Observer Pattern //////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// [S]Decorator Pattern (Open-Closed Principle) //////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        Salary engineerSalary = new EngineerSalary();
        engineerSalary = new LaptopPurchaseProgram(engineerSalary);
        engineerSalary = new Tax(engineerSalary);
        engineerSalary = new Jamsostek(engineerSalary);
        System.out.println(engineerSalary.getDesc());
        System.out.println("Total Deductions Rp " + PriceUtil.getPriceByLocale(engineerSalary.totalDeduction()));
        System.out.println("Net Salary " + PriceUtil.getPriceByLocale(engineerSalary.totalSalary()));
        System.out.println();
        System.out.println();

        // No Laptop Purchase Program
        Salary designerSalary = new DesignerSalary();
        designerSalary = new Tax(designerSalary);
        designerSalary = new Jamsostek(designerSalary);
        System.out.println(designerSalary.getDesc());
        System.out.println("Total Deductions Rp " + PriceUtil.getPriceByLocale(designerSalary.totalDeduction()));
        System.out.println("Net Salary " + PriceUtil.getPriceByLocale(designerSalary.totalSalary()));

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////// End Of Decorator Pattern ///////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
