package Model;

import java.util.ArrayList;

public class Secretary extends Employee {
    private String doctorPersonnelNumber;
    private ArrayList<Reservation> dailyReservationList;
    private ArrayList<Reservation> weeklyReservationList;

    public Secretary(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary, String doctorPersonnelNumber) {
        super(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary);
        this.doctorPersonnelNumber = doctorPersonnelNumber;
        this.dailyReservationList = new ArrayList<>();
        this.weeklyReservationList = new ArrayList<>();
    }

    public String getDoctorPersonnelNumber() {
        return doctorPersonnelNumber;
    }

    public void setDoctorPersonnelNumber(String doctorPersonnelNumber) {
        this.doctorPersonnelNumber = doctorPersonnelNumber;
    }

    public ArrayList<Reservation> getDailyReservationList() {
        return dailyReservationList;
    }

    public void setDailyReservationList(ArrayList<Reservation> dailyReservationList) {
        this.dailyReservationList = dailyReservationList;
    }

    public ArrayList<Reservation> getWeeklyReservationList() {
        return weeklyReservationList;
    }

    public void setWeeklyReservationList(ArrayList<Reservation> weeklyReservationList) {
        this.weeklyReservationList = weeklyReservationList;
    }
}
