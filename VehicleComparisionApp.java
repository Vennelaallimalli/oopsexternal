import java.util.Scanner;

class Vehicle {
    String company;
    String model;
    double mileage;
    double fuelCapacity;
    double displacement;

    public Vehicle(String company, String model, double mileage, double fuelCapacity, double displacement) {
        this.company = company;
        this.model = model;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
    }

    void displayDetails() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Displacement: " + displacement + " cc");
    }
}

class TwoWheeler extends Vehicle {
    String frontBrake;
    String rearBrake;
    String tyreType;
    String headLamp;
    String userReviews;

    public TwoWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                      String frontBrake, String rearBrake, String tyreType, String headLamp, String userReviews) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.frontBrake = frontBrake;
        this.rearBrake = rearBrake;
        this.tyreType = tyreType;
        this.headLamp = headLamp;
        this.userReviews = userReviews;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Front Brake: " + frontBrake);
        System.out.println("Rear Brake: " + rearBrake);
        System.out.println("Tyre Type: " + tyreType);
        System.out.println("Head Lamp: " + headLamp);
        System.out.println("User Reviews: " + userReviews);
    }
}

class FourWheeler extends Vehicle {
    boolean airConditioner;
    boolean airBags;
    boolean powerSteering;
    boolean rainSensingWiper;

    public FourWheeler(String company, String model, double mileage, double fuelCapacity, double displacement,
                       boolean airConditioner, boolean airBags, boolean powerSteering, boolean rainSensingWiper) {
        super(company, model, mileage, fuelCapacity, displacement);
        this.airConditioner = airConditioner;
        this.airBags = airBags;
        this.powerSteering = powerSteering;
        this.rainSensingWiper = rainSensingWiper;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Air Conditioner: " + airConditioner);
        System.out.println("Air Bags: " + airBags);
        System.out.println("Power Steering: " + powerSteering);
        System.out.println("Rain Sensing Wiper: " + rainSensingWiper);
    }
}

public class VehicleComparisonApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TwoWheeler bike1 = new TwoWheeler("Honda", "Activa", 55.0, 5.3, 109.5,
                "Disc", "Drum", "Tubeless", "LED", "Positive");
        TwoWheeler bike2 = new TwoWheeler("TVS", "Jupiter", 60.0, 5.0, 110.0,
                "Drum", "Drum", "Tubeless", "Halogen", "Good");

        FourWheeler car1 = new FourWheeler("Maruti Suzuki", "Swift", 20.0, 42.0, 1197.0,
                true, false, true, false);
        FourWheeler car2 = new FourWheeler("Hyundai", "Creta", 16.0, 50.0, 1497.0,
                true, true, true, true);

        // Display available vehicles
        System.out.println("Available Vehicles:");
        System.out.println("1. " + bike1.company + " " + bike1.model);
        System.out.println("2. " + bike2.company + " " + bike2.model);
        System.out.println("3. " + car1.company + " " + car1.model);
        System.out.println("4. " + car2.company + " " + car2.model);

        // Get user choices for comparison
        System.out.println("Enter the numbers of vehicles to compare (comma-separated):");
        String input = scanner.nextLine();
        String[] choices = input.split(",");

        // Display comparison results
        System.out.println("Comparison Results:");
        for (String choice : choices) {
            try {
                int index = Integer.parseInt(choice.trim()) - 1;
                if (index >= 0 && index < 4) {
                    switch (index) {
                        case 0:
                            bike1.displayDetails();
                            break;
                        case 1:
                            bike2.displayDetails();
                            break;
                        case 2:
                            car1.displayDetails();
                            break;
                        case 3:
                            car2.displayDetails();
                            break;
                    }
                    System.out.println("--------------------");
                } else {
                    System.out.println("Invalid choice: " + choice);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + choice);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
