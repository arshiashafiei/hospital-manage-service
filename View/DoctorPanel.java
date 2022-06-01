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
        System.out.println("Select a number\n1: Add secretary\n2: Show medicines\n3: Logout");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                addSecretary(doctorUsername);
                break;
            case "2":
                showMedicines();
                break;
            case "3":
                return;
        }
        doctorMenu(doctorUsername);
    }

    public void addSecretary(String doctorUsername) {
        System.out.print("Enter Secretary firstname: ");
        String firstName = input.nextLine();
        System.out.print("Enter Secretary lastname: ");
        String lastName = input.nextLine();
        System.out.print("Enter Secretary username: ");
        String username = input.nextLine();
        System.out.print("Enter Secretary password: ");
        String password = input.nextLine();
        System.out.print("Enter Secretary phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter Secretary email: ");
        String email = input.nextLine();
        System.out.print("Enter Secretary hours To Work daily: ");
        double hoursToWorkInDay = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Secretary salary in a month: ");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Secretary doctor Personnel Number: ");
        String doctorPersonnelNumber = input.nextLine();

        doctorManager.addSecretary(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary, doctorPersonnelNumber);
        ArrayList<Secretary> doctorSecretaries = patientManager.getDoctorSecretaries(doctorUsername);
        System.out.println("Secretary personnel number: "
                + doctorSecretaries.get(doctorSecretaries.size() - 1));
    }

    public void showMedicines() {
        int i = 1;
        for (Medicine medicine : Hospital.getMedicines()) {
            System.out.println("ID: " + i + " Name: " + medicine.getName() + " | Price: "
                    + medicine.getPrice() + " | Expiry date: " + medicine.getExpiryDate() + " | Production date: "
                    + medicine.getProductionDate());
            i++;
        }
    }

//    public Medicine selectMedicine() {
//        String selected  = input.nextLine();
//        return Hospital.getMedicines().get(Integer.parseInt(selected) - 1);
//    }

//    public void visitPatient(String doctorUsername) {
//        Patient patient = sec.getReadyToVisitPatient(doctorUsername);
//        ArrayList<Medicine> medicines = new ArrayList<>();
//        Prescription prescription = new Prescription(Hospital.getTime().getSystemTime(), );
//        showMedicines();
//        boolean condition = true;
//        while (condition) {
//            medicines.add(selectMedicine());
//            prescription.setMedicineList(medicines);
//
//        }
//    }
}
