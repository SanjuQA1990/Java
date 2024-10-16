package EX_15_10_24;

public class Increment_oprtr {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        System.out.println(++a + a++ + a++);
        // ================ 11 + 11 + 12
        System.out.println(a);

        System.out.println("==========================================================");

        System.out.println(--b + b++ + --b);
        // ================ 11 + 11 + 11
        System.out.println(b);


    }
}
