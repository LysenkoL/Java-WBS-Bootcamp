import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetBeispiel {
    public static void main(String[] args ){
        // HashSet erstellen das Integer-Werte speichert
        // Dieses Set wird verwendet, um einzigartige Zahlen zu speichern
        Set<Integer> zahlenSet = new HashSet<>();

        zahlenSet.add(10);
        zahlenSet.add(20);
        zahlenSet.add(30);
        zahlenSet.add(40);
        zahlenSet.add(50);

        // Versucht ein Dublikat hinzuzufügen
        zahlenSet.add(10); // Die Zahl 10 wird nicht hinzugefügt, da sie bereits vorhanden ist.

        System.out.println("Zahlen im Set: " + zahlenSet); // Das hashSet könnte so intern gespeichert
        // sein [50, 20, 40, 10, 30], reinhenfolge kann variiren
        // weil Set und HashSet keine feste reihenfolge hat

        if(zahlenSet.contains(30)){
            System.out.println("Die zahl 30 ist im Set vorhanden.");
        } else {
            System.out.println("Die zahl 30 ist nicht im Set vorhanden.");
        }
        System.out.println(zahlenSet.size());

        // Entfernen einer Zahl
        zahlenSet.remove(20);
        System.out.println(zahlenSet);

        // HashSet leeren
        zahlenSet.clear();
        System.out.println(zahlenSet.isEmpty());

        // Eindeutige Elemente: Verwenden von HashSet wenn du sicherstellen möchtest dass alle Elemente einzigartig sind.
        // Beispeil: Verwalten von Benutzer-IDs oder Produktnummern ohne Dublikate
        /* Schneller Zugriff: HashSet bietet 0(1) für Hinzufügen, Entfernen und Überprüfen von Elementen.
        Operation konstant ist und unaghängig von der Größe der Datenstruktur bliebt, sodass die zeit für das hinzufügen,
        Enfernen oder Prüfen eines Elements gleich bleibt, egal wie viel elemente sich in der Sammlung befinden.
        Ungeordnete Sammlung: HashSet speichert Elemente ohne eine beistimmte Reihenfolge. Schneller Zugriff:
         HashSet bietet O(1) für Hinzufügen, Entfernen und Überprüfen von Elementen.
           Der Wert O(1) ist einen Notation aus der Informatik, die beschreibt, dass die Zeitkomplexität einer
           Operation konstant ist und unabhängig von der Größe der Datenstruktur bleibt, sodass die Zeit für
           das hinzufüge, Entfernen oder Prüfen eines Elements gleich bleibt, egal wie viel Elemente sich in
           der Sammlung befinden.
           Ungeordnete Sammlung: HashSet speichert Elemente ohne eine bestimmte Reihenfolge
         */
        // Ein HashSet speichert Elemente ohne Duplikate und in keiner bestimmten Reihenfolge
        // Warum HashSet verwenden?
        /*
         * 1. Schnelle Suche, ermöglicht eine schnelle Überprüfung ob ein Element vorhanden ist.
         * 2. Keine Dublikate: speichert nur eindeutige Elemente, was nützlich ist, wenn Dublikate vermieden werden sollen.
         * 3. Ungeordnete Sammlung: Wenn die Reihenfolge der Elemente nicht wichtig ist.
         */
        HashSet<String> set = new HashSet<>();
        set.add("Apfel");
        set.add("Banane");
        set.add("Orange");
        set.add("Apfel"); // Das Element "Apfel" wird ignoriert beim hinzufügen da HashSet keine Dublikate zulässt.

        // Der Inhalt kann bei der Ausgabe variieren da es keine bestimmte Reihenfolge im HashSet gibt
        System.out.println("Inhalt des HashSet: ");
        Object[] fruchtArray = set.toArray();
        for (int i = 0; i < fruchtArray.length; i++) {
            System.out.println(fruchtArray[i]);
        }
        //Überprüft ob eine bestimmte Elemente vorhanden ist
        if (set.contains("Banane")){
            System.out.println("Das HS enthält die Banane");
        }
        else System.out.println("Das HS enthält keine Banane");

        //Entfernen eine Elementes
        set.remove("Orange");

        //Große HashSet
        System.out.println("Die Große HS: " + set.size());
    }
}