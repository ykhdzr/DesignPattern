import pattern.design.factory.abstractfactory.creator.DealerAmerika;
import pattern.design.factory.abstractfactory.creator.DealerEropa;
import pattern.design.factory.abstractfactory.sparepart.OffRoadSparepart;
import pattern.design.factory.abstractfactory.sparepart.OnRoadSparepart;
import pattern.design.factory.factory.creator.DealerBali;
import pattern.design.factory.factory.creator.DealerBekasi;
import pattern.design.factory.factory.factory.AbstractMotorcycleFactory;
import pattern.design.factory.simplefactory.creator.DealerJakarta;

/**
 * Created by ykhdzr on 1/17/16.
 */
public class MainClass {

    public static void main(String[] args) {

        /*System.out.println("////////////////////////////////////////////////////////////////////////////////////");
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
        System.out.println();*/

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// [C]Factory Pattern (Dependency Inversion) //////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        // Simple Factory
        DealerJakarta dealerJakarta = new DealerJakarta();
        System.out.println(dealerJakarta);
        dealerJakarta.orderMotorcycle("Vixion");
        dealerJakarta.orderMotorcycle("Ninja250");

        // Factory
        DealerBali dealerBali = new DealerBali();
        DealerBekasi dealerBekasi = new DealerBekasi();

        System.out.println(dealerBali);
        dealerBali.orderMotorcycle(AbstractMotorcycleFactory.NINJA250);
        dealerBali.orderMotorcycle(AbstractMotorcycleFactory.VIXION);

        System.out.println(dealerBekasi);
        dealerBekasi.orderMotorcycle(AbstractMotorcycleFactory.NINJA250);
        dealerBekasi.orderMotorcycle(AbstractMotorcycleFactory.VIXION);


        // Abstract Factory
        DealerEropa dealerEropa = new DealerEropa();
        DealerAmerika dealerAmerika = new DealerAmerika();

        System.out.println(dealerEropa);
        dealerEropa.orderMotorcycle(pattern.design.factory.abstractfactory.factory.AbstractMotorcycleFactory.NINJA250, new OffRoadSparepart());
        dealerEropa.orderMotorcycle(pattern.design.factory.abstractfactory.factory.AbstractMotorcycleFactory.VIXION, new OffRoadSparepart());

        System.out.println(dealerAmerika);
        dealerAmerika.orderMotorcycle(AbstractMotorcycleFactory.NINJA250, new OnRoadSparepart());
        dealerAmerika.orderMotorcycle(AbstractMotorcycleFactory.VIXION, new OnRoadSparepart());

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////// End Of Factory Pattern ///////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
