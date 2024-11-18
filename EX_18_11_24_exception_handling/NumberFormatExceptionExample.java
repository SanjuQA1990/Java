package EX_18_11_24_exception_handling;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}
