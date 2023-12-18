import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TicketReservation {
    private static final int AC_CAPACITY = 2 * 70;  // Total capacity for A/C coaches (2 coaches)
    private static final int SLEEPER_CAPACITY = 2 * 70;  // Total capacity for Sleeper coaches (2 coaches)

    private static final String[] acBerths = {"B1", "B2"};
    private static final String[] sleeperBerths = {"S1", "S2"};

    private String[] bookedBerths = new String[AC_CAPACITY + SLEEPER_CAPACITY];
    private int bookedCount = 0;

    // Method to reserve berths based on user input
    public void reserveBerths(int numBerths, String coachClass) throws ReservationException {
        if (numBerths > 6) {
            throw new ReservationException("You may be an Agent. Maximum 6 berths allowed.");
        }

        if (numBerths > getAvailableCapacity(coachClass)) {
            throw new ReservationException("Not enough available berths in " + coachClass + " class.");
        }

        // Randomly allocate berths
        allocateBerths(numBerths, coachClass);

        // Display confirmed berths
        System.out.println("Confirmed berths:");
        for (int i = bookedCount - numBerths; i < bookedCount; i++) {
            System.out.println(bookedBerths[i]);
        }
    }

    // Method to get the available capacity for a given coach class
    private int getAvailableCapacity(String coachClass) {
        if ("A/C".equalsIgnoreCase(coachClass)) {
            return AC_CAPACITY - bookedCount;
        } else if ("Sleeper".equalsIgnoreCase(coachClass)) {
            return SLEEPER_CAPACITY - bookedCount;
        } else {
            return 0;
        }
    }

    // Method to allocate berths randomly
    private void allocateBerths(int numBerths, String coachClass) {
        String[] availableBerths = getAvailableBerths(coachClass);

        Random random = new Random();
        for (int i = 0; i < numBerths; i++) {
            int randomIndex = random.nextInt(availableBerths.length - i);
            bookedBerths[bookedCount++] = availableBerths[randomIndex];
            swap(availableBerths, randomIndex, availableBerths.length - i - 1);
        }
    }

    // Method to get the available berths for a given coach class
    private String[] getAvailableBerths(String coachClass) {
        return "A/C".equalsIgnoreCase(coachClass) ? acBerths : sleeperBerths;
    }

    // Helper method to swap elements in an array
    private void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

// Custom exception class for reservation conditions
class ReservationException extends Exception {
    public ReservationException(String message) {
        super(message);
    }
}

public class TrainTicketReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of berths (max 6): ");
        int numBerths = scanner.nextInt();

        System.out.print("Enter the coach class (A/C or Sleeper): ");
        String coachClass = scanner.next();

        TicketReservation ticketReservation = new TicketReservation();

        try {
            ticketReservation.reserveBerths(numBerths, coachClass);
        } catch (ReservationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
