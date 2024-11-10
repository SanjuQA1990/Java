package EX_08_11_24_Method_Overriding;

public class Main_class {
    public static void main(String[] args) {
        Superclass_Animal animal = new Superclass_Animal();
        Superclass_Animal dog = new Subclass_Dog();

        animal.makeSound(); // Output: The animal makes a sound.
        dog.makeSound();    // Output: The dog barks.
    }
}
