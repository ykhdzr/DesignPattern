package pattern.design.observer;

/**
 * Created by ykhdzr on 1/21/16.
 */
public interface Superstar {

    void registerFans(Fans fans);

    void removeFans(Fans fans);

    void notifyObservers();
}
