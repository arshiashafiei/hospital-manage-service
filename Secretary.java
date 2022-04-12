import java.util.ArrayList;

public class Secretary {
    private String name;
    private String lastName;
    private String personnelNumber;
    private String doctorPersonnelNumber;
    private static int SecretaryCount;
    private ArrayList<Reservation> reservationList;

    public Secretary(String name, String lastName, String doctorPersonnelNumber) {
        SecretaryCount++;
        this.name = name;
        this.lastName = lastName;
        this.personnelNumber = Integer.toString(SecretaryCount);
        ;
        this.doctorPersonnelNumber = doctorPersonnelNumber;
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

    public String getPersonnelNumber() {
        return this.personnelNumber;
    }

    public void setPersonnelNumber(String personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getDoctorPersonnelNumber() {
        return this.doctorPersonnelNumber;
    }

    public void setDoctorPersonnelNumber(String doctorPersonnelNumber) {
        this.doctorPersonnelNumber = doctorPersonnelNumber;
    }

    public ArrayList<Reservation> getReservationList() {
        return this.reservationList;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

}
