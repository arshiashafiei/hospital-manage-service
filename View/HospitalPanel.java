package View;

import Controller.*;
import Model.*;

import java.util.Scanner;

public class HospitalPanel {
    private Scanner input = new Scanner(System.in);
    public void login() {
        System.out.print("Please enter your username: ");
        String username = input.nextLine();
        System.out.print("Please enter your password: ");
        String password = input.nextLine();

        if (HospitalManager.authenticate(username, password)) {
            User user = HospitalManager.findUser(username);
            System.out.println("Successfully Logged In");
            if (user instanceof Patient) {
                PatientPanel patientPanel = new PatientPanel();
                patientPanel.patientMenu(username);
            } else if (user instanceof Doctor) {
                DoctorPanel doctorPanel = new DoctorPanel();
                doctorPanel.doctorMenu(username);
            } else if (user instanceof Janitor) {
                JanitorPanel janitorPanel = new JanitorPanel();
                janitorPanel.janitorMenu(username);
            } else if (user instanceof Guard) {
                GuardPanel guardPanel = new GuardPanel();
                guardPanel.guardMenu(username);
            } else if (user instanceof Secretary) {
                SecretaryPanel secretaryPanel = new SecretaryPanel();
                secretaryPanel.secretaryMenu(username);
            }
        } else {
            System.out.println("Failed to log in");
        }
    }
}
