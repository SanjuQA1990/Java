package EX_23_10_24;

public class function_with_parameters_with_Return {
    public static void main(String[] args) {
        int result = addNumbers(5, 3);
        System.out.println("The sum is: " + result);
    }

    // Function with parameters and return type
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
