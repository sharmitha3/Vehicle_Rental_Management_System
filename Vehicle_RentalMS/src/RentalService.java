import java.util.*;
public class RentalService {
    private List<Customer> customers = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private List<Admin> admins = new ArrayList<>();



    public void registerAdmin(int id, String email) {
        admins.add(new Admin(id, email));
        System.out.println("Admin Registered Successfully!");
    }

    public boolean validateAdmin(int id, String email) {
        for (Admin a : admins) {
            if (a.getAdmin_id() == id && a.getMail().equals(email)) {
                return true;
            }
        }
        return false;
    }



    public void addCustomer(int id, String name, long mobile) {
        customers.add(new Customer(id, name, mobile));
        System.out.println("Customer Added Successfully!");
    }

    public boolean customerExists(int id) {
        for (Customer c : customers) {
            if (c.getCus_id() == id)
                return true;
        }
        return false;
    }


    public void addVehicle(int adminId, String email, int vid, String type, double price) {

        if (validateAdmin(adminId, email)) {
            vehicles.add(new Vehicle(vid, type, price));
            System.out.println("Vehicle Added Successfully!");
        } else {
            System.out.println("Invalid Admin Credentials!");
        }
    }

    public void viewVehicles() {
        for (Vehicle v : vehicles) {
            v.displayVehicle();
        }
    }



    public void createBooking(int bid, int cusId, int vehicleId, double givenPrice) {

        if (!customerExists(cusId)) {
            System.out.println("Customer does not exist!");
            return;
        }

        for (Vehicle v : vehicles) {

            if (v.getVehicle_id() == vehicleId) {

                if (!v.isAvailable()) {
                    System.out.println("Vehicle Not Available!");
                    return;
                }

                if (v.getPricing() != givenPrice) {
                    System.out.println("Price Mismatch! Booking Failed.");
                    return;
                }

                bookings.add(new Booking(bid, cusId, vehicleId));
                v.setAvailable(false);
                System.out.println("Booking Successful!");
                return;
            }
        }

        System.out.println("Vehicle Not Found!");
    }

    public void makePayment(int cusId, int bookingId,
                            int paymentId, String type, String date) {

        for (Booking b : bookings) {

            if (b.getBook_id() == bookingId &&
                    b.getCus_id() == cusId) {

                Payment p = new Payment(cusId, paymentId, type, bookingId, date);
                p.displayPayment();
                System.out.println("Payment Successful!");
                return;
            }
        }

        System.out.println("Invalid! Booking & Customer mismatch.");
    }


}
