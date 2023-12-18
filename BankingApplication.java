import java.util.Scanner;

class Account {
    private String bankName;
    private String branchName;
    private String accountName;
    private String accountNumber;
    private double balance;
    private String accountAddress;

    // Constructor
    public Account(String bankName, String branchName, String accountName, String accountNumber, double initialBalance, String accountAddress) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        
        // Ensure initial balance is greater than 1000.0
        if (initialBalance > 1000.0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance should be greater than 1000.0");
            System.exit(1); // Exit the program
        }

        this.accountAddress = accountAddress;
    }

    // Method to deposit money
    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount credited successfully. Current balance: " + balance);
    }

    // Method to withdraw money
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Amount debited successfully. Current balance: " + balance);
        }
    }

    // Method to get account balance
    public double getBalance() {
        return balance;
    }

    // Method to exit the transaction
    public void exit() {
        System.out.println("Exiting transaction. Thank you!");
    }
}

public class BankingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two account instances for Basar and Nizambad branches
        Account basarAccount = new Account("SBI", "Basar", "User1", "123456", 1500.0, "Address1");
        Account nizamabadAccount = new Account("SBI", "Nizamabad", "User2", "789012", 2000.0, "Address2");

        boolean exitApplication = false;

        while (!exitApplication) {
            // Prompt for user credentials
            System.out.println("Enter Branch Name:");
            String branchNameInput = scanner.nextLine();

            System.out.println("Enter Account Number:");
            String accountNumberInput = scanner.nextLine();

            Account currentAccount = null;

            // Check if the entered credentials match any account
            if (branchNameInput.equalsIgnoreCase("Basar") && accountNumberInput.equals("123456")) {
                currentAccount = basarAccount;
            } else if (branchNameInput.equalsIgnoreCase("Nizamabad") && accountNumberInput.equals("789012")) {
                currentAccount = nizamabadAccount;
            } else {
                System.out.println("Invalid credentials. Please try again.");
                continue;
            }

            // Perform transactions
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Credit");
                System.out.println("2. Debit");
                System.out.println("3. Get Balance");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to credit:");
                        double creditAmount = scanner.nextDouble();
                        currentAccount.credit(creditAmount);
                        break;
                    case 2:
                        System.out.println("Enter amount to debit:");
                        double debitAmount = scanner.nextDouble();
                        currentAccount.debit(debitAmount);
                        break;
                    case 3:
                        System.out.println("Current balance: " + currentAccount.getBalance());
                        break;
                    case 4:
                        currentAccount.exit();
                        exitApplication = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }

                if (exitApplication) {
                    break;
                }
            }

            // Prompt for exit or new user
            scanner.nextLine(); // Consume the newline character
            System.out.println("Exit application? (Yes/No):");
            String exitChoice = scanner.nextLine().toLowerCase();

            if (exitChoice.equals("yes")) {
                exitApplication = true;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
