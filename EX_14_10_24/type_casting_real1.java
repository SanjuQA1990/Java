package EX_14_10_24;

public class type_casting_real1 {
    public static void main(String[] args) {
        System.out.println("Real-Life Examples of type casting");
        System.out.println("Imagine you have a price with decimals, like $45.99. You want to show just the whole number, like $45.");
        double price = 45.99;
        int roundedPrice = (int) price;  // Convert double to int
        System.out.println("Rounded price: $" + roundedPrice);  // Output: Rounded price: $45


    }
}
