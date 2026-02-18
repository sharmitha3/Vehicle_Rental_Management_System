import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RentalService service = new RentalService();

        int choice;

        do {
            System.out.println("\n---- VEHICLE RENTAL SYSTEM ----");
            System.out.println("1. Register Admin");
            System.out.println("2. Add Customer");
            System.out.println("3. Add Vehicle (Admin Only)");
            System.out.println("4. View Vehicles");
            System.out.println("5. Create Booking");
            System.out.println("6. Make Payment");
            System.out.println("7. Exit");
            System.out.println();

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Admin ID: ");
                    int aid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    service.registerAdmin(aid, email);
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Mobile: ");
                    long mob = sc.nextLong();
                    service.addCustomer(cid, name, mob);
                    break;

                case 3:
                    System.out.print("Enter Admin ID: ");
                    int adid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Email: ");
                    String mail = sc.nextLine();
                    System.out.print("Enter Vehicle ID: ");
                    int vid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Type: ");
                    String type = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    service.addVehicle(adid, mail, vid, type, price);
                    break;

                case 4:
                    service.viewVehicles();
                    break;

                case 5:
                    System.out.print("Enter Booking ID: ");
                    int bid = sc.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int cus = sc.nextInt();
                    System.out.print("Enter Vehicle ID: ");
                    int v = sc.nextInt();
                    System.out.print("Enter Given Price: ");
                    double gp = sc.nextDouble();
                    service.createBooking(bid, cus, v, gp);
                    break;

                case 6:
                    System.out.print("Enter Customer ID: ");
                    int pc = sc.nextInt();
                    System.out.print("Enter Booking ID: ");
                    int pb = sc.nextInt();
                    System.out.print("Enter Payment ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Type: ");
                    String ptype = sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    service.makePayment(pc, pb, pid, ptype, date);
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
