package Model;

public abstract class Employee extends User {
    private static int employeeCounter;
    private final int personnelNumber;
    private double workHoursInMonth;
    private int daysAtWork;
    private double hoursToWorkInDay;
    private double salary;
    private int absentDays;
    private boolean banned;


    public Employee(String firstName, String lastName, String username, String password, String phoneNumber, String email, double hoursToWorkInDay, double salary) {
        super(firstName, lastName, username, password, phoneNumber, email);
        employeeCounter++;
        this.personnelNumber = employeeCounter;
        this.workHoursInMonth = 0;
        this.daysAtWork = 0;
        this.hoursToWorkInDay = hoursToWorkInDay;
        this.salary = salary;
        this.absentDays = 0;
        this.banned = false;
    }

    public double getWorkHoursInMonth() {
        return this.workHoursInMonth;
    }

    public void setWorkHoursInMonth(double workHoursInMonth) {
        this.workHoursInMonth = workHoursInMonth;
    }

    public int getDaysAtWork() {
        return this.daysAtWork;
    }

    public void setDaysAtWork(int daysAtWork) {
        this.daysAtWork = daysAtWork;
    }

    public double getHoursToWorkInDay() {
        return this.hoursToWorkInDay;
    }

    public void setHoursToWorkInDay(double hoursToWorkInDay) {
        this.hoursToWorkInDay = hoursToWorkInDay;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAbsentDays() {
        return this.absentDays;
    }

    public void setAbsentDays(int absentDays) {
        this.absentDays = absentDays;
    }

    public static int getEmployeeCounter() {
        return employeeCounter;
    }

    public static void setEmployeeCounter(int employeeCounter) {
        Employee.employeeCounter = employeeCounter;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }
}

