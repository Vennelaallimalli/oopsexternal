package bank;
 public class BankImpl implements Bank {
    private String username;
    private String password;
    private double balance;

    
    public BankImpl(String username, String password, double initialBalance) {
        this.username = username;
        this.password = password;
        this.balance = initialBalance;
    }

    @Override
    public boolean credentialsCheck(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }


    @Override
    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount credited successfully. New balance: " + balance);
    }


    @Override
    public void debit(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Debit transaction failed.");
        } else {
            balance -= amount;
            System.out.println("Amount debited successfully. New balance: " + balance);
        }
    }
    
    @Override
    public double displayBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }

    
    @Override
    public void exit() {
        System.out.println("Exiting Bank Management System. Thank you!");
    
    }
}
