/*
Ziel: Entwickeln Sie ein Programm in Java, das die Verkaufszahlen von Produkten in verschiedenen Regionen erfasst und die Gesamtverkäufe berechnet.

Aufgabenbeschreibung:

Datenstruktur:

Verwenden Sie ein mehrdimensionales Array, um die Verkaufszahlen für 3 Produkte (Produkt A, Produkt B, Produkt C) in 4 Regionen zu speichern.
Benutzereingabe:

Lassen Sie den Benutzer die Verkaufszahlen für jedes Produkt in jeder Region eingeben.
Berechnung:

Berechnen Sie die Gesamtverkäufe für jedes Produkt basierend auf den eingegebenen Verkaufszahlen.
Ausgabe:

Geben Sie die Gesamtverkäufe jedes Produkts auf dem Bildschirm aus.
Hinweis:

Achten Sie darauf, die Verkaufszahlen in der Reihenfolge von Region 1 bis Region 4 für jedes Produkt einzugeben.
 */

import java.util.Scanner;

public class Verkaufszahlen {

    public static double gesamtverkaufeProdukt (double[]verkaufsZahlen) {
        double summe = 0;
        for (int i = 0; i < verkaufsZahlen.length; i++) {
            summe = summe + verkaufsZahlen[i];
        }
        return summe;
    }

    public static double gesamtRegion(double [][] verkaufsZahlen, int regionIndex){
        double summe = 0;
        for (int i = 0; i < verkaufsZahlen.length; i++) {
            summe = summe + verkaufsZahlen[i][regionIndex];
        }
        return summe;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [][] verkaufsZahlen = new double[3][4];
        String [] produkt = {"Produkt A", "Produkt B", "Produkt C"};
        String [] region = {"Region 1", "Region 2", "Region 3", "Region 4"};

        for (int i = 0; i < verkaufsZahlen.length; i++) {
            for (int j = 0; j < verkaufsZahlen[i].length; j++) {
                System.out.printf("Geben Sie bitte Verkaufszahl für %s in %s ein:%n", produkt[i], region[j]);
                double zahl = scanner.nextDouble();
                verkaufsZahlen[i][j]=zahl;
            }
            System.out.println();
        }

        for (int i = 0; i <verkaufsZahlen.length; i++) {
        System.out.printf("Gesamtverkäufe für %s ist %.2f Euro %n",produkt[i], gesamtverkaufeProdukt(verkaufsZahlen[i]));
        }
        int wahl;
        do {
            System.out.println("Geben Sie Regionnummer um Gesamtverkaufe zu sehen ");
            System.out.println("1 für Region 1, 2 für Region 2, 3 für Region 3, 4 für Region 4");
            wahl = scanner.nextInt();

                if (wahl >= 1 && wahl <= 4) {
                    System.out.printf("Gesamtwert für %s ist %.2f%n", region[wahl - 1], gesamtRegion(verkaufsZahlen, wahl - 1));
                } else {
                    System.out.println("Ungültige Eingabe! Bitte 1-4 eingeben.");
                }
            } while (wahl < 1 || wahl>4);

        scanner.close();
    }
}



/*
<b>Christiane Kühl</b>
import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array für 3 Produkte und 4 Regionen
        int[][] verkaufszahlen = new int[3][4];
        String[] produkte = {"Produkt A", "Produkt B", "Produkt C"};

        // Verkaufszahlen einlesen
        System.out.println("=== Verkaufszahlen erfassen ===\n");

        for (int p = 0; p < verkaufszahlen.length; p++) { // Schleife für Produkt p
            System.out.println("Eingabe für " + produkte[p] + ":");

            for (int r = 0; r < verkaufszahlen[p].length; r++) {  // Schleife für Region r
                System.out.print("  Region " + (r + 1) + ": ");
                verkaufszahlen[p][r] = scanner.nextInt();
            }
            System.out.println();
        }

        // Gesamtverkäufe berechnen und ausgeben
        System.out.println("\n=== Gesamtverkäufe ===\n");

        for (int p = 0; p < verkaufszahlen.length; p++) {
            int summe = 0;

            for (int r = 0; r < verkaufszahlen[p].length; r++) {
                summe += verkaufszahlen[p][r];
            }

            System.out.printf("%s: %d Einheiten\n", produkte[p], summe);
        }

        scanner.close();
    }
}
 */