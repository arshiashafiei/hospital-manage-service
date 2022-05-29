package Model;

import java.util.ArrayList;

public class Janitor extends Employee {
    private ArrayList<String> problems;

    public Janitor(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary) {
        super(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary);
        this.problems = new ArrayList<>();
    }

    public ArrayList<String> getProblems() {
        return problems;
    }

    public void setProblems(ArrayList<String> problems) {
        this.problems = problems;
    }
}
