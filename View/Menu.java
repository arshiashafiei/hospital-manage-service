package View;

import Controller.*;
import Model.*;

import java.util.Scanner;

public class Menu {
    private PatientPanel patientPanel;
    private DoctorPanel doctorPanel;
    private AdminPanel adminPanel;
    private HospitalPanel hospitalPanel;

    public Menu() {
        patientPanel = new PatientPanel();
        doctorPanel = new DoctorPanel();
        adminPanel = new AdminPanel();
        hospitalPanel = new HospitalPanel();
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a number\n1: Register as patient\n2: login\n3: Exit");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                patientPanel.signup();
                break;
            case "2":
                System.out.println("Select a number\n1: login as Admin\n2: log in as others");
                selection = input.nextLine();
                switch (selection) {
                    case "1":
                        adminPanel.login();
                        break;
                    case "2":
                        hospitalPanel.login();
                        break;
                }
                break;
            case "3":
                return;
        }

        menu();
    }

}
