package EX_17_10_24;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number.. ");
        int score =sc.nextInt();

        if(score>=90 && score<=100)
        {
            System.out.println("Grade A");
        } else if (score>=80 && score<=89) {
            System.out.println("Grade B");
        }else if (score>=70 && score<=79) {
            System.out.println("Grade C");
        }else if (score>=60 && score<=69) {
            System.out.println("Grade D");
        }else if (score>=50 && score<=59) {
            System.out.println("Grade F");
        }
        else if (score<=50) {
            System.out.println("Grade Fail");
        }
        else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        }

        sc.close();
    }
    }
