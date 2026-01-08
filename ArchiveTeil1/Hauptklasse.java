/*
Vorgehensweise zur Erstellung des To-Do-Listen-Programms:

1. **Projekt erstellen**:
   - Erstelle ein neues Java-Projekt in deiner bevorzugten Entwicklungsumgebung.

2. **Klasse ToDoElement erstellen**:
   - Erstelle eine neue Java-Klasse mit dem Namen `ToDoElement`.
   - Füge die Attribute und Methoden hinzu, um eine Aufgabe zu speichern und darzustellen:
     - Konstruktor für die Aufgabe.
     - Getter- und Setter-Methoden für die Aufgabe.
     - Überschreibe die `toString()`-Methode.

3. **Klasse ToDoListe erstellen**:
   - Erstelle eine neue Java-Klasse mit dem Namen `ToDoListe`.
   - Füge eine Liste zur Speicherung von `ToDoElement`-Objekten hinzu.
   - Implementiere Methoden zum Hinzufügen, Entfernen, Ändern und Speichern von Aufgaben:
     - `fuegeElementHinzu(String aufgabe)`.
     - `entferneElement(int index)`.
     - `entferneAlleElemente()`.
     - `entferneMehrereElemente(List<Integer> indizes)`.
     - `aendereElement(int index, String neueAufgabe)`.
     - `speichere()` zur Speicherung in einer Datei.
     - `lade()` zum Laden von Aufgaben aus einer Datei.

4. **Hauptklasse erstellen**:
   - Erstelle eine neue Java-Klasse mit dem Namen `Hauptklasse`.
   - Implementiere die Hauptlogik des Programms in der `main`-Methode:
     - Erstelle eine Instanz von `ToDoListe`.
     - Implementiere eine Endlosschleife, um Benutzerinteraktionen zu ermöglichen.
     - Zeige die aktuelle To-Do-Liste an.
     - Implementiere die Auswahlmöglichkeiten für den Benutzer (Aufgabe hinzufügen, löschen, ändern, etc.).
     - Verwende `switch`-Anweisungen zur Verarbeitung der Benutzereingaben.

5. **Benutzereingaben verarbeiten**:
   - Verwende `Scanner`, um Benutzereingaben zu lesen.
   - Validierung der Eingaben, um sicherzustellen, dass sie korrekt sind.

6. **Dateioperationen implementieren**:
   - Implementiere die Dateioperationen in der `ToDoListe`-Klasse:
     - Verwende `BufferedWriter` und `BufferedReader` für das Schreiben und Lesen von Aufgaben in der Datei `todo.txt`.

7. **Testen des Programms**:
   - Führe das Programm aus und teste alle Funktionen (Hinzufügen, Löschen, Ändern, etc.).
   - Stelle sicher, dass die Aufgaben korrekt gespeichert und geladen werden.

8. **Dokumentation und Kommentare**:
   - Füge Kommentare im Code hinzu, um die Funktionsweise zu erklären.
   - Dokumentiere die Schritte zur Verwendung des Programms.

9. **Verabschiedung implementieren**:
   - Füge eine freundliche Verabschiedung hinzu, wenn das Programm beendet wird.

10. **Code-Review und Optimierung**:
    - Überprüfe den Code auf mögliche Optimierungen und Verbesserungen.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hauptklasse {
    public static void main(String[] args){
        // Hier erstellen wir unsere Logik
        Scanner scanner = new Scanner(System.in);
        ToDoListe toDoListe = new ToDoListe(); // Neue Instanz der ToDoListe erstellen
        String eingabe;

        // Endlosschleife bis Abbruch vom Benutzer
        while (true){
            System.out.println("To-Do Liste"); // Ausgabe als Überschrift
            List<ToDoElement> elemente = toDoListe.getElemente(); // Abrufen der aktuellen To-Do-Elemente
            for(int i = 0; i < elemente.size(); i++){
                System.out.println((i + 1) + ". " + elemente.get(i));
            }
            // Übersicht zur Benutzereingabe
            System.out.println("\nBitte wählen Sie eine Option:");
            System.out.println("1. Aufgabe hinzufügen");
            System.out.println("2. Eintarg löschen");
            System.out.println("3. Alle Einträge löschen");
            System.out.println("4. Mehrere Einträge löschen");
            System.out.println("5. Eintarg ändern");
            System.out.println("6. Beenden");

            // Benutzereingabe für die Auswahl
            System.out.print("Ihre Wahl: ");
            eingabe = scanner.nextLine();

            switch (eingabe){
                case "1":
                    System.out.print("Geben Sie die Aufgabe ein: ");
                    String neueAufgabe = scanner.nextLine();
                    toDoListe.fuegeElementHinzu(neueAufgabe);
                    break;
                case "2":
                    System.out.println("");

            }


        }
    }
}

