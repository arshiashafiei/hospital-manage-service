import java.util.Scanner;

public class AdminPanel {
    private DoctorManager doctorManager;
    private AdminManager adminManager;
    private Scanner input = new Scanner(System.in);


    public AdminPanel() {
        adminManager = new AdminManager();
        doctorManager = new DoctorManager();
    }
    

    public void login() {
        System.out.println("Enter your username and password:");
        if (!adminManager.authenticate(input.next(), input.next())) {
            System.out.println("Login failed! try again");
            return;
        }
        System.out.println("Success!");
        adminMenu();
    }

    public void adminMenu() {
        System.out.println("Select a number\n1: Add a doctor\n2: Add Medicine\n3:Log out");
        input.nextLine();
        String selection = input.nextLine();
        if (selection.equals("1")) {
            registerDoctor();
        } else if (selection.equals("2")) {
            addMedicine();
        } else if (selection.equals("3")) {
            return;
        }
        adminMenu();

    }

    public void registerDoctor() {
        System.out.println("Enter the doctor's name, lastName, password and specialty:");
        doctorManager.register(input.next(), input.next(), input.next(), input.next());
        int size = doctorManager.getDoctors().size();
        System.out.println("The doctor username (personnel number): " + doctorManager.getDoctors().get(size - 1).getPersonnelNumber());
        
    }

    public void addMedicine() {
        System.out.println("Enter Medicine name, price, production date and expiry date:");
        doctorManager.addMedicine(input.next(), input.next(), input.next(), input.next());
    }


}
