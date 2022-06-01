package View;

import java.util.Scanner;

public class GuardPanel {
    private final Scanner input = new Scanner(System.in);

    public void guardMenu(String guardUsername) {
        System.out.println("Select a number\n1: Show Reservation\n2: Show medicines\n5: Logout");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                //showReservations(guardUsername);
                break;
            case "2":
                //showMedicines();
                break;
            case "5":
                return;
        }
        guardMenu(guardUsername);
    }
}
