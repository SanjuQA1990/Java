package EX_11_11_2024_oopconcepts;

class Shape {
    // Method for compile-time polymorphism (method overloading)
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void draw(String shapeType) {
        System.out.println("Drawing a " + shapeType);
    }
}

// Derived class for runtime polymorphism (method overriding)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class PolymorphismExample {
    public static void description() {
        System.out.println("Polymorphism allows an object to take many forms.");
        System.out.println("It can be achieved through method overloading (compile-time) and method overriding (runtime).");
    }
}