import java.util.ArrayList;
import java.util.Scanner;

public class PatientPanel {
    private PatientManager patientManager;
    private DoctorManager doctorManager;
    private Scanner input = new Scanner(System.in);

    public PatientPanel() {
        patientManager = new PatientManager();
        doctorManager = new DoctorManager();
    }

    public void signup() {
        System.out.println("Enter your name, lastName, password and phoneNumber:");
        patientManager.register(input.next(), input.next(), input.next(), input.next());
        int size = patientManager.getPatients().size();
        System.out
                .println("Your username (case number): " + patientManager.getPatients().get(size - 1).getCaseNumber());
    }

    public void login() {
        System.out.println("Enter your username and password:");
        String username = input.next();
        if (!patientManager.authenticate(username, input.next())) {
            System.out.println("Login failed! try again");
            return;
        }
        System.out.println("Success!");
        patientMenu(username);

    }

    public void patientMenu(String username) {
        System.out.println(
                "Select a number\n1: Change info\n2: Show doctors\n3: Show info\n4: Reserve\n5: show reservations\n6: logout");
        input.nextLine();
        String selection = input.next();
        if (selection.equals("1")) {
            editInfo(username);
        } else if (selection.equals("2")) {
            showDoctors();
        } else if (selection.equals("3")) {
            showInfo(username);
        } else if (selection.equals("4")) {
            reserve(username);
        } else if (selection.equals("5")) {
            showReservation(username);
        } else if (selection.equals("5")) {
            return;
        }
        patientMenu(username);
    }

    public void editInfo(String username) {
        System.out.println("What do you want to change?\n1: Name\n2: Last name\n3: Password\n4: Phone number");
        String selection = input.next();
        System.out.println("Type it:");
        if (selection.equals("1")) {
            patientManager.getPatientInfo(username).setName(input.next());
        } else if (selection.equals("2")) {
            patientManager.getPatientInfo(username).setLastName(input.next());
        } else if (selection.equals("3")) {
            patientManager.getPatientInfo(username).setPassword(input.next());
        } else if (selection.equals("4")) {
            patientManager.getPatientInfo(username).setPhoneNumber(input.next());
        }

    }

    public void showInfo(String username) {
        System.out.println(patientManager.getPatientInfo(username).toString());
    }

    public void showDoctors() {
        ArrayList<Doctor> doctors = doctorManager.getDoctors();
        for (Doctor doctor : doctors) {
            System.out.println("Full Name: " + doctor.getName() + " " + doctor.getLastName() +
                    " | Personnel number: " + doctor.getPersonnelNumber() +
                    " | Specialty: " + doctor.getSpecialty());
        }
    }

    public void reserve(String username) {
        showDoctors();
        System.out.println("please select a doctor by entering the personnel number:");
        if (!patientManager.reserve(input.next(), username)) {
            System.out.println("failed");
        }
    }

    public void showReservation(String username) {
        for (Reservation reservation : patientManager.getPatientInfo(username).getReservationList()) {
            System.out.println("Date: " + reservation.getDate() + " | Doctor personnel number: "
                    + reservation.getDoctorPersonnelNumber() + " | reserve number: " + reservation.getReserveNumber());
        }
    }
}
