package aufgabe0;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean eingabeerfolg = false;
        while (eingabeerfolg == false) {
            try {
                System.out.println("Geben Sie eine Antwort: " + Arrays.toString(Menu.values()));
                String antwortAlsString = scan.nextLine().toUpperCase();
                Menu antwortAlsMenu = Menu.valueOf(antwortAlsString);
                eingabeerfolg = true;

                switch (antwortAlsMenu) {
                    case JA:
                        System.out.println("Sie haben Ja gewählt");
                        break;
                    case NEIN:
                        System.out.println("Sie haben Nein gewählt");
                        break;
                    case VIELLEICHT:
                        System.out.println("Sie haben Vielleicht gewählt");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Fehler");
            }
        }
    }
}
