/* Level 1
 * Erstellen Sie eine Klasse 'Fahrzeug' zur Verwaltung Ihres Fuhrparks.
 * Ein Fahrzeug wird gespeichert mit den Attributen 'kennzeichen', 'lackierung',
 * 'marke' und 'fahrzeugTyp'. Mögliche Fahrzeug-Typen sind 'MOTORRAD', 'PKW' und 'LKW'. Diese werden als Enum erstellt.
 * Alle Fahrzeuge werden in einer statischen Liste gespeichert.
 * Ein Konstruktor initialisiert alle Eigenschaften und fügt das gerade erstellte Fahrzeug-Objekt der Liste hinzu.
 * In der Main erstellen Sie drei Fahrzeuge, für jeden Typ eins, und geben alle Eigenschaften in einer Schleife aus.
 */

package aufgabe3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Fahrzeug> fuhrpark = new ArrayList<>();

        Fahrzeug auto1 = new Fahrzeug("L-AB 123", "Schwarz", "BMW", autoTyp.PKW);
        Fahrzeug auto2 = new Fahrzeug("L-XY 555", "Rot", "Audi", autoTyp.MOTORRAD);
        Fahrzeug auto3 = new Fahrzeug("L-ZZ 777", "Blau", "MAN", autoTyp.LKW);

        fuhrpark.add(auto1);
        fuhrpark.add(auto2);
        fuhrpark.add(auto3);

        for (Fahrzeug fahrzeug : fuhrpark) {
            System.out.println(fahrzeug.getKennzeichen() + " "
                    + fahrzeug.getLackierung() + " " + fahrzeug.getMarke() + " " + fahrzeug.getFahrzeugTyp());

        }
        System.out.println(auto1.getKennzeichen());


    }

}
