package audit;
public class AuditImpl implements Audit {
    private double totalIncome;
    private double taxPaid;
    private double homeExpenditure;
    private double healthExpenditure;
    private double vehicleExpenditure;
    private double personalFamilyExpenditure;
    private double miscellaneousExpenditure;

    // Constructor
    public  AuditImpl(double totalIncome, double taxPaid,
                     double homeExpenditure, double healthExpenditure,
                     double vehicleExpenditure, double personalFamilyExpenditure,
                     double miscellaneousExpenditure) {
        this.totalIncome = totalIncome;
        this.taxPaid = taxPaid;
        this.homeExpenditure = homeExpenditure;
        this.healthExpenditure = healthExpenditure;
        this.vehicleExpenditure = vehicleExpenditure;
        this.personalFamilyExpenditure = personalFamilyExpenditure;
        this.miscellaneousExpenditure = miscellaneousExpenditure;
    }

    // Override taxChecker method
    @Override
    public void taxChecker(double totalIncome, double taxPaid) throws TaxFraudException {
        double totalExpenditure = homeExpenditure + healthExpenditure +
                vehicleExpenditure + personalFamilyExpenditure + miscellaneousExpenditure;

        double calculatedTax = 0.1 * (totalIncome - totalExpenditure);
        if (taxPaid != calculatedTax) {
            throw new TaxFraudException("Tax fraud detected! You have to pay: $" + calculatedTax);
        } else {
            System.out.println("Tax check passed. No fraud detected.");
        }
    }
    @Override
    public void taxPaid(double amount) {
        this.taxPaid = amount;
        System.out.println("Tax paid successfully. Amount: $" + amount);
    }

    // Override homeExpenditure method
    @Override
    public void homeExpenditure(double amount) {
        this.homeExpenditure = amount;
        System.out.println("Home expenditure recorded. Amount: $" + amount);
    }

    // Override healthExpenditure method
    @Override
    public void healthExpenditure(double amount) {
        this.healthExpenditure = amount;
        System.out.println("Health expenditure recorded. Amount: $" + amount);
    }

    // Override vehicleExpenditure method
    @Override
    public void vehicleExpenditure(double amount) {
        this.vehicleExpenditure = amount;
        System.out.println("Vehicle expenditure recorded. Amount: $" + amount);
    }

    // Override personalFamilyExpenditure method
    @Override
    public void personalFamilyExpenditure(double amount) {
        this.personalFamilyExpenditure = amount;
        System.out.println("Personal and family expenditure recorded. Amount: $" + amount);
    }

    // Override miscellaneousExpenditure method
    @Override
    public void miscellaneousExpenditure(double amount) {
        this.miscellaneousExpenditure = amount;
        System.out.println("Miscellaneous expenditure recorded. Amount: $" + amount);
    }
}
