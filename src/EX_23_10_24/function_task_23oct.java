package EX_23_10_24;

import java.util.Scanner;

public class function_task_23oct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int result = sum(a, b);
        System.out.println("The sum is: " + result);

        int result1 = sub(a, b);
        if(a<b){
        System.out.println("The Subtraction is in Negative " + result1);
        }
        else{
            System.out.println("The Subtraction is: " + result1);
        }

        int result2 = mul(a, b);
        System.out.println("Multiplication is "+ result2);

        float result3 = div(a, b);

        System.out.println("Division is "+ result3);
    }

    // Sum function
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }
    public static float div(int a, int b) {
        return (float) a/ b;
    }

}
