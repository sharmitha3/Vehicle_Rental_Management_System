public class Payment {
    private int cus_id;
    private int payment_id;
    private String payment_type;
    private int book_id;
    private String payment_date;

    public Payment(int cus_id, int payment_id, String payment_type, int book_id, String payment_date) {
        this.cus_id = cus_id;
        this.payment_id = payment_id;
        this.payment_type = payment_type;
        this.book_id = book_id;
        this.payment_date = payment_date;
    }

    public boolean checking(Customer c, Booking b) {
        if (c.getCus_id() == cus_id && b.getBook_id() == book_id) {
            return true;
        }
        return false;
    }

    public void displayPayment() {
        System.out.println("Customer id: " + cus_id);
        System.out.println("Payment id: " + payment_id);
        System.out.println("Payment Type: " + payment_type);
        System.out.println("Booking id: " + book_id);
        System.out.println("Payment date: " + payment_date);
    }
}
