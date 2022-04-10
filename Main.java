import java.util.Scanner;

public class Main {
    private static PatientPanel patientPanel = new PatientPanel();

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("select 1:");
        String Number = input.nextLine();
        if (Number.equals("1")) {
            // patient panel register view
            patientPanel.signup();
        }
        else if (Number.equals("2")) {
            patientPanel.login();
        }
        menu();
    }

    public static void main(String[] args) {
        menu();
    }

    
}
