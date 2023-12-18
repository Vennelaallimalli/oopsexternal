mkdir reservation
// File: reservation/ReservationCost.java
package reservation;

public interface ReservationCost {
    double totalFare(Passenger[] passengers);
}
// File: reservation/ReservationCalculator.java
package reservation;

public class ReservationCalculator implements ReservationCost {

    @Override
    public double totalFare(Passenger[] passengers) {
        double totalFare = 0.0;

        for (Passenger passenger : passengers) {
            totalFare += passenger.calculateFare();
        }

        return totalFare;
    }
}
// File: reservation/Passenger.java
package reservation;

public abstract class Passenger {
    public abstract double calculateFare();
}
// File: reservation/Child.java
package reservation;

public class Child extends Passenger {

    @Override
    public double calculateFare() {
        return 0.0; // Children travel for free
    }
}
// File: reservation/Student.java
package reservation;

public class Student extends Passenger {
    private static final double DISCOUNT_PERCENTAGE = 0.3;

    @Override
    public double calculateFare() {
        // Students get a 30% discount
        return (1 - DISCOUNT_PERCENTAGE) * getActualFare();
    }

    private double getActualFare() {
        // Define the actual fare calculation logic for students
        return 100.0; // Replace with your actual calculation
    }
}
// File: reservation/Citizen.java
package reservation;

public class Citizen extends Passenger {

    @Override
    public double calculateFare() {
        // Citizens pay the actual fare with no discount
        return getActualFare();
    }

    private double getActualFare() {
        // Define the actual fare calculation logic for citizens
        return 150.0; // Replace with your actual calculation
    }
}
// File: reservation/Citizen.java
package reservation;

public class Citizen extends Passenger {

    @Override
    public double calculateFare() {
        // Citizens pay the actual fare with no discount
        return getActualFare();
    }

    private double getActualFare() {
        // Define the actual fare calculation logic for citizens
        return 150.0; // Replace with your actual calculation
    }
}
// File: ReservationApp.java
import reservation.ReservationCalculator;
import reservation.Passenger;
import reservation.Child;
import reservation.Student;
import reservation.Citizen;
import reservation.SeniorCitizen;

public class ReservationApp {
    public static void main(String[] args) {
        Passenger[] passengers = {
                new Child(),
                new Student(),
                new Citizen(),
                new SeniorCitizen()
        };

        ReservationCalculator calculator = new ReservationCalculator();
        double totalFare = calculator.totalFare(passengers);

        System.out.println("Total Fare: $" + totalFare);
    }
}



