package EX_18_10_24;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice => 1 for Kilometers to Miles & => 2 Fahrenheit to Celsius");

        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter the number to convert in Mile");
                double kilometers = sc.nextDouble();
                double miles = kilometers * 0.621371;
                System.out.println("kilometers " + kilometers + "=" + miles + " Miles");
                break;

            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5/9;
                System.out.println("Fahrenheit " + fahrenheit + " = " + celsius + " Celsius");
                break;
        }

    }

}
