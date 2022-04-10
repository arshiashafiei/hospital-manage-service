import java.util.ArrayList;

public class Patient {
    private String name;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String caseNumber;
    private ArrayList<Prescription> prescriptionList;
    private ArrayList<Reservation> reservationList;
    private static int patientCount;


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", password='" + getPassword() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", caseNumber='" + getCaseNumber() + "'" +
            ", prescriptionList='" + getPrescriptionList() + "'" +
            ", reservationList='" + getReservationList() + "'" +
            "}";
    }

    public Patient(String name, String lastName, String password, String phoneNumber) {
        patientCount++;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.caseNumber = Integer.toString(patientCount);
        this.prescriptionList = new ArrayList<>();
        this.reservationList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCaseNumber() {
        return this.caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return this.prescriptionList;
    }

    public void setPrescriptionList(ArrayList<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public ArrayList<Reservation> getReservationList() {
        return this.reservationList;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
    
    public static int getPatientCount(){
        return patientCount;
    }
    
    public static void setPatientCount(int newPatientCount){
        patientCount = newPatientCount;
    }
}
