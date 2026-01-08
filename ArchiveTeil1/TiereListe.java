import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TiereListe {

    // static bedeutet:
    // Diese Methode gehört zur Klasse selbst und NICHT zu einem Objekt.
    // Deshalb kann sie direkt aus der static main-Methode aufgerufen werden.
    // Ohne static müsste zuerst ein Objekt der Klasse TiereListe erzeugt werden.
    public static int zahlTiere(ArrayList<String> liste) {
        // size() gibt die Anzahl der Elemente in der Liste zurück
        return liste.size();
    }

    // Die main-Methode ist immer static,
    // weil das Programm ohne ein Objekt gestartet wird
    public static void main(String[] args) {

        // Erstellen einer ArrayList zur Speicherung der Tiernamen
        ArrayList<String> tiere = new ArrayList<String>();

        // Hinzufügen von fünf Tieren zur Liste
        tiere.add("Hund");
        tiere.add("Katze");
        tiere.add("Vogel");
        tiere.add("Fisch");
        tiere.add("Maus");

        // Ausgabe der ursprünglichen Liste
        System.out.println(tiere);

        // Aufruf der static Methode zahlTiere
        System.out.println("Anzahl der Tiere " + zahlTiere(tiere));

        // Hinzufügen eines weiteren Tieres
        tiere.add("Schlange");

        // Entfernen des Tieres "Fisch"
        tiere.remove("Fisch");

        // Ausgabe der aktualisierten Liste
        System.out.println(tiere);

        // Iteration über die Liste mit einer for-Schleife
        // Hier wird jedes Element der Liste einzeln ausgegeben
        for (int i = 0; i < tiere.size(); i++) {
            System.out.println(tiere.get(i));
        }

        // Sortieren der Liste in alphabetischer Reihenfolge
        Collections.sort(tiere);

        // Ausgabe der sortierten Liste
        System.out.println(tiere);

        // Abfrage nach einem Tier, das gesucht werden soll
        System.out.println("Nach welchem Tier suchen Sie? Geben Sie den Namen ein:");

        Scanner scan = new Scanner(System.in);
        String suche = scan.nextLine();

        // Boolean-Variable als Merker,
        // ob das gesuchte Tier in der Liste gefunden wurde
        boolean flag = false;

        // Suche nach dem Tier in der Liste:
        // Hier wird die Suche manuell mit einer for-Schleife und equals() durchgeführt.
        // Jedes Element der ArrayList wird einzeln mit der Benutzereingabe verglichen.
        // Die boolean-Variable flag merkt sich, ob das gesuchte Tier gefunden wurde.
        //
        // Alternative (kürzer):
        // boolean flag = tiere.contains(suche);
        // contains() übernimmt intern die gleiche Suche (for + equals),
        // liefert true oder false zurück und erspart die manuelle Schleife.

        for (int i = 0; i < tiere.size(); i++) {

            // Vergleich jedes Elements der Liste mit der Benutzereingabe
            if (tiere.get(i).equals(suche)) {
                System.out.println("In der Liste wird das Tier " + suche + " gefunden");

                        flag = true; // Tier wurde gefunden
            }
        }

        // Wenn nach der Schleife flag immer noch false ist,
        // dann existiert das Tier nicht in der Liste
        if (flag == false) {
            System.out.println("In der Liste gibt es keine " + suche);
        }

        // Scanner schließen (gute Programmierpraxis)
        scan.close();
    }
}
