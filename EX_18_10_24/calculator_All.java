package EX_18_10_24;

import java.util.Scanner;

public class calculator_All {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value on Num1 = ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value on Num2 = ");
        int num2 = sc.nextInt();
        System.out.println("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        int result;
        switch (operator) {
            case '+':
                result = (num1 + num2);
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case '-':
                result = (num1 - num2);
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;
            case '*':
                result = (num1 * num2);
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;
            case '/':

                if (num2 != 0) {
                    result = (num1 / num2);
                    System.out.println(num1 + "/" + num2 + "=" + result);
                } else {
                    System.out.println("Division  by 0 is not allowed");
                }
                break;
            case '%':

                if (num2 != 0) {
                    result = (num1 % num2);
                    System.out.println(num1 + "%" + num2 + "=" + result);
                } else {
                    System.out.println("Division  by 0 is not allowed");
                }
                break;
        }
        sc.close();
    }

}
