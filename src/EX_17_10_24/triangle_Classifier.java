package EX_17_10_24;

import java.util.Scanner;

public class triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vale of Side1 ..");
        int side1 = sc.nextInt();
        System.out.println("Enter the vale of Side2 ..");
        int side2 = sc.nextInt();
        System.out.println("Enter the vale of Side3 ..");
        int side3 = sc.nextInt();


        if (side1==side2 && side2==side3)
        {
            System.out.println("The triangle is equilateral.");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("The triangle is isosceles.");
        }
        else {
            System.out.println("The triangle is scalene.");
        }
    }
}
