package View;

import Controller.*;
import Model.*;

import java.util.Scanner;

public class JanitorPanel {
    private final Scanner input = new Scanner(System.in);

    public void janitorMenu(String janitorUsername) {
        System.out.println("Select a number\n1: Show Reservation\n2: Show medicines\n5: Logout");
        String selection = input.nextLine();
        switch (selection) {
            case "1":
                //showReservations(janitorUsername);
                break;
            case "2":
                //showMedicines();
                break;
            case "5":
                return;
        }
        janitorMenu(janitorUsername);
    }

}
