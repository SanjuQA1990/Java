package EX_18_11_24_exception_handling;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; //
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
