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

            } else if (user instanceof Guard) {

            }
        }
        System.out.println("Failed to log in");
    }
}
