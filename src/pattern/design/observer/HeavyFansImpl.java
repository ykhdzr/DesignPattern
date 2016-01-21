package pattern.design.observer;

/**
 * Created by ykhdzr on 1/21/16.
 */
public class HeavyFansImpl implements Fans {

    private Superstar superstar;

    public HeavyFansImpl(Superstar superstar) {
        this.superstar = superstar;
        superstar.registerFans(this);
    }

    @Override
    public void update(String status, String location, String mood) {
        System.out.println("Heavy Fans");
        System.out.println("================");
        System.out.println("Wohoooooooo!!! i will reshare your updates to the universe!");
        System.out.println("Status:" + status);
        System.out.println("Location:" + location);
        System.out.println("Mood:" + mood);
        System.out.println();
    }

    @Override
    public void unregister() {
        superstar.removeFans(this);
    }
}
