package pattern.design.template;

/**
 * Created by ykhdzr on 3/1/16.
 */
public abstract class BaseScreen {

    /** Template Method */
    public final void prepareScreen() {
        getLayout();

        if (withHeader()) {
            setHeader();
        }

        setContent();
        setFooter();
    }

    public abstract void getLayout();

    public abstract void setContent();

    private void setHeader() {
        System.out.println("------- Header -------");
    }

    private void setFooter() {
        System.out.println("------- Footer -------");
    }

    /** Hook Method */
    boolean withHeader() {
        return true;
    }

}
