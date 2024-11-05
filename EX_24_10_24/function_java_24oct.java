package EX_24_10_24;

import java.util.Scanner;

public class function_java_24oct {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please Enter Number1 ");
        int number1 =sc.nextInt();

        System.out.println("Please Enter Number2 ");
        int number2 =sc.nextInt();

        int result = sum_num(number1, number2);
        System.out.println("The sum is: " + result);

        int result1 = sub_num(number1, number2);
        System.out.println("The sub is: " + result1);

        int result3 = mul_num(number1, number2);
        System.out.println("The Multi is: " + result3);

        float result4 = div_num(number1, number2);
        System.out.println("The Div is: " + result4);


    }

    public static int sum_num(int number1, int number2)
    {
        return number1+number2;
    }

    public static int sub_num(int number1, int number2)
    {
        return number1-number2;
    }

    public static int mul_num(int number1, int number2)
    {
        return (number1*number2);
    }

    public static float div_num(float number1, float number2)
    {
        return number1/number2;
    }

}
