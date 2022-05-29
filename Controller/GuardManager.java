package Controller;

import Model.Guard;
import Model.Hospital;

public class GuardManager {
    public boolean register(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary) {
        if (HospitalManager.findUser(username) != null) {
            return false;
        }
        Hospital.getGuards().add(new Guard(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary));
        return true;
    }
}
