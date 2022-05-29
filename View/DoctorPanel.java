package View;

import Controller.*;
import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorPanel {
    private final DoctorManager doctorManager;
    private final PatientManager patientManager;
    private final Scanner input = new Scanner(System.in);

    public DoctorPanel() {
        doctorManager = new DoctorManager();
        patientManager = new PatientManager();
    }

    public void doctorMenu(String doctorUsername) {
        System.out.println("Select a number\n1: Add secretary\n2: Show medicines\n5: Logout");
        input.nextLine();
        String selection = input.next();
        if (selection.equals("1")) {
            addSecretary(doctorUsername);
        } else if (selection.equals("2")) {
            showMedicines();
        } else if (selection.equals("5")) {
            return;
        }
        doctorMenu(doctorUsername);
    }

    public void addSecretary(String doctorUsername) {
        System.out.print("Enter Model.Secretary firstname: ");
        String firstName = input.nextLine();
        System.out.print("Enter Model.Secretary lastname: ");
        String lastName = input.nextLine();
        System.out.print("Enter Model.Secretary username: ");
        String username = input.nextLine();
        System.out.print("Enter Model.Secretary password: ");
        String password = input.nextLine();
        System.out.print("Enter Model.Secretary phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter Model.Secretary email: ");
        String email = input.nextLine();
        System.out.print("Enter Model.Secretary hours To Work daily: ");
        double hoursToWorkInDay = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Model.Secretary salary in a month: ");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Model.Secretary doctor Personnel Number: ");
        String doctorPersonnelNumber = input.nextLine();

        doctorManager.addSecretary(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary, doctorPersonnelNumber);
        ArrayList<Secretary> doctorSecretaries = patientManager.getDoctorSecretaries(username);
        System.out.println("Model.Secretary personnel number: "
                + doctorSecretaries.get(doctorSecretaries.size() - 1));
    }

    public void showMedicines() {
        for (Medicine medicine : Hospital.getMedicines()) {
            System.out.println("Name: " + medicine.getName() + " | Price: "
                    + medicine.getPrice() + " | Expiry date: " + medicine.getExpiryDate() + " | Production date: "
                    + medicine.getProductionDate());
        }
    }
}
