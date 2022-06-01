package Controller;

import Model.Hospital;
import Model.Patient;
import Model.Reservation;
import Model.Secretary;

import java.util.ArrayList;
import java.util.Collections;

public class SecretaryManager {

    public void sortReservations(ArrayList<Reservation> reservationsToSort) {
        Collections.sort(reservationsToSort);

    }

    public Secretary getSecretaryInfo(String username) {
        return ((Secretary) HospitalManager.findUser(username));
    }

    public ArrayList<Reservation> getTodayReservations(ArrayList<Reservation> reservations) {
        ArrayList<Reservation> result = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (Hospital.getTime().getSystemTime().getDayOfYear() == reservation.getStartDate().getDayOfYear()) {
                result.add(reservation);
            }
        }
        return result;
    }


}
