package DesignPatterns.Creational.FactoryPattern;

interface  Transport {
 void deliver();
}

class Bike implements Transport{
    public void deliver() {
        System.out.println("Delivered by bike");
    }
}

class Truck implements Transport{
    public void deliver() {
        System.out.println("Delivered by truck");
    }
}

class TransportFactory {

    public static Transport getTransport(String type){
        if (type.equals("bike")){
            return new Bike();
        } else if (type.equals("truck")){
            return new Truck();
        }

        throw new IllegalArgumentException("Vehicle type doesnt exists");
    }
}
public class App {
    
}
