package EX_08_11_24_Method_Overriding;

public class Subclass_Dog extends Superclass_Animal{
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
