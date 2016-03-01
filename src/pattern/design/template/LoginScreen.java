package pattern.design.template;

/**
 * Created by ykhdzr on 3/1/16.
 */
public class LoginScreen extends BaseScreen {

    @Override
    public void getLayout() {
        System.out.println("------- Login Layout -------");
    }

    @Override
    public void setContent() {
        System.out.println("<<Login Content>>");
    }

    @Override
    public boolean withHeader() {
        return false;
    }
}
