package pattern.design.observer;

/**
 * Created by ykhdzr on 1/21/16.
 */
public class SlowyFansImpl implements Fans {

    private Superstar superstar;

    public SlowyFansImpl(Superstar superstar) {
        this.superstar = superstar;
        superstar.registerFans(this);
    }

    @Override
    public void update(String status, String location, String mood) {
        System.out.println("Slowy Fans");
        System.out.println("================");
        System.out.println("Uh-oh, there seems an updates");
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
