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

    public int getCus_id() {
        return cus_id;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public int getBook_id() {
        return book_id;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void displayPayment() {
        System.out.println("Customer ID: " + cus_id);
        System.out.println("Payment ID: " + payment_id);
        System.out.println("Payment Type: " + payment_type);
        System.out.println("Booking ID: " + book_id);
        System.out.println("Payment Date: " + payment_date);
    }
}
