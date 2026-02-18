public class Vehicle {

    private int vehicle_id;
    private String vehicle_type;
    private double pricing;
    private boolean available;

    public Vehicle(int vehicle_id, String vehicle_type, double pricing) {
        this.vehicle_id = vehicle_id;
        this.vehicle_type = vehicle_type;
        this.pricing = pricing;
        this.available = true; // default available
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public double getPricing() {
        return pricing;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayVehicle() {
        System.out.println("Vehicle ID: " + vehicle_id);
        System.out.println("Type: " + vehicle_type);
        System.out.println("Price: " + pricing);
        System.out.println("Available: " + (available ? "yes" : "no"));
    }
}
