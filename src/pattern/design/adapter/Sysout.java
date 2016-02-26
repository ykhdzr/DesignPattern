package pattern.design.adapter;

/**
 * Created by ykhdzr on 2/26/16.
 */
public class SysOut implements JavaPrintOut {

    @Override
    public void printOut() {
        System.out.print("System.out.println");
    }
}
