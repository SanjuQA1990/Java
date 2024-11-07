package EX_07_11_24.Example;

public class singleInheritance {
    public static void main(String[] args) {
        // Create an instance of the child class
        ChildClass child = new ChildClass();

        // Call the parent class method using the child instance
        child.displayParentMessage();

        // Call the child class method
        child.displayChildMessage();
    }
}
