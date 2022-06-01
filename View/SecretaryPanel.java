package View;

import Controller.*;
import Model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class SecretaryPanel {
    private final PatientManager patientManager;
    private final SecretaryManager secretaryManager;
    private final Scanner input = new Scanner(System.in);

    public SecretaryPanel() {
        this.patientManager = new PatientManager();
        this.secretaryManager = new SecretaryManager();
    }

    public void secretaryMenu(String secretaryUsername) {
        System.out.println("Select a number\n1: Show Reservation\n5: Logout");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                showReservations(secretaryUsername);
                break;
            case "2":
//                secretaryManager.sortReservations();
                break;
            case "5":
                return;
        }
        secretaryMenu(secretaryUsername);
    }

    public void showReservations(String secretaryUsername) {
        ArrayList<Reservation> reservations = patientManager.getDoctorSecretaries(secretaryManager.getSecretaryInfo(secretaryUsername).getDoctorPersonnelNumber()).get(0).getReservationList();

        for (Reservation reservation : reservations) {
            System.out.println(reservation.toString());
        }
        System.out.println("Do you want to sort reservations:(y or n)");
        String selection = input.nextLine();
        if ("y".equals(selection)) {
            System.out.println("sorting...");
            secretaryManager.sortReservations(reservations);
        } else {
            System.out.println("not sorting");
        }

    }



}
