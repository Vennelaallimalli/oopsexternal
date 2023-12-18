interface Vehicle {
    String getCompany();
    String getModel();
    String getType(); // Petrol, Diesel, CNG
    double getConsumption(); // in km per liter or km per kg
}

class TwoWheeler implements Vehicle {
    private String company;
    private String model;
    private String type;

    public TwoWheeler(String company, String model, String type) {
        this.company = company;
        this.model = model;
        this.type = type;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getConsumption() {
        switch (type.toLowerCase()) {
            case "petrol":
                return 62.0; // km per liter
            case "diesel":
                return 82.0; // km per liter
            case "cng":
                return 72.0; // km per kg
            default:
                return 0.0; // Invalid type
        }
    }
}

class FourWheeler implements Vehicle {
    private String company;
    private String model;
    private String type;

    public FourWheeler(String company, String model, String type) {
        this.company = company;
        this.model = model;
        this.type = type;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getConsumption() {
        switch (type.toLowerCase()) {
            case "petrol":
                return 14.0; // km per liter
            case "diesel":
                return 22.0; // km per liter
            case "cng":
                return 18.0; // km per kg
            default:
                return 0.0; // Invalid type
        }
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler("Honda", "CBR", "Petrol");
        FourWheeler car = new FourWheeler("Toyota", "Corolla", "Diesel");

        displayVehicleInfo(bike);
        displayVehicleInfo(car);
    }

    private static void displayVehicleInfo(Vehicle vehicle) {
        System.out.println("Company: " + vehicle.getCompany());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Type: " + vehicle.getType());
        System.out.println("Fuel Consumption: " + vehicle.getConsumption() + " km per unit");
        System.out.println();
    }
}
