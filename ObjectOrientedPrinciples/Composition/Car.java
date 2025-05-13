package ObjectOrientedPrinciples.Composition;

public class Car {
    Engine engine = new Engine();

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}
