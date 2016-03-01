package pattern.design.adapter;

/**
 * Created by ykhdzr on 2/26/16.
 */
public class SysOutToAndroidLogger implements AndroidLogger {

    JavaPrintOut sysout;

    public SysOutToAndroidLogger(JavaPrintOut sysout) {
        this.sysout = sysout;
    }

    @Override
    public void logD() {
        System.out.print("[DEBUG] - ");
        sysout.printOut();
        System.out.println();
    }

    @Override
    public void logI() {
        System.out.print("[INFO] - ");
        sysout.printOut();
        System.out.println();
    }

    @Override
    public void logE() {
        System.out.print("[ERROR] - ");
        sysout.printOut();
        System.out.println();
    }

    @Override
    public void logV() {
        System.out.print("[VERBOSE] - ");
        sysout.printOut();
        System.out.println();
    }
}
