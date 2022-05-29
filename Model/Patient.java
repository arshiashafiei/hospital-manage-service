package Model;

import java.util.ArrayList;

public class Patient extends User {
    private ArrayList<Prescription> prescriptionList;
    private ArrayList<Reservation> reservationList;


    public Patient(String firstName, String lastName, String username, String password, String phoneNumber, String email) {
        super(firstName, lastName, username, password, phoneNumber, email);
        this.prescriptionList = new ArrayList<>();
        this.reservationList = new ArrayList<>();
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
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
}
