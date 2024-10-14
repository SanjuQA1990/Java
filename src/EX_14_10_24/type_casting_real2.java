package EX_14_10_24;

public class type_casting_real2 {
    public static void main(String[] args) {
        System.out.println("A temperature sensor gives you a reading with decimals, like 23.76°C, but you only need the whole number, 23°C.");
        double temperature = 23.76;
        int tempInWhole = (int) temperature;  // Convert double to int
        System.out.println("Temperature: " + tempInWhole + "°C");  // Output: Temperature: 23°C

    }
}
