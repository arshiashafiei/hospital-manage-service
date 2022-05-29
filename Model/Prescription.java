package Model;

import java.util.ArrayList;

public class Prescription {
    private static int prescriptionNumber;
    private String date;
    private ArrayList<Medicine> medicineList;
    private String doctorPersonnelNumber;
    private String patientCaseNumber;

    public Prescription(String date, String doctorPersonnelNumber, String patientCaseNumber) {
        prescriptionNumber++;
        this.date = date;
        this.medicineList = new ArrayList<>();
        this.doctorPersonnelNumber = doctorPersonnelNumber;
        this.patientCaseNumber = patientCaseNumber;
    }

    public int getPrescriptionNumber() {
        return this.prescriptionNumber;
    }

    public void setPrescriptionNumber(int prescriptionNumber) {
        this.prescriptionNumber = prescriptionNumber;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
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
