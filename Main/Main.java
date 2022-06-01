package Main;

import Model.*;
import View.Menu;

public class Main {
    public static void main(String[] args) {
        addDummyData();
        Menu menuObject = new Menu();
        menuObject.menu();
    }

    public static void addDummyData() {
        Patient patient1 = new Patient("p1", "1", "user1", "user", "099976263", "saji@s.com");
        Patient patient2 = new Patient("p2", "2", "user2", "user", "099976263", "saji@s.com");
        Patient patient3 = new Patient("p3", "3", "user3", "user", "099976263", "saji@s.com");

        Doctor doctor1 = new Doctor("d1", "1", "doc1", "user", "31", "sdf", 2, 210, "special", "ss");
        Doctor doctor2 = new Doctor("d2", "2", "doc2", "user", "31", "sdf", 1, 10, "special", "ss");

        Secretary secretary1 = new Secretary("s1", "1", "sec1", "user", "12", "asd", 1, 20, "1");
        Secretary secretary2 = new Secretary("s2", "2", "sec2", "user", "12", "asd", 1, 20, "2");

        Janitor janitor1 = new Janitor("s2", "2", "sec2", "user", "12", "asd", 1, 20);
        Guard guard1 = new Guard("s2", "2", "sec2", "user", "12", "asd", 1, 20);

        Hospital.getPatients().add(patient1);
        Hospital.getPatients().add(patient2);
        Hospital.getPatients().add(patient3);

        Hospital.getDoctors().add(doctor1);
        Hospital.getDoctors().add(doctor2);

        Hospital.getSecretaries().add(secretary1);
        Hospital.getSecretaries().add(secretary2);

        Hospital.getJanitors().add(janitor1);
        Hospital.getGuards().add(guard1);
    }

}
