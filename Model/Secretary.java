package Model;

import java.util.ArrayList;

public class Secretary extends Employee {
    private String doctorPersonnelNumber;
    private ArrayList<Reservation> reservationList;

    public Secretary(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary, String doctorPersonnelNumber) {
        super(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary);
        this.doctorPersonnelNumber = doctorPersonnelNumber;
        this.reservationList = new ArrayList<>();
    }

    public String getDoctorPersonnelNumber() {
        return doctorPersonnelNumber;
    }

    public void setDoctorPersonnelNumber(String doctorPersonnelNumber) {
        this.doctorPersonnelNumber = doctorPersonnelNumber;
    }

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }


}
