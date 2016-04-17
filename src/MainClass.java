import pattern.design.composite.Employee;
import pattern.design.composite.EmployeeComponent;
import pattern.design.composite.EmployeeManager;
import pattern.design.composite.HRD;
import pattern.design.proxy.Image;
import pattern.design.proxy.ProxyImage;
import pattern.design.state.ATMMachine;

/**
 * Created by
 * __      __          __
 * /\ \    /\ \        /\ \
 * __  __\ \ \/'\\ \ \___    \_\ \  ____    _ __
 * /\ \/\ \\ \ , < \ \  _ `\  /'_` \/\_ ,`\ /\`'__\
 * \ \ \_\ \\ \ \\`\\ \ \ \ \/\ \L\ \/_/  /_\ \ \/
 * \/`____ \\ \_\ \_\ \_\ \_\ \___,_\/\____\\ \_\
 * `/___/> \\/_/\/_/\/_/\/_/\/__,_ /\/____/ \/_/
 * /\___/
 * \/__/
 * <p>
 * on 1/17/16.
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
        System.out.println("////////////////////// [B]Observer Pattern (Hollywood Principle) //////////////////////");
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


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////// [S]Template Method Pattern (Hollywood Principle) //////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        LoginScreen loginScreen = new LoginScreen();
        loginScreen.prepareScreen();

        System.out.println();
        System.out.println();

        HomeScreen homeScreen = new HomeScreen();
        homeScreen.prepareScreen();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////// End Of Template Method Pattern /////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();



        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////// [B]Iterator Pattern (Simplifies aggregate interface and implementation) ////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        Engineer engineer = new Engineer();
        Designer designer = new Designer();
        QA qa = new QA();

        HRD hrd = new HRD(engineer, designer, qa);
        hrd.showEmployeeList2();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////// End Of Iterator Pattern /////////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();



        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////// [S]Composite Pattern (Treat collections of objects uniformly) //////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        EmployeeComponent iceHouseStructure = new EmployeeManager("IceHouse Org Chart");
        EmployeeComponent randiTeam = new EmployeeManager("Randi");
        EmployeeComponent harisTeam = new EmployeeManager("Haris");
        EmployeeComponent yokoTeam = new EmployeeManager("  Yoko");
        EmployeeComponent edoTeam = new EmployeeManager("  Edo");

        iceHouseStructure.add(randiTeam);
        iceHouseStructure.add(harisTeam);

        randiTeam.add(yokoTeam);
        randiTeam.add(new Employee("  Yoseph"));
        randiTeam.add(new Employee("  Wais"));
        randiTeam.add(new Employee("  Sety"));

        harisTeam.add(new Employee("  Amril"));
        harisTeam.add(new Employee("  Budi"));
        harisTeam.add(new Employee("  Winni"));
        harisTeam.add(edoTeam);

        edoTeam.add(new Employee("    Heri"));
        edoTeam.add(new Employee("    Sinta"));

        yokoTeam.add(new Employee("    Mexan"));
        yokoTeam.add(new Employee("    Putri"));
        yokoTeam.add(new Employee("    Nabil"));

        HRD hrd = new HRD(iceHouseStructure);
        hrd.displayOrganizationStructure();

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////// End Of Composite Pattern ///////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();



        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////// [B]State Pattern (Encapsulate state-based behaviour) ////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        ATMMachine atmMachine = new ATMMachine(10000);

        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(5000);
        System.out.println();

        atmMachine.insertCard();
        atmMachine.insertPin(1111);
        atmMachine.ejectCard();
        System.out.println();

        atmMachine.insertPin(1234);
        atmMachine.requestCash(5000);
        atmMachine.ejectCard();
        System.out.println();

        atmMachine.insertCard();
        atmMachine.ejectCard();
        System.out.println();

        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(5000);
        System.out.println();

        atmMachine.insertCard();


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////// End Of State Pattern ///////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();
        */


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////// [S]Proxy Pattern (Control and Manage access to Real object) ////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");

        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();


        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////// End Of Proxy Pattern ///////////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
