import java.util.ArrayList;

public class PatientManager {
    
    private ArrayList<Patient> patients;


    public PatientManager() {
        patients = new ArrayList<>();
    }

    public void register(String name, String lastName, String password, String phoneNumber) {
        patients.add(new Patient(name, lastName, password, phoneNumber));
    }

    public boolean authenticate(String username, String password) {
        for (Patient patient : patients) {
            if (patient.getCaseNumber().equals(username) && patient.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Patient> getPatients() {
        return this.patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }


}
