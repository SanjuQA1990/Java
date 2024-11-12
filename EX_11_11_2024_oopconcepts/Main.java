package EX_11_11_2024_oopconcepts;

public class Main {
    public static void main(String[] args) {
        // Encapsulation Example
        EncapsulationExample encapsulation = new EncapsulationExample();
        encapsulation.setName("Encapsulation Example");
        System.out.println("Encapsulated Name: " + encapsulation.getName());
        EncapsulationExample.description();

        System.out.println();

        // Inheritance Example
        InheritanceExample inheritance = new InheritanceExample();
        inheritance.sound();
        InheritanceExample.description();

        System.out.println();

        // Polymorphism Example
        Shape shape = new Shape();
        shape.draw();
        shape.draw("Circle");

        Shape circle = new Circle();
        circle.draw();  // Runtime polymorphism
        PolymorphismExample.description();

        System.out.println();

        // Abstraction Example
        Vehicle car = new Car();
        car.start();
        car.stop();
        AbstractionExample.description();
    }
}