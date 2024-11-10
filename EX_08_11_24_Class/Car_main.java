package EX_08_11_24_Class;

public class Car_main {

    public static void main(String[] args) {
        // Create a new instance of the Car_class
        Car_class car = new Car_class();

        // Set the properties of the car
        car.model = "Toyota";
        car.color = "Red";
        car.year = 2020;
        car.speed = 0;

        // Print the car's properties
        System.out.println("Model: " + car.model);
        System.out.println("Color: " + car.color);
        System.out.println("Year: " + car.year);
        System.out.println("Speed: " + car.speed);

        // Call the accelerate method
        car.accelerate();
    }
}
