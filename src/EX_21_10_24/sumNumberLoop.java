package EX_21_10_24;

public class sumNumberLoop {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <= 100; i++) {

            System.out.println(i + " + " + sum + " = " +(sum+i));
            sum = sum + i;
        }

    }
}
