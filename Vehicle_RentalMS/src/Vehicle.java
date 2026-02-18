public class Vehicle {
    private int vehicle_id;
    private String vehicle_type;
    private String pricing;

    public Vehicle(int vehicle_id, String vehicle_type, String pricing) {
        this.vehicle_id = vehicle_id;
        this.vehicle_type = vehicle_type;
        this.pricing = pricing;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public String getPricing() {
        return pricing;
    }

    public void displayVehicle() {
        System.out.println("Vehicle id: " + vehicle_id);
        System.out.println("Vehicle type: " + vehicle_type);
        System.out.println("Price " + pricing);
    }

    public void listall()
    {

    }
}

