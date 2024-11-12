package EX_11_11_2024_oopconcepts;

public class EncapsulationExample {
    private String name;  // Private variable, access restricted

    // Getter method to access private variable
    public String getName() {
        return name;
    }

    // Setter method to modify private variable
    public void setName(String name) {
        this.name = name;
    }

    // Description method to explain encapsulation
    public static void description() {
        System.out.println("Encapsulation is the concept of wrapping data and methods in a single unit.");
        System.out.println("It restricts direct access to the fields by using private access modifiers.");
    }
}
