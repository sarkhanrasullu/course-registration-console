package patterns.singletonPattern;

public class Car {

    private Car() {  // constructor cannot be called by outside class

    }

    public static Car car = null; // a static var created but not assigned a ref

    public static Car instCar() {   // static method which will control and protect SingletonPattern
        if(car==null) {  // checks if there's an object created already
            car= new Car(); // - if no, creates one
        }
        return car; // -if yes, returns it
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

}
