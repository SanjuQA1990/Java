package EX_18_11_24_exception_handling;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null object reference: " + e.getMessage());
        }
    }
}
