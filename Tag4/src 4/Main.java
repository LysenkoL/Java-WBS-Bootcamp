import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gangschaltung gangschaltung = Gangschaltung.Drive; // Zuweisung vom Enum-Wert "Parken" in eine Variable
        System.out.println(gangschaltung);

        switch (gangschaltung) {
            case Parken:
                System.out.println("Wir bewegen uns nicht");
                break;
            case Drive:
                System.out.println("Wir fahren mit automatischer Schaltung vorwärts");
                break;
            case Rückwerts:
                System.out.println("Zurück, zurück");
                break;
            default: // Alle anderen Werte. Das brauchen wir nicht, wenn unser Switch "erschöpfend" ist, d.h. alle Fälle abdeckt. Die IDE hilft uns hier.
                System.out.println("Etwas anderes");

        }

        if (gangschaltung == Gangschaltung.Drive) {
            System.out.println("Ja, wir sind in Drive");
        }

        // Ordinal
        System.out.println(gangschaltung);
        System.out.println(gangschaltung.ordinal());

        gangschaltung = Gangschaltung.Drive;
        if (gangschaltung.Manuell()) {
            System.out.println("Ich bin in einem der manuellen Schaltmodi");
        }
        else {
            System.out.println("Momentan kein manueller Schaltmodus");
        }

        // String Werte
        String aktuellerWertAlsString = gangschaltung.toString(); // Konvertierung zu einem String
        System.out.println(aktuellerWertAlsString);
        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();
        if (aktuellerWertAlsString.equals(eingabe)) { // Vergleichen von String mit String (und nicht String mit Enum)
            // Vorsicht: Groß- und Kleinschreibung beachten. (String.toUpperCase() o. String.toLowerCase() können helfen)
            System.out.println("Sie haben den aktuellen Gang gewählt");
        }

        if (Gangschaltung.Drive.name().equals(eingabe)) { // .name() gibt den String-Wert vom Enum wieder
            System.out.println("Wir fahren mit automatischer Schaltung vorwärts");
        }

        Gangschaltung gewählterGang = Gangschaltung.valueOf(eingabe); // andere Richtung: String zu Enum
        System.out.println(gewählterGang.ordinal());

        // Alle Werte
        // .values() gibt alle Enum-Werte aus. Beachte: Als ihren eigenen Datentyp, nicht als String!)
        // Arrays.toString() ist eine statische Funktion aus der Hilfsklasse Arrays, und ruft auf jedem Element des Arrays einzeln die toString Methode auf. (s. Zeile 41)
        System.out.println(Arrays.toString(Gangschaltung.values()));
    }
}