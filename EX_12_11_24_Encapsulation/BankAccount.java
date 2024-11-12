package EX_12_11_24_Encapsulation;


public class BankAccount {
    // This is the hidden balance that only the BankAccount class can change
    private double balance;

    // A method to check the balance safely
    public double getBalance() {
        return balance;
    }

    // A method to add money safely
    public void deposit(double amount) {
        if (amount > 0) { // Only deposit positive amounts
            balance += amount; // Add to balance
            System.out.println("Deposited: $" + amount);
        }
    }

    // A method to withdraw money safely
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // Check if enough money is available
            balance -= amount; // Subtract from balance
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount myAccount = new BankAccount();

        // Deposit some money
        myAccount.deposit(1000);

        // Withdraw some money
        myAccount.withdraw(500);

        // Check remaining balance
        System.out.println("Remaining Balance: $" + myAccount.getBalance());
    }
}