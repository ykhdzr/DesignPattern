package pattern.design.facade.subsystem;

/**
 * Created by ykhdzr on 2/26/16.
 */
public class FabricSetup {

    public void fabricCreate() {
        System.out.println("Fabric initializing...");
    }

    public void fabricDelete() {
        System.out.println("Deleting Fabric configuration...");
    }
}
