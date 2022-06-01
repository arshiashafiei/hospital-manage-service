package Controller;

import Model.*;

import java.time.LocalDateTime;
import java.time.temporal.WeekFields;
import java.util.ArrayList;

public class PatientManager {
    public boolean register(String firstName, String lastName, String username, String password, String phoneNumber, String email) {
        if (HospitalManager.findUser(username) != null) {
            return false;
        }
        Hospital.getPatients().add(new Patient(firstName, lastName, username, password, phoneNumber, email));
        return true;
    }


    public boolean reserve(String doctorPersonnelNumber, String patientUsername, boolean emergency, LocalDateTime date) {
        Reservation reservation = new Reservation(doctorPersonnelNumber, patientUsername, emergency, date);
        ArrayList<Secretary> secretaries = getDoctorSecretaries(doctorPersonnelNumber);
        if (secretaries.isEmpty() || !isReservedDateFree(date)
                || date.get(WeekFields.SUNDAY_START.weekOfYear()) != Hospital.getTime().getSystemTime().get(WeekFields.SUNDAY_START.weekOfYear())
                || date.isBefore(Hospital.getTime().getSystemTime())) {
            return false;
        }
        getPatientInfo(patientUsername).getReservationList().add(reservation);
        for (Secretary secretary : secretaries) {
            secretary.getReservationList().add(reservation);
        }
        return true;
    }

    public ArrayList<Secretary> getDoctorSecretaries(String personnelNumber) {
        ArrayList<Secretary> doctorSecretaries = new ArrayList<>();
        for (Secretary secretary : Hospital.getSecretaries()) {
            if (secretary.getDoctorPersonnelNumber().equals(personnelNumber)) {
                doctorSecretaries.add(secretary);
            }
        }
        return doctorSecretaries;
    }

    public boolean isReservedDateFree(LocalDateTime startTime) {
        for (Patient patient : Hospital.getPatients()) {
            for (Reservation reservation : patient.getReservationList()) {
                if (!(startTime.isAfter(reservation.getEndDate()) && startTime.plusHours(1).isBefore(reservation.getStartDate()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public Patient getPatientInfo(String username) {
        return ((Patient) HospitalManager.findUser(username));
    }
}
