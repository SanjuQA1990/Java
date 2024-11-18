package EX_18_11_24_exception_handling;

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            int result = 10 / 0;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
