import audit.*;
public class TaxFraudDetectionSystem {
    public static void main(String[] args) {
        // Example usage
        Audit audit = new AuditImpl(100000, 9000, 20000, 5000, 10000, 15000, 2000);

        try {
            audit.taxChecker(100000, 9000);
        } catch (TaxFraudException e) {
            System.out.println(e.getMessage());
        }
    }
}
