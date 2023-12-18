abstract class Employee {
    abstract double getAmount();
}

class WeeklyEmployee extends Employee {
    private int noOfWeeks;
    private double totalWeeks;

    public WeeklyEmployee(int noOfWeeks, double totalWeeks) {
        this.noOfWeeks = noOfWeeks;
        this.totalWeeks = totalWeeks;
    }

    @Override
    double getAmount() {
        // Assuming a fixed payment per week for simplicity
        return noOfWeeks * totalWeeks;
    }
}

class HourlyEmployee extends Employee {
    private int noOfHours;
    private double totalHours;

    public HourlyEmployee(int noOfHours, double totalHours) {
        this.noOfHours = noOfHours;
        this.totalHours = totalHours;
    }

    @Override
    double getAmount() {
        // Assuming an hourly wage for simplicity
        return noOfHours * totalHours;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        WeeklyEmployee weeklyEmployee = new WeeklyEmployee(4, 500.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(20, 25.0);

        displayAmount(weeklyEmployee);
        displayAmount(hourlyEmployee);
    }

    private static void displayAmount(Employee employee) {
        System.out.println("Amount paid to " + employee.getClass().getSimpleName() + ": " + employee.getAmount());
    }
}
