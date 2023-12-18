
package bank;

public interface Bank {
    abstract boolean credentialsCheck(String username, String password);
    abstract void credit(double amount);
    abstract void debit(double amount) throws InsufficientBalanceException;
    abstract double displayBalance();
    abstract void exit();
}


