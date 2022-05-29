package Model;

import Main.Time;

import java.util.ArrayList;

public class Hospital {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Janitor> janitors = new ArrayList<>();
    private static ArrayList<Guard> guards = new ArrayList<>();
    private static ArrayList<Secretary> secretaries = new ArrayList<>();
    private static ArrayList<Medicine> medicines = new ArrayList<>();
    private static Time time = new Time();


    public static ArrayList<Patient> getPatients() {
        return patients;
    }

    public static void setPatients(ArrayList<Patient> patients) {
        Hospital.patients = patients;
    }

    public static ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public static void setDoctors(ArrayList<Doctor> doctors) {
        Hospital.doctors = doctors;
    }

    public static ArrayList<Janitor> getJanitors() {
        return janitors;
    }

    public static void setJanitors(ArrayList<Janitor> janitors) {
        Hospital.janitors = janitors;
    }

    public static ArrayList<Guard> getGuards() {
        return guards;
    }

    public static void setGuards(ArrayList<Guard> guards) {
        Hospital.guards = guards;
    }

    public static ArrayList<Secretary> getSecretaries() {
        return secretaries;
    }

    public static void setSecretaries(ArrayList<Secretary> secretaries) {
        Hospital.secretaries = secretaries;
    }

    public static ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public static void setMedicines(ArrayList<Medicine> medicines) {
        Hospital.medicines = medicines;
    }

    public static Time getTime() {
        return time;
    }

    public static void setTime(Time time) {
        Hospital.time = time;
    }
}
