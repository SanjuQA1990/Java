package EX_18_11_24_exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            java.io.FileInputStream file = new java.io.FileInputStream("nonexistent.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
