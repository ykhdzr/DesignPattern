import pattern.design.adapter.SysOut;
import pattern.design.adapter.SysOutToAndroidLogger;
import pattern.design.facade.ProjectSetupFacade;
import pattern.design.facade.subsystem.FabricSetup;
import pattern.design.facade.subsystem.GitSetup;
import pattern.design.facade.subsystem.JenkinsSetup;

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
        System.out.println();

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



        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// [B]Command Pattern (Encapsulate method invocation) ////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        // Simple Factory
        GoFood goFood = new GoFood();
        GoFoodOrderCommand goFoodOrderCommand = new GoFoodOrderCommand(goFood);
        GoFoodCancelCommand goFoodCancelCommand = new GoFoodCancelCommand(goFood);

        GoRide goRide = new GoRide();
        GoRideOrderCommand goRideOrderCommand = new GoRideOrderCommand(goRide);
        GoRideCancelCommand goRideCancelCommand = new GoRideCancelCommand(goRide);

        GoController goController = new GoController();
        goController.placeOrder(goFoodOrderCommand);
        goController.placeOrder(goRideOrderCommand);
        goController.placeOrder(goRideCancelCommand);
        goController.placeOrder(goFoodCancelCommand);

        System.out.println("------- My History of using GoJerk services ---------");
        for (GoCommand goCommand : goController.getHistory()) {
            System.out.println(goCommand.toString());
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////// End Of Command Pattern /////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();
*/


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// [B]Adapter Pattern (Convert interface to another) //////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        System.out.println("---JAVA Print Out---");
        SysOut sysOut = new SysOut();
        sysOut.printOut();
        System.out.println();
        System.out.println();

        System.out.println("---Convert JAVA Print Out TO ANDROID Logger---");
        SysOutToAndroidLogger sysoutToAndroidLogger = new SysOutToAndroidLogger(sysOut);
        sysoutToAndroidLogger.logD();
        sysoutToAndroidLogger.logI();
        sysoutToAndroidLogger.logE();
        sysoutToAndroidLogger.logV();


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////// End Of Adapter Pattern /////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// [B]Facade Pattern (Encapsulate subsystem classes) //////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        FabricSetup fabricSetup = new FabricSetup();
        GitSetup gitSetup = new GitSetup();
        JenkinsSetup jenkinsSetup = new JenkinsSetup();

        ProjectSetupFacade projectSetupFacade = new ProjectSetupFacade(fabricSetup, gitSetup, jenkinsSetup);
        System.out.println("---Project Up---");
        projectSetupFacade.projectUp();
        System.out.println();

        System.out.println("---Project Shutdown---");
        projectSetupFacade.projectShutdown();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////// End Of Facade Pattern //////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
