public class Booking {

    private int book_id;
    private int cus_id;
    private int vehicle_id;

    public Booking(int book_id, int cus_id, int vehicle_id) {
        this.book_id = book_id;
        this.cus_id = cus_id;
        this.vehicle_id = vehicle_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public int getCus_id() {
        return cus_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void displayBooking() {
        System.out.println("Booking ID: " + book_id);
        System.out.println("Customer ID: " + cus_id);
        System.out.println("Vehicle ID: " + vehicle_id);
    }
}
