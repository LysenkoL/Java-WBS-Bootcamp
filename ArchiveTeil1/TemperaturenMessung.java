
/*
Ziel: Entwickeln Sie ein Programm in Java, das die Temperaturen in drei Städten
über eine Woche erfasst und die durchschnittlichen Temperaturen berechnet.

Aufgabenbeschreibung:

Datenstruktur: Verwenden Sie ein mehrdimensionales Array,
 wum die Temperaturen für 3 Städte (Stadt A, Stadt B, Stadt C) über 7 Tage zu speichern.

Benutzereingabe:

Lassen Sie den Benutzer die täglichen Temperaturen (in Grad Celsius) für jede Stadt und jeden Tag eingeben.
Berechnung:

Berechnen Sie die durchschnittliche Temperatur für jede Stadt basierend auf den eingegebenen Werten.
Ausgabe:

Geben Sie die durchschnittliche Temperatur jeder Stadt auf dem Bildschirm aus.
Hinweis: Achten Sie darauf, die Temperaturen in der Reihenfolge von Tag 1 bis Tag 7 für jede Stadt einzugeben.
*/

import java.util.Scanner;

public class TemperaturenMessung {

public static double durchschnitt (double [] tempWoche){
    double summe = 0;
    for (int i = 0; i < tempWoche.length; i++) {
        summe = summe + tempWoche[i];
    }
    double durchschnitt = summe / tempWoche.length;
    return durchschnitt;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [][] tempWoche = new double[3][7];
        String [] Staedte = {"Stadt A", "Stadt B", "Stadt C"};


        for (int stadt = 0; stadt < tempWoche.length; stadt++) {
            for (int  tag = 0; tag < tempWoche[stadt].length; tag++) {
                System.out.println("Geben Sie Bitte Temperature für  " + (tag+1) + " Tag");
                double temp = scanner.nextDouble();
                tempWoche[stadt][tag] = temp;
            }
        }

        System.out.println("Durchschnitt für " + Staedte[0] + " ist: " + durchschnitt(tempWoche[0]));
        System.out.println("Durchschnitt für " + Staedte[1] + " ist: " + durchschnitt(tempWoche[1]));
        System.out.println("Durchschnitt für " + Staedte[2] + " ist: " + durchschnitt(tempWoche[2]));

    }
}
