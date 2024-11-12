package EX_11_11_2024_oopconcepts;

// Base class
class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Derived class inheriting from Animal
public class InheritanceExample extends Animal {
    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }

    // Description method to explain inheritance
    public static void description() {
        System.out.println("Inheritance allows a class to inherit properties and behaviors of another class.");
        System.out.println("This establishes an 'is-a' relationship.");
    }
}