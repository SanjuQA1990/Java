package EX_08_11_24_Method_Overloading;

public class Main_Calculator {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Call the add method with two integers
        int sum1 = calculator.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Call the add method with three integers
        int sum2 = calculator.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        // Call the add method with two doubles
        double sum3 = calculator.add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}
