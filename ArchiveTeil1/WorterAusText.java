import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WorterAusText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> text = new HashSet<String>();

        System.out.println("Bitte geben Sie einen Text ein. Um Programm zu beenden schreiben Sie exit!");

            while (true) {
            String wort = sc.next();
            wort = wort.toLowerCase();
            if (wort.equals("exit")) break;
            text.add(wort);
        }

        System.out.printf("Ingesamt haben Sie " + text.size() + " verschiedene Wörter eingegeben!");

        sc.close();
    }
}



/*  CHRIS
    Aufgabe 3: Wörter zählen
    Entwickeln Sie ein Programm, das einen Satz von Benutzern einliest. Zerlegen Sie den Satz in Wörter und speichern
    Sie diese in einem Set. Geben Sie die Anzahl der einzigartigen Wörter im Satz aus. Berücksichtigen Sie dabei
    Groß- und Kleinschreibung als gleich, indem Sie alle Wörter in Kleinbuchstaben umwandeln,
    bevor Sie sie zum Set hinzufügen.


        import java.util.HashSet;
        import java.util.Scanner;
        import java.util.Set;

public class Aufgabe3 {
    public static void main(String[] args){
        // Scanner hinzufügen für Benutzereingaben
        Scanner scanner = new Scanner(System.in);

        // Hashset, weil das Stichwort einzigartig war
        Set<String> woerter = new HashSet<String>();

        // Benutzereingabeaufforderung
        System.out.println("Gebe bitte einen Satz ein: ");
        String satz = scanner.nextLine();

        // Satz in der Wörter zerlegen mittels leerzeichen
        String[] woerterArray = satz.split(" ");

        // Wörter umwandeln
        for (int i = 0; i < woerterArray.length; i++) {
            String wort = woerterArray[i].toLowerCase();
            woerter.add(wort);
        }

        // ausgabe wortanzahl
        System.out.println("Anzahl der einzigartigen Wörter ist: " + woerter.size());

        System.out.println("\nEinzigartige Wörter: ");
        for (String wort : woerter) {
            System.out.println("\t- " + wort);
        }

        // Scanner schließen
        scanner.close();    }
}
 */
