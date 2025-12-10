public class ToDoElement {
    private String aufgabe; // Die Aufgabe, die in diesem To-Do-Element gespeichert wird

    // Konstruktor
    public ToDoElement(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    // Getter-Methode
    public String getAufgabe() {
        return aufgabe;
    }

    // Setter-Methode
    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }


    // Überschreiben der toString-Methode, um die Aufgabe als String darzustellen
    @Override
    public String toString() {
        // Die toString Methode ist Methode der Object-Klasse, die in Java die Standartdarstellung eines Objekts liefert.
        // Wenn wir die toString Methode überschreiben, ändern wir das verhalten dieser Methode für dir ToDoElemente-Klsse.
        // Dies ermöglicht uns eine benutzerfreundliche Ausgabe, wenn das ToDoElement-Objekt in eienm String-Kontext verwendet wird
        // wie z.B. beim Drucken der Liste von To-Do-Elementen.
        return aufgabe;// Gibt die Aufgabe als String zurück
    }
}
