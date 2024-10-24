package EX_15_10_24;

public class Java_Ternary {
    public static void main(String[] args) {
        int a  = 80;
        int b   = 50;
        int c   = 30;

       int result = (a>b && a>c)? a : (b>c? b:c);
       System.out.println("Result=> " + result);
    }
}
