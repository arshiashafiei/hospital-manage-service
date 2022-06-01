package Controller;

import Model.Admin;
import Model.Hospital;

public class AdminManager {
    private Admin admin;

    public AdminManager() {
        admin = new Admin("admin", "admin");
    }

    public boolean authenticate(String username, String password) {
        if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public void moveDateForward(int daysToAdd) {
        Hospital.getTime().addDay(daysToAdd);
    }
}
