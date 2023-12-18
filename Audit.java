package audit;
public interface Audit {
    // Abstract methods
    abstract void taxChecker(double totalIncome, double taxPaid) throws TaxFraudException;
    abstract void taxPaid(double amount);
    abstract void homeExpenditure(double amount);
    abstract void healthExpenditure(double amount);
    abstract void vehicleExpenditure(double amount);
    abstract void personalFamilyExpenditure(double amount);
    abstract void miscellaneousExpenditure(double amount);
}