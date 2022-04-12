public class Reservation {
    private static int reserveNumber;
    private String date = "2022 April 14, 14:00";
    private String doctorPersonnelNumber;
    private String patientCaseNumber;


    @Override
    public String toString() {
        return "{" +
            " date='" + getDate() + "'" +
            ", doctorPersonnelNumber='" + getDoctorPersonnelNumber() + "'" +
            ", patientCaseNumber='" + getPatientCaseNumber() + "'" +
            "}";
    }


    public Reservation(String doctorPersonnelNumber, String patientCaseNumber) {
        reserveNumber++;
        this.doctorPersonnelNumber = doctorPersonnelNumber;
        this.patientCaseNumber = patientCaseNumber;
    }

    public int getReserveNumber() {
        return reserveNumber;
    }

    public void setReserveNumber(int newReserveNumber) {
        reserveNumber = newReserveNumber;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
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
