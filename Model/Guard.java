package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Guard extends Employee {
    private static ArrayList<LocalDateTime> personnelDailyArrivalTime;
    private static ArrayList<LocalDateTime> personnelDailyExitTime;
    private static ArrayList<LocalDateTime> personnelWeeklyArrivalTime;
    private static ArrayList<LocalDateTime> personnelWeeklyExitTime;

    public Guard(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary) {
        super(firstName, lastName, username, password, phoneNumber, email, hoursToWorkInDay, salary);
    }

    public static ArrayList<LocalDateTime> getPersonnelDailyArrivalTime() {
        return personnelDailyArrivalTime;
    }

    public static void setPersonnelDailyArrivalTime(ArrayList<LocalDateTime> personnelDailyArrivalTime) {
        Guard.personnelDailyArrivalTime = personnelDailyArrivalTime;
    }

    public static ArrayList<LocalDateTime> getPersonnelDailyExitTime() {
        return personnelDailyExitTime;
    }

    public static void setPersonnelDailyExitTime(ArrayList<LocalDateTime> personnelDailyExitTime) {
        Guard.personnelDailyExitTime = personnelDailyExitTime;
    }

    public static ArrayList<LocalDateTime> getPersonnelWeeklyArrivalTime() {
        return personnelWeeklyArrivalTime;
    }

    public static void setPersonnelWeeklyArrivalTime(ArrayList<LocalDateTime> personnelWeeklyArrivalTime) {
        Guard.personnelWeeklyArrivalTime = personnelWeeklyArrivalTime;
    }

    public static ArrayList<LocalDateTime> getPersonnelWeeklyExitTime() {
        return personnelWeeklyExitTime;
    }

    public static void setPersonnelWeeklyExitTime(ArrayList<LocalDateTime> personnelWeeklyExitTime) {
        Guard.personnelWeeklyExitTime = personnelWeeklyExitTime;
    }
}
