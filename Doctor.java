public class Doctor {
    private String name;
    private String lastName;
    private String password;
    private String personnelNumber;
    private String specialty;
    private static int doctorCount;

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", password='" + getPassword() + "'" +
                ", personnelNumber='" + getPersonnelNumber() + "'" +
                ", specialty='" + getSpecialty() + "'" +
                "}";
    }

    public Doctor(String name, String lastName, String password, String specialty) {
        doctorCount++;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.personnelNumber = Integer.toString(doctorCount);
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(String personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
