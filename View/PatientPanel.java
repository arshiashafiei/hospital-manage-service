package View;

import Controller.*;
import Model.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientPanel {
    private final PatientManager patientManager;
    private final Scanner input = new Scanner(System.in);

    public PatientPanel() {
        patientManager = new PatientManager();
    }

    public void signup() {
        System.out.print("Enter your firstname: ");
        String firstname = input.nextLine();
        System.out.print("Enter your lastname: ");
        String lastname = input.nextLine();
        System.out.print("Enter your username: ");
        String username = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        System.out.print("Enter your phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter your email: ");
        String email = input.nextLine();

        if (patientManager.register(firstname, lastname, username, password, phoneNumber, email)) {
            System.out.println("success!");
        } else {
            System.out.println("failed! try again");
        }

    }


    public void patientMenu(String username) {
        System.out.println("""
                Select a number
                1: Change info
                2: Show doctors
                3: Show info
                4: Reserve
                5: show reservations
                6: logout"""
        );
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                editInfo(username);
                break;
            case "2":
                showDoctors();
                break;
            case "3":
                showInfo(username);
                break;
            case "4":
                reserve(username);
                break;
            case "5":
                showReservation(username);
                break;
            case "6":
                return;
        }
        patientMenu(username);
    }

    public void editInfo(String username) {
        System.out.println("What do you want to change?\n1: Name\n2: Last name\n3: Password\n4: Phone number\n5: Email");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                patientManager.getPatientInfo(username).setFirstName(input.nextLine());
                break;
            case "2":
                patientManager.getPatientInfo(username).setLastName(input.nextLine());
                break;
            case "3":
                patientManager.getPatientInfo(username).setPassword(input.nextLine());
                break;
            case "4":
                patientManager.getPatientInfo(username).setPhoneNumber(input.nextLine());
                break;
            case "5":
                patientManager.getPatientInfo(username).setEmail(input.nextLine());
                break;
        }

    }

    public void showInfo(String username) {
        System.out.println(patientManager.getPatientInfo(username).toString());
    }

    public void showDoctors() {
        ArrayList<Doctor> doctors = Hospital.getDoctors();
        for (Doctor doctor : doctors) {
            System.out.println("Full Name: " + doctor.getFirstName() + " " + doctor.getLastName() +
                    " | Personnel number: " + doctor.getPersonnelNumber() +
                    " | Specialty: " + doctor.getSpecialty());
        }
    }

    public void showDoctorsBySpecialty() {
        ArrayList<Doctor> doctors = Hospital.getDoctors();
        for (Doctor doctor : doctors) {
            System.out.println("Full Name: " + doctor.getFirstName() + " " + doctor.getLastName() +
                    " | Personnel number: " + doctor.getPersonnelNumber() +
                    " | Specialty: " + doctor.getSpecialty());
        }
    }

    public void reserve(String username) {
        showDoctors();
        System.out.println("Is this an Emergency:\n1. YES\n2. No");
        boolean emergency;
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                emergency = true;
                break;
            case "2":
                emergency = false;
                break;
            default:
                emergency = false;
                System.out.println("non selected default to NO");
        }
        System.out.println("please select a doctor by entering the personnel number:");
        if (!patientManager.reserve(input.nextLine(), username, emergency, getDateFromUser())) {
            System.out.println("failed");
        }
    }

    public LocalDateTime getDateFromUser() {
        System.out.println("Please enter a date in this format 'YYYY-MM-DD': ");
        String date = input.nextLine();
        System.out.println("Please enter a time in this format 'HH:MM': ");
        String time = input.nextLine();
        return LocalDateTime.parse(date + time, DateTimeFormatter.ofPattern("yyyy-MM-ddHH:mm"));
    }

    public void showReservation(String username) {
        for (Reservation reservation : patientManager.getPatientInfo(username).getReservationList()) {
            System.out.println("Date: " + reservation.getStartDate().toString() + " | Model.Doctor personnel number: "
                    + reservation.getDoctorPersonnelNumber() + " | reserve number: " + reservation.getReserveCounter());
        }
    }
}
