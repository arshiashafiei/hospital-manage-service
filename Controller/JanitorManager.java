package Controller;

import Model.*;

public class JanitorManager {

    public boolean register(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary) {
        if (HospitalManager.findUser(username) != null) {
            return false;
        }
        Hospital.getJanitors().add(new Janitor(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary));
        return true;
    }
}
