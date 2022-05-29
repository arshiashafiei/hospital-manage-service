package Controller;

import Model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class HospitalManager {

    public static boolean authenticate(String username, String password) {
        for (User user : getAllUsers()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static User findUser(String username) {
        for (User user : getAllEmployees()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.addAll(Hospital.getDoctors());
        users.addAll(Hospital.getGuards());
        users.addAll(Hospital.getJanitors());
        users.addAll(Hospital.getPatients());
        users.addAll(Hospital.getSecretaries());
        return users;
    }

    public static ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Hospital.getDoctors());
        employees.addAll(Hospital.getGuards());
        employees.addAll(Hospital.getJanitors());
        employees.addAll(Hospital.getSecretaries());
        return employees;
    }




}
