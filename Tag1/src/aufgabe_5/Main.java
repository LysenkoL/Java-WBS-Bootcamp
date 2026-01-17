/* Level 2

Sie sollen ein Programm schreiben, das die Temperaturen einer Woche aufzeichnet und analysiert.
Jede Temperatur wird als Objekt der Klasse TemperatureRecord gespeichert.

Anforderungen:

    Klasse TemperatureRecord:
        Erstellen Sie eine Klasse TemperatureRecord mit den folgenden Attributen:
            String day: Der Tag der Woche (z.B. "Montag", "Dienstag", etc.).
            double temperature: Die aufgezeichnete Temperatur für diesen Tag.
            String unit: Die Maßeinheit, z.B. Celsius, Kelvin oder Fahrenheit.
        Beim Erzeugen der Objekte werden Tag und Temperatur über die Setter festgelegt.

    Temperaturarray:
        Erstellen Sie ein eindimensionales Array TemperatureRecord[] mit einer Größe von 7,
        um die Temperaturen für eine Woche zu speichern.

    Initialisierung:
        Füllen Sie das Array mit Temperaturdaten für jeden Tag der Woche. Sie können dabei fiktive Werte verwenden.

    Min/Max-Suche:
        Implementieren Sie eine Methode findMinAndMaxTemperature(TemperatureRecord[] records), die die minimale
         und maximale Temperatur der Woche findet und die entsprechenden Tage ausgibt.

Erwartete Ausgabe (Beispiel):
Die niedrigste Temperatur war am Donnerstag mit 15.5 Grad Celsius.
Die höchste Temperatur war am Montag mit 28.3 Grad Celsius.
*/

package aufgabe_5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TemperatureRecord [] arrTemp = new TemperatureRecord[7];

        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = new TemperatureRecord();
            String [] woche = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
            arrTemp[i].setDay(woche[i]);
            System.out.println("Gebben Sie die Temperature für " + woche[i] + " ein: ");
            arrTemp[i].setTemperature(sc.nextDouble());
        }

        TemperatureRecord.findMinAndMaxTemperature (arrTemp);

        sc.close();
    }
}