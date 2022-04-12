import java.util.Scanner;

public class Menu {
    private PatientPanel patientPanel;
    private DoctorPanel doctorPanel;
    private AdminPanel adminPanel;

    public Menu() {
        patientPanel = new PatientPanel();
        doctorPanel = new DoctorPanel();
        adminPanel = new AdminPanel();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a number\n1: Register\n2: login");
        String selection = input.nextLine();
        if (selection.equals("1")) {
            patientPanel.signup();
        } else if (selection.equals("2")) {
            System.out.println("Please select one\n1: Patient\n2: Doctor\n3: Admin");
            selection = input.nextLine();
            if (selection.equals("1")) {
                patientPanel.login();
            } else if (selection.equals("2")) {
                doctorPanel.login();
            } else if (selection.equals("3")) {
                adminPanel.login();
            }
        }
        menu();
    }

}
