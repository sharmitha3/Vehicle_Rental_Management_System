public class Customer {
    private int cus_id;
    private String cus_name;
    private long mob_num;

    public Customer(int cus_id, String cus_name, long mob_num) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.mob_num = mob_num;
    }

    public int getCus_id() {
        return cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public long getMob_num() {
        return mob_num;
    }



    public void displayCustomer() {
        System.out.println("Customer id: " + cus_id);
        System.out.println("Customer name: " + cus_name);
        System.out.println("Mobile number: " + mob_num);
    }


}
