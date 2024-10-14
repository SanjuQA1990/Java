package EX_14_10_24;

public class type_casting {
    public static void main(String[] args) {

        System.out.println("Implicit Casting (Widening Casting): Java automatically converts a smaller data type to a larger one. This occurs when there's no risk of data loss.");

        int num1 = 100;
        double doubleNum1 = num1;  // Automatic casting: int to double
        System.out.println(doubleNum1);  // Output: 100.0

        System.out.println("Explicit Casting (Narrowing Casting): You manually convert a larger data type to a smaller one. This requires an explicit cast and may result in data loss if the value doesn’t fit into the smaller type.");

        int num2 = 100;
        double doubleNum2 = num2;  // Automatic casting: int to double
        System.out.println(doubleNum2);  // Output: 100.0
    }
}
