package pattern.design.template;

/**
 * Created by ykhdzr on 3/1/16.
 */
public class HomeScreen extends BaseScreen {
    @Override
    public void getLayout() {
        System.out.println("------- Home Layout -------");
    }

    @Override
    public void setContent() {
        System.out.println("<<Home Content>>");
    }
}
