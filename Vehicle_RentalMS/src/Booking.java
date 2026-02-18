public class Booking {
    private int book_id;
    private int cus_id;

    public Booking(int book_id, int cus_id) {
        this.book_id = book_id;
        this.cus_id = cus_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void displayBooking() {
        System.out.println("Booking id: " + book_id);
        System.out.println("Customer id: " + cus_id);
    }
}
