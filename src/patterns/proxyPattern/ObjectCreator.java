package patterns.proxyPattern;

public class ObjectCreator {

    public static Image createImage(Class myClass) {
        if(myClass==RealImage.class) {
            return new ProxyImage();
        }
        return null;
    }
}
