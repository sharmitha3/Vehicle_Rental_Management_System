import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n---- VEHICLE RENTAL SYSTEM ----");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Create Booking");
            System.out.println("4. Make Payment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("enter customer id: ");
                    int cid = sc.nextInt();
                    System.out.println("enter customer name : ");
                    String cname = sc.next();
                    System.out.print("Enter Mobile Number: ");
                    long cnum = sc.nextLong();

                    Customer c = new Customer(cid, cname, cnum);
                    c.displayCustomer();
                    break;


                case 2:
                    System.out.println("Add vehicle by admin ");
                    System.out.print("Enter admin id: ");
                    int aid = sc.nextInt();

                    System.out.print("Enter Vehicle ID: ");
                    int vid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Vehicle Type: ");
                    String vtype = sc.nextLine();
                    System.out.print("Enter Pricing: ");
                    String price = sc.nextLine();

                    Vehicle v = new Vehicle(vid, vtype, price);
                    v.displayVehicle();
                    break;

                case 3:
                    System.out.print("Enter Booking ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int bcustid = sc.nextInt();

                    Booking b = new Booking(bid, bcustid);
                    b.displayBooking();
                    break;

                case 4:
                    System.out.println("Enter customer id ");
                    int ciid = sc.nextInt();
                    System.out.print("Enter Booking ID: ");
                    int pbid = sc.nextInt();

                    System.out.print("Enter Payment ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Payment Type: ");
                    String ptype = sc.nextLine();

                    sc.nextLine();
                    System.out.print("Enter Payment Date: ");
                    String pdate = sc.nextLine();

                    Payment p = new Payment(ciid,pid, ptype, pbid, pdate);
                    if(p.checking())
                    {
                        p.displayPayment();
                    }
                    else {
                        System.out.println("Not valid");
                    }

                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");


            }
        }  while(choice!=5);


    }

}










