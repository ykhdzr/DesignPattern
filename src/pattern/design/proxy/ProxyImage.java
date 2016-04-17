package pattern.design.proxy;

/**
 * Created by ykhdzr on 4/17/16.
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
