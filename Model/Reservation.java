package Model;

import java.time.LocalDateTime;

public class Reservation {
    private static int reserveCounter;
    private final int reserveNumber;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String doctorPersonnelNumber;
    private String patientCaseNumber;
    private boolean emergency;


    @Override
    public String toString() {
        return "{" +
            " date='" + getStartDate() + "'" +
            ", doctorPersonnelNumber='" + getDoctorPersonnelNumber() + "'" +
            ", patientCaseNumber='" + getPatientCaseNumber() + "'" +
            "}";
    }


    public Reservation(String doctorPersonnelNumber, String patientCaseNumber, boolean emergency, LocalDateTime startDate) {
        reserveCounter++;
        this.reserveNumber = reserveCounter;
        this.startDate = startDate;
        this.endDate = startDate.plusHours(1);
        this.doctorPersonnelNumber = doctorPersonnelNumber;
        this.patientCaseNumber = patientCaseNumber;
        this.emergency = emergency;
    }

    public static int getReserveCounter() {
        return reserveCounter;
    }

    public static void setReserveCounter(int reserveCounter) {
        Reservation.reserveCounter = reserveCounter;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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


    public boolean isEmergency() {
        return this.emergency;
    }

    public void setEmergency(boolean emergency) {
        this.emergency = emergency;
    }

    public int getReserveNumber() {
        return reserveNumber;
    }
}
