public class Admin {
    private int admin_id;
    private String mail;

    public Admin(int admin_id, String mail) {
        this.admin_id = admin_id;
        this.mail = mail;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public String getMail() {
        return mail;
    }

    public void displayAdmin() {
        System.out.println("Admin ID: " + admin_id);
        System.out.println("Email: " + mail);
    }
}

