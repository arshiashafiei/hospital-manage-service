import java.util.ArrayList;

public class DoctorManager {

    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Secretary> secretaries = new ArrayList<>();
    private static ArrayList<Medicine> medicines = new ArrayList<>();

    public void register(String name, String lastName, String password, String specialty) {
        doctors.add(new Doctor(name, lastName, password, specialty));
    }

    public boolean authenticate(String username, String password) {
        for (Doctor doctor : doctors) {
            if (doctor.getPersonnelNumber().equals(username) && doctor.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Secretary> getDoctorSecretaries(String username) {
        ArrayList<Secretary> result = new ArrayList<>();
        for (Secretary secretary : secretaries) {
            if (secretary.getDoctorPersonnelNumber().equals(username)) {
                result.add(secretary);
            }
        }
        return result;
    }

    public void addMedicine(String name, String price, String productionDate, String expiryDate) {
        medicines.add(new Medicine(name, price, productionDate, expiryDate));
    }

    public void addSecretary(String name, String lastName, String doctorPersonnelNumber) {
        secretaries.add(new Secretary(name, lastName, doctorPersonnelNumber));
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> newDoctors) {
        doctors = newDoctors;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }
}
