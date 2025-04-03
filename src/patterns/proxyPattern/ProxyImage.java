package patterns.proxyPattern;

public class ProxyImage implements Image {
    private String filename; // reason why this didnt get "Final" option is that we have a parameterless constructor
    private RealImage image;

    public ProxyImage() {

    }

    public ProxyImage(String filename) {
        this.filename=filename;
    }

    @Override
    public void display() {
        if(image==null) {
            image = new RealImage(filename);
        }
        image.display();
    }

}
