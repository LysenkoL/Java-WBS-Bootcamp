import java.util.Scanner;

public class BenutzerEingabePruefen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe;

        System.out.println("Bitte geben Sie einen Text ein: ");
        eingabe = scanner.nextLine();

        // Prüfen auf unerlaubte Zeichen (Sicherheits- und Plausibilitätsprüfung)
        // z. B.: @, $, %, <>, &&, {}, [], SQL-Befehle wie DROP oder INSERT usw.

        if (enthaeltUnerlaubteZeichen(eingabe)) {
            System.out.println("Fehler: Die Eingabe enthält unerlaubte Zeichen!");
        } else System.out.println("Alles in Ordnung! " + eingabe + " ist gültig");

        scanner.close();
    }
    // Methode zur Überprüfung auf unerlaubte Zeichen
    private static boolean enthaeltUnerlaubteZeichen(String eingabe) {

        String unerlaubteZeichen = ".,{}()[]<>\""; // Definition einer Zeichenkette mit unerlaubten Zeichen

        for (int i = 0; i < unerlaubteZeichen.length(); i++) {

            char unerlaubtesZeichen = unerlaubteZeichen.charAt(i);
            // Holt sich das aktuelle Zeichen und speichert es
            // in einer verständlichen char Variablen.

            // Überprüft, ob das unerlaubte Zeichen in der Benutzereingabe vorhanden ist
            // indexOf gibt den Index des ersten Vorkommens des Zeichens zurück
            // oder -1 wenn es nicht gefunden wird
            if (eingabe.indexOf(unerlaubtesZeichen) != -1) {
                return true; // Gibt true zurück, da unerlaubtes Zeichen gefunden wurde
            }
        }

        return false; // Gibt false zurück, wenn kein unerlaubtes Zeichen gefunden wird
    }

}

