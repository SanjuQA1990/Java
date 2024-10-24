package EX_22_10_24;

import java.util.Scanner;

public class count_vowels_and_consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for easy comparison

        int vowels = 0, consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Check if the character is a consonant (alphabet but not vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Output the results
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        scanner.close();
    }
}
