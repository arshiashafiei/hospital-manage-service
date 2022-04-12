import java.util.Scanner;

public class DoctorPanel {
    private DoctorManager doctorManager;
    private Scanner input = new Scanner(System.in);

    public DoctorPanel() {
        doctorManager = new DoctorManager();
    }

    public void login() {
        System.out.println("Enter your username and password:");
        String username = input.next();
        if (!doctorManager.authenticate(username, input.next())) {
            System.out.println("Login failed! try again");
            return;
        }
        System.out.println("Success!");
        doctorMenu(username);

    }

    public void doctorMenu(String username) {
        System.out.println("Select a number\n1: Add secretary\n2: Show medicines\n5: Logout");
        input.nextLine();
        String selection = input.next();
        if (selection.equals("1")) {
            addSecretary(username);
        } else if (selection.equals("2")) {
            showMedicines();
        } else if (selection.equals("5")) {
            return;
        }
        doctorMenu(username);
    }

    public void addSecretary(String username) {
        System.out.println("Enter name, Last name:");
        doctorManager.addSecretary(input.next(), input.next(), username);
        int size = doctorManager.getDoctorSecretaries(username).size();
        System.out.println("username (personnel number): "
                + doctorManager.getDoctorSecretaries(username).get(size - 1).getPersonnelNumber());
    }

    public void showMedicines() {
        for (Medicine medicine : doctorManager.getMedicines()) {
            System.out.println("Name: " + medicine.getName() + " | Price: "
                    + medicine.getPrice() + " | Expiry date: " + medicine.getExpiryDate() + " | Production date: "
                    + medicine.getProductionDate());
        }
    }
}
