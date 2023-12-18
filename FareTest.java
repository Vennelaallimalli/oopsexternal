interface Fare {
    double getFare(String transportType, String serviceType, double distance);
    String getAmenities(String transportType, String serviceType);
}

class BusFare implements Fare {
    @Override
    public double getFare(String transportType, String serviceType, double distance) {
        // Assume different fare per kilometer for different types of buses
        double farePerKilometer = 2.0; // Default fare per kilometer

        switch (serviceType.toLowerCase()) {
            case "a/c":
                farePerKilometer = 3.0;
                break;
            case "sleeper":
                farePerKilometer = 2.5;
                break;
            // Add more cases for other types of buses as needed
        }

        return distance * farePerKilometer;
    }

    @Override
    public String getAmenities(String transportType, String serviceType) {
        // Assume different amenities for different types of buses
        switch (serviceType.toLowerCase()) {
            case "a/c":
                return "A/C bus amenities: Comfortable seating, air conditioning.";
            case "sleeper":
                return "Sleeper bus amenities: Sleeper berths, comfortable seating.";
            // Add more cases for other types of buses as needed
            default:
                return "Basic amenities provided in the bus.";
        }
    }
}

class TrainFare implements Fare {
    @Override
    public double getFare(String transportType, String serviceType, double distance) {
        // Assume different fare per kilometer for different types of trains
        double farePerKilometer = 2.5; // Default fare per kilometer

        switch (serviceType.toLowerCase()) {
            case "a/c":
                farePerKilometer = 4.0;
                break;
            case "sleeper":
                farePerKilometer = 3.0;
                break;
            // Add more cases for other types of trains as needed
        }

        return distance * farePerKilometer;
    }

    @Override
    public String getAmenities(String transportType, String serviceType) {
        // Assume different amenities for different types of trains
        switch (serviceType.toLowerCase()) {
            case "a/c":
                return "A/C train amenities: Air-conditioned coaches, meals provided.";
            case "sleeper":
                return "Sleeper train amenities: Sleeper berths, basic services.";
            // Add more cases for other types of trains as needed
            default:
                return "Basic amenities provided in the train.";
        }
    }
}

class FlightFare implements Fare {
    @Override
    public double getFare(String transportType, String serviceType, double distance) {
        // Assume different fare per kilometer for different types of flights
        double farePerKilometer = 5.0; // Default fare per kilometer

        switch (serviceType.toLowerCase()) {
            case "economy":
                farePerKilometer = 6.0;
                break;
            case "business":
                farePerKilometer = 8.0;
                break;
            // Add more cases for other types of flights as needed
        }

        return distance * farePerKilometer;
    }

    @Override
    public String getAmenities(String transportType, String serviceType) {
        // Assume different amenities for different types of flights
        switch (serviceType.toLowerCase()) {
            case "economy":
                return "Economy class amenities: In-flight entertainment, meals provided.";
            case "business":
                return "Business class amenities: Premium services, spacious seating.";
            // Add more cases for other types of flights as needed
            default:
                return "Basic amenities provided in the flight.";
        }
    }
}

public class FareTest {
    public static void main(String[] args) {
        BusFare busFare = new BusFare();
        TrainFare trainFare = new TrainFare();
        FlightFare flightFare = new FlightFare();

        double busDistance = 300.0; // distance traveled in km
        double trainDistance = 500.0;
        double flightDistance = 800.0;

        displayFareAndAmenities(busFare, "Bus", "A/C", busDistance);
        displayFareAndAmenities(trainFare, "Train", "Sleeper", trainDistance);
        displayFareAndAmenities(flightFare, "Flight", "Economy", flightDistance);
    }

    private static void displayFareAndAmenities(Fare fare, String transportType, String serviceType, double distance) {
        System.out.println("Transport: " + transportType);
        System.out.println("Service Type: " + serviceType);
        System.out.println("Fare: $" + fare.getFare(transportType, serviceType, distance));
        System.out.println("Amenities: " + fare.getAmenities(transportType, serviceType));
        System.out.println();
    }
}
