import java.util.ArrayList;

public class PatientManager {

    private static ArrayList<Patient> patients = new ArrayList<>();

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

    public Patient getPatientInfo(String username) {
        for (Patient patient : patients) {
            if (patient.getCaseNumber().equals(username)) {
                return patient;
            }
        }
        return null;
    }

    public boolean reserve(String doctorUsername, String patientUsername) {
        Reservation reservation = new Reservation(doctorUsername, patientUsername);
        DoctorManager doctorManager = new DoctorManager();
        ArrayList<Secretary> secretaries = doctorManager.getDoctorSecretaries(doctorUsername);
        if (secretaries.isEmpty()) {
            return false;
        }
        getPatientInfo(patientUsername).getReservationList().add(reservation);
        for (Secretary secretary : secretaries) {
            secretary.getReservationList().add(reservation);
        }
        return true;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> newPatients) {
        patients = newPatients;
    }

}
