/* Ziel: Entwickeln Sie ein Programm in Java, das die Noten von Schülern in verschiedenen Fächern erfasst und die Durchschnittsnoten berechnet.

        Aufgabenbeschreibung:

        Datenstruktur:

        Verwenden Sie ein mehrdimensionales Array, um die Noten für 4 Schüler in 5 Fächern zu speichern.
        Benutzereingabe:

        Lassen Sie den Benutzer die Noten für jeden Schüler und jedes Fach eingeben.
        Berechnung:

        Berechnen Sie die Durchschnittsnote für jeden Schüler basierend auf den eingegebenen Noten.
        Ausgabe:

        Geben Sie die Durchschnittsnote jedes Schülers auf dem Bildschirm aus.
        Hinweis:

        Achten Sie darauf, die Noten in der Reihenfolge von Fach 1 bis Fach 5 für jeden Schüler einzugeben.
        */

import java.sql.SQLOutput;
import java.util.Scanner;

public class SchulNote {

    public static double durchschnitt (int[]noten){
        double summe = 0;
        for (int i = 0; i < noten.length; i++) {
            summe = summe + noten[i];
        }
        double durchschnitt = summe / noten.length;
        return durchschnitt;
    }

    public static double fachDurchschnitt (int[][] noten, int fachIndex){
        double summe = 0;
        for (int schuler = 0; schuler < noten.length; schuler++) {
            {
               summe = summe + noten[schuler][fachIndex];
            }
        }
        double durchschnitt = summe / noten.length;
        return durchschnitt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] noten = new int[4][5];
        String [] faecher = {"Bio", "Mathe", "Deutsch", "Englisch", "Jura" };

        for (int schuler = 0; schuler < noten.length; schuler++) {
            System.out.println("Geben Sie die Note für " + (schuler+1) + ". Schüler ein");

            for (int fach = 0; fach < noten[schuler].length; fach++) {
                System.out.printf("In Fach " + faecher[fach]);
                System.out.println();
                int note = scanner.nextInt();
                noten[schuler][fach] = note;
            }
            System.out.println();
        }
        for (int i = 0; i < noten.length; i++) {

            System.out.printf("Durchschnitt für Schüler %d. ist %.2f", (i+1), durchschnitt (noten[i]));
            System.out.println();
        }

        System.out.println("Geben Sie Fachnummer um Durchschnittenote zu sehen ");
        System.out.println("1 für Bio, 2 für Mathe, 3 für Deutsch, 4 für Englisch, 5 für Jura");
        int wahl = scanner.nextInt();

        System.out.printf("Durchschnitt für %s ist %.2f", faecher[wahl-1], fachDurchschnitt(noten, wahl-1));

    }
}



/*
<b>Christiane Kühl</b>
import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array für 4 Schüler und 5 Fächer
        double[][] noten = new double[4][5];
        String[] schueler = {"Schüler 1", "Schüler 2", "Schüler 3", "Schüler 4"};

        // Noten einlesen
        System.out.println("=== Notenerfassung ===\n");

        for (int s = 0; s < noten.length; s++) {                    // Äußere Schleife für Schüler s
            System.out.println("Eingabe für " + schueler[s] + ":");

            for (int f = 0; f < noten[s].length; f++) {             // Innere Schleife für Fach f
                System.out.print("  Fach " + (f + 1) + ": ");
                noten[s][f] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Durchschnittsnoten berechnen und ausgeben
        System.out.println("\n=== Durchschnittsnoten ===\n");

        for (int s = 0; s < noten.length; s++) {
            double summe = 0.0;

            for (int f = 0; f < noten[s].length; f++) {
                summe = summe + noten[s][f];
            }

            double durchschnitt = summe / noten[s].length;

            System.out.printf("%s: %.2f\n", schueler[s], durchschnitt);
        }

        scanner.close();
    }
}
 */