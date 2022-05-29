package View;

import Controller.*;
import Model.*;

import java.util.Scanner;

public class AdminPanel {
    private final AdminManager adminManager;
    private final DoctorManager doctorManager;
    private final JanitorManager janitorManager;
    private final GuardManager guardManager;
    private final Scanner input = new Scanner(System.in);


    public AdminPanel() {
        adminManager = new AdminManager();
        doctorManager = new DoctorManager();
        janitorManager = new JanitorManager();
        guardManager = new GuardManager();
    }


    public void login() {
        System.out.println("Enter your username and password:");
        if (!adminManager.authenticate(input.next(), input.next())) {
            System.out.println("Login failed! try again");
            return;
        }
        System.out.println("Success!");
        adminMenu();
    }

    public void adminMenu() {
        System.out.println("Select a number\n1: Add an Model.Employee\n2: Add Model.Medicine\n3:Log out");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                registerEmployee();
                break;
            case "2":
                addMedicine();
                break;
            case "3":
                return;
        }
        adminMenu();

    }

    public void registerEmployee() {
        System.out.println("select an employee to add:\n1. Model.Doctor\n2. Model.Janitor\n3. Model.Guard");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                registerDoctor();
                break;
            case "2":
                registerJanitor();
                break;
            case "3":
                registerGuard();
                break;
        }

    }

    public void registerDoctor() {
        System.out.print("Enter doctor firstname: ");
        String firstname = input.nextLine();
        System.out.print("Enter doctor lastname: ");
        String lastname = input.nextLine();
        System.out.print("Enter doctor username: ");
        String username = input.nextLine();
        System.out.print("Enter doctor password: ");
        String password = input.nextLine();
        System.out.print("Enter doctor phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter doctor email: ");
        String email = input.nextLine();
        System.out.print("Enter doctor hours To Work daily: ");
        double hoursToWork = input.nextDouble();
        input.nextLine();
        System.out.print("Enter doctor salary in a month: ");
        double salary = input.nextDouble();
        input.nextLine();

        System.out.print("Enter doctor specialty: ");
        String specialty = input.nextLine();
        System.out.print("Enter doctor biography: ");
        String biography = input.nextLine();

        if (doctorManager.register(firstname, lastname, username, password, phoneNumber, email, hoursToWork, salary, specialty, biography)) {
            System.out.println("success!");
            int size = Hospital.getDoctors().size();
            System.out.println( "Model.Doctor personnel number: " + Hospital.getDoctors().get(size - 1).getPersonnelNumber());
        } else {
            System.out.println("failed! try again");
        }
    }

    public void registerGuard() {
        System.out.print("Enter Model.Guard firstname: ");
        String firstname = input.nextLine();
        System.out.print("Enter Model.Guard lastname: ");
        String lastname = input.nextLine();
        System.out.print("Enter Model.Guard username: ");
        String username = input.nextLine();
        System.out.print("Enter Model.Guard password: ");
        String password = input.nextLine();
        System.out.print("Enter Model.Guard phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter Model.Guard email: ");
        String email = input.nextLine();
        System.out.print("Enter Model.Guard hours To Work daily: ");
        double hoursToWork = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Model.Guard salary in a month: ");
        double salary = input.nextDouble();
        input.nextLine();

        if (guardManager.register(firstname, lastname, username, password, phoneNumber, email, hoursToWork, salary)) {
            System.out.println("success!");
            int size = Hospital.getGuards().size();
            System.out.println( "Model.Guard personnel number: " + Hospital.getGuards().get(size - 1).getPersonnelNumber());
        } else {
            System.out.println("failed! try again");
        }
    }
    public void registerJanitor() {
        System.out.print("Enter Model.Janitor firstname: ");
        String firstname = input.nextLine();
        System.out.print("Enter Model.Janitor lastname: ");
        String lastname = input.nextLine();
        System.out.print("Enter Model.Janitor username: ");
        String username = input.nextLine();
        System.out.print("Enter Model.Janitor password: ");
        String password = input.nextLine();
        System.out.print("Enter Model.Janitor phone number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter Model.Janitor email: ");
        String email = input.nextLine();
        System.out.print("Enter Model.Janitor hours To Work daily: ");
        double hoursToWork = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Model.Janitor salary in a month: ");
        double salary = input.nextDouble();
        input.nextLine();

        if (janitorManager.register(firstname, lastname, username, password, phoneNumber, email, hoursToWork, salary)) {
            System.out.println("success!");
            int size = Hospital.getJanitors().size();
            System.out.println( "Model.Janitor personnel number: " + Hospital.getJanitors().get(size - 1).getPersonnelNumber());
        } else {
            System.out.println("failed! try again");
        }
    }

    public void addMedicine() {
        System.out.println("Enter Model.Medicine name: ");
        String name = input.nextLine();
        System.out.println("Enter Model.Medicine price: ");
        String price = input.nextLine();
        System.out.println("Enter Model.Medicine production date: ");
        String productionDate = input.nextLine();
        System.out.println("Enter Model.Medicine expiry date: ");
        String expiryDate = input.nextLine();
        doctorManager.addMedicine(name, price, productionDate, expiryDate);
    }

    public void moveDateForward(int daysToAdd) {
        Hospital.getTime().addDay(daysToAdd);
    }

}
