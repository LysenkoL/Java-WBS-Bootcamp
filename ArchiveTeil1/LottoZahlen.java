/*Aufgabenstellung:

In dieser Aufgabe sollen Sie ein Java-Programm entwickeln, das eine Lottoziehung simuliert. Ziel ist es,
sechs einzigartige Lottozahlen zwischen 1 und 49 zu generieren und diese in der Konsole auszugeben.

Anforderungen:
Importieren der notwendigen Klassen:

Verwenden Sie die Klassen, die für die Arbeit mit Sammlungen und Zufallszahlen erforderlich sind.
Erstellen eines HashSets:

Nutzen Sie ein HashSet, um sicherzustellen, dass die Lottozahlen einzigartig sind.
Zufallszahlen generieren:

Implementieren Sie eine Methode, die sechs einzigartige Zufallszahlen im Bereich von 1 bis 49 generiert.
Ausgabe der Lottozahlen:

Formatieren Sie die Ausgabe der Lottozahlen als durch Kommas getrennte Zeichenkette und geben Sie sie in der Konsole aus.
Dokumentation:

Kommentieren Sie Ihren Code, um die Funktionsweise der verwendeten Datenstrukturen und Algorithmen zu erläutern.
Erweiterung (optional):

Ermöglichen Sie dem Benutzer, die Anzahl der zu ziehenden Lottozahlen und den Zahlenbereich anzupassen.*/


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoZahlen {
    public static void main(String[] args) {

        // Random-Objekt zur Erzeugung von Zufallszahlen
        Random random = new Random();

        // HashSet speichert die Lottozahlen
        // Vorteil: Ein HashSet erlaubt KEINE doppelten Werte
        Set<Integer> Zahlen = new HashSet<>();

        // Scanner für Benutzereingaben über die Konsole
        Scanner scanner = new Scanner(System.in);

        // Variablen für Anzahl der Lottozahlen und Zahlenbereich
        int antwortZahl;
        int antwortBereich;

        // do-while wird verwendet, damit der Benutzer mindestens einmal eingibt
        // Die Eingabe wird wiederholt, SOLANGE der Zahlenbereich zu klein ist
        do {
            System.out.println("Wie viele Zahlen möchten Sie in Lotto haben?");
            antwortZahl = scanner.nextInt();

            System.out.println("Geben Sie den Zahlenbereich für Ihr Lotto ein:");
            antwortBereich = scanner.nextInt();

            // Plausibilitätsprüfung:
            // Der Zahlenbereich darf nicht kleiner sein als die Anzahl der Zahlen,
            // da sonst keine einzigartigen Zahlen möglich sind
            if (antwortBereich < antwortZahl) {
                System.out.println("Bereich kann nicht kleiner als Lottozahl sein");
            }

        } while (antwortBereich < antwortZahl || antwortBereich<=0 || antwortZahl<=0);

        // Generierung der Lottozahlen
        // Solange das Set weniger Zahlen enthält als gewünscht,
        // werden neue Zufallszahlen erzeugt
        while (Zahlen.size() < antwortZahl) {

            // Zufallszahl zwischen 1 und antwortBereich (inklusive)
            int lottoZahl = random.nextInt(antwortBereich) + 1;

            // add() fügt die Zahl nur hinzu,
            // wenn sie noch nicht im HashSet vorhanden ist
            Zahlen.add(lottoZahl);
        }

        // Ausgabe der Lottozahlen ohne Komma am Ende
        int counter = 0;

        // for-each-Schleife durchläuft alle Zahlen im HashSet
        for (int zahl : Zahlen) {
            System.out.print(zahl);
            counter++;

            // Komma nur ausgeben, wenn noch weitere Zahlen folgen
            if (counter < Zahlen.size()) {
                System.out.print(",");
            }
        }

        // Scanner schließen (gute Programmierpraxis)
        scanner.close();
    }
}

