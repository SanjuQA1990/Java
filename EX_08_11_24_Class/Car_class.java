package EX_08_11_24_Class;

public class Car_class {
    // This class represents a car with its properties and methods

    // Properties of the car
    String model;
    String color;
    int year;
    int speed;

    // Method to simulate the car accelerating
    void accelerate() {
        // Increment the speed by 10
        speed += 10;
        // Print the current speed
        System.out.println("The car is accelerating. Current speed: " + speed);
    }
}
