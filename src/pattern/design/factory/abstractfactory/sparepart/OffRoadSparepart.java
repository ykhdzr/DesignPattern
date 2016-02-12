package pattern.design.factory.abstractfactory.sparepart;

/**
 * Created by ykhdzr on 2/12/16.
 */
public class OffRoadSparepart extends AbstractSparepartFactory {
    @Override
    public void setTires() {
        System.out.println("Off Road tires");
    }

    @Override
    public void setKnalpot() {
        System.out.println("Knalpot Racing");
    }
}
