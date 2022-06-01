package Controller;

import Model.*;

import java.util.ArrayList;

public class DoctorManager {

    public boolean register(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary, String specialty, String biography) {
        if (HospitalManager.findUser(username) != null) {
            return false;
        }
        Hospital.getDoctors().add(new Doctor(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary, specialty, biography));
        return true;
    }




    public void addMedicine(String name, String price, String productionDate, String expiryDate) {
        Hospital.getMedicines().add(new Medicine(name, price, productionDate, expiryDate));
    }

    public void addSecretary(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary, String doctorPersonnelNumber) {
        Hospital.getSecretaries().add(new Secretary(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary, doctorPersonnelNumber));
    }

    public Doctor getDoctorPersonnelNumber(String username) {
        return (Doctor) HospitalManager.findUser(username);
    }
}
