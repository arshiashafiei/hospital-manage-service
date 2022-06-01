package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Prescription {
    private static int prescriptionNumber;
    private LocalDateTime date;
    private ArrayList<Medicine> medicineList;
    private String doctorPersonnelNumber;
    private String patientCaseNumber;

    public Prescription(LocalDateTime date, String doctorPersonnelNumber, String patientCaseNumber) {
        prescriptionNumber++;
        this.date = date;
        this.medicineList = new ArrayList<>();
        this.doctorPersonnelNumber = doctorPersonnelNumber;
        this.patientCaseNumber = patientCaseNumber;
    }

    public static int getPrescriptionNumber() {
        return prescriptionNumber;
    }

    public static void setPrescriptionNumber(int prescriptionNumber) {
        Prescription.prescriptionNumber = prescriptionNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public ArrayList<Medicine> getMedicineList() {
        return this.medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public String getDoctorPersonnelNumber() {
        return this.doctorPersonnelNumber;
    }

    public void setDoctorPersonnelNumber(String doctorPersonnelNumber) {
        this.doctorPersonnelNumber = doctorPersonnelNumber;
    }

    public String getPatientCaseNumber() {
        return this.patientCaseNumber;
    }

    public void setPatientCaseNumber(String patientCaseNumber) {
        this.patientCaseNumber = patientCaseNumber;
    }

}
