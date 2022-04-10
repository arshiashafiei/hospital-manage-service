import java.util.Scanner;

public class PatientPanel {
    private PatientManager patientManager;
    private Scanner input = new Scanner(System.in);

    public PatientPanel() {
        patientManager = new PatientManager();
    }
    
    public void signup() {
        System.out.println("Enter your name, lastName, password and phoneNumber:");
        patientManager.register(input.next(), input.next(), input.next(), input.next());
        
        System.out.println("Your username (case number): " + patientManager.getPatients().get(0).getCaseNumber());

    }

    public void login() {
        System.out.println("Enter your username and password:");
        if (!patientManager.authenticate(input.next(), input.next())) {
            System.out.println("Login failed! try again");
            return;
        }
        System.out.println("Success!");
        // should go to patient panel

    }
    
}
