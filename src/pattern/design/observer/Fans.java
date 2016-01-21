package pattern.design.observer;

/**
 * Created by ykhdzr on 1/21/16.
 */
public interface Fans {

    void update(String status, String location, String mood);

    void unregister();
}
