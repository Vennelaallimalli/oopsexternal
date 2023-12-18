// Interface representing the rules framed by RBI
interface RBI {
    void credit();
    void debit();
    void displayBalance();
    void personalLoanEligibility();
    void homeLoanEligibility();
    void vehicleLoanEligibility();
}

// Abstract class for common functionalities among all banks
abstract class Bank implements RBI {
    // Common implementation for credit, debit, and displayBalance
    @Override
    public void credit() {
        System.out.println("Credit operation implemented by the bank");
    }

    @Override
    public void debit() {
        System.out.println("Debit operation implemented by the bank");
    }

    @Override
    public void displayBalance() {
        System.out.println("Display balance operation implemented by the bank");
    }
}

// SBI Bank class implementing specific functionalities
class SBI extends Bank {
    @Override
    public void personalLoanEligibility() {
        System.out.println("SBI: Personal Loan Eligibility based on annual income, job type, etc.");
    }

    @Override
    public void homeLoanEligibility() {
        System.out.println("SBI: Home Loan Eligibility based on property, medical fitness, etc.");
    }

    @Override
    public void vehicleLoanEligibility() {
        System.out.println("SBI: Vehicle Loan Eligibility based on criteria");
    }
}

// HDFC Bank class implementing specific functionalities
class HDFC extends Bank {
    @Override
    public void personalLoanEligibility() {
        System.out.println("HDFC: Personal Loan Eligibility based on different factors");
    }

    @Override
    public void homeLoanEligibility() {
        System.out.println("HDFC: Home Loan Eligibility based on specific criteria");
    }

    @Override
    public void vehicleLoanEligibility() {
        System.out.println("HDFC: Vehicle Loan Eligibility based on certain conditions");
    }
}

// DCB Bank class implementing specific functionalities
class DCB extends Bank {
    @Override
    public void personalLoanEligibility() {
        System.out.println("DCB: Personal Loan Eligibility based on individual details");
    }

    @Override
    public void homeLoanEligibility() {
        System.out.println("DCB: Home Loan Eligibility based on unique factors");
    }

    @Override
    public void vehicleLoanEligibility() {
        System.out.println("DCB: Vehicle Loan Eligibility based on specific parameters");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SBI sbiBank = new SBI();
        HDFC hdfcBank = new HDFC();
        DCB dcbBank = new DCB();

        // Example operations on SBI Bank
        sbiBank.credit();
        sbiBank.debit();
        sbiBank.displayBalance();
        sbiBank.personalLoanEligibility();
        sbiBank.homeLoanEligibility();
        sbiBank.vehicleLoanEligibility();

        // Example operations on HDFC Bank
        hdfcBank.credit();
        hdfcBank.debit();
        hdfcBank.displayBalance();
        hdfcBank.personalLoanEligibility();
        hdfcBank.homeLoanEligibility();
        hdfcBank.vehicleLoanEligibility();

        // Example operations on DCB Bank
        dcbBank.credit();
        dcbBank.debit();
        dcbBank.displayBalance();
        dcbBank.personalLoanEligibility();
        dcbBank.homeLoanEligibility();
        dcbBank.vehicleLoanEligibility();
    }
}
