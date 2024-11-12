package EX_11_11_2024_oopconcepts;

// Abstract class
abstract class Vehicle {
    // Abstract method (no implementation)
    public abstract void start();

    // Concrete method with implementation
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Concrete class that implements the abstract method
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

public class AbstractionExample {
    public static void description() {
        System.out.println("Abstraction hides the complex implementation details from the user.");
        System.out.println("It allows us to focus on what an object does instead of how it does it.");
    }
}