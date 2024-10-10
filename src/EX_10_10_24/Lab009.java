package EX_10_10_24;

public class Lab009 {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 100;          // Decimal All
        int octal = 010;            // Octal literal (equal to decimal 8)
        int hex = 0x1A;             // Hexadecimal literal (equal to decimal 26)
        int binary = 0b1010;        // Binary literal (equal to decimal 10)

        // Floating-point literals
        double d = 123.45;          // Double literal
        float f = 123.45f;          // Float literal

        // Character literal
        char ch = 'A';              // Character literal
        char newline = '\n';        // Escape sequence for newline

        // String literals
        String str = "Hello, World!"; // String literal

        // Boolean literals
        boolean isTrue = true;        // Boolean literal
        boolean isFalse = false;      // Boolean literal

        // Null literal
        String nullString = null;     // Null literal

        // Printing the literals
        System.out.println("Integer Literals:");
        System.out.println("==========================================");
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Binary: " + binary);

        System.out.println("\nFloating-Point Literals:");
        System.out.println("==========================================");
        System.out.println("Double: " + d);
        System.out.println("Float: " + f);

        System.out.println("\nCharacter Literals:");
        System.out.println("==========================================");
        System.out.println("Character: " + ch);
        System.out.println("Newline character: " + newline + "(This is a new line)");

        System.out.println("\nString Literals:");
        System.out.println("==========================================");
        System.out.println("String: " + str);

        System.out.println("\nBoolean Literals:");
        System.out.println("==========================================");
        System.out.println("True: " + isTrue);
        System.out.println("False: " + isFalse);

        System.out.println("\nNull Literal:");
        System.out.println("==========================================");
        System.out.println("Null String: " + nullString);  // This will print 'null
    }

}
