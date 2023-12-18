// Main class to demonstrate the bank functionality
import bank.Bank;
import bank.InsufficientBalanceException;
import bank.BankImpl;
public class BankManagement {
    public static void main(String[] args) {
        // Example usage
        Bank bank = new BankImpl("user123", "pass123", 1000.0);

        // Sample scenario
        try {
            if (bank.credentialsCheck("user123", "pass123")) {
                bank.credit(500.0);
                bank.debit(200.0);
                bank.displayBalance();
            } else {
                System.out.println("Invalid credentials. Access denied.");
            }
        }
         catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            bank.exit();
        }
    }
}