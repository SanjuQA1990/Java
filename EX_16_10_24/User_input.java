package EX_16_10_24;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.nextLine();

        System.out.println("enter age...");
        int age = scanner.nextInt();
        System.out.println("Enter Salary");
        int salary = scanner.nextInt();

        System.out.println("Name is " +name);
        System.out.println("Age Is " + age);
        System.out.println("Salary Is "+ salary);

        scanner.close();
    }
}
