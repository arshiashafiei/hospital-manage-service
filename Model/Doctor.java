package Model;

public class Doctor extends Employee {
    private final String specialty;
    private String biography;

    public Doctor(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary, String specialty, String biography) {
        super(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary);
        this.specialty = specialty;
        this.biography = biography;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
