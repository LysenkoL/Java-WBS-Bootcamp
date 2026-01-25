package Berschreiben;

public final class Terminator extends Robot { // Die Klasse Terminator ist als final markiert: Von ihr soll nicht mehr geerbt werden.
    public String targetName;

    public Terminator(String name) {
        super("Terminator " + name); // Spezialisierungsregel: Alle Terminatoren sollen "Terminator" im Namen haben.
    }

    @Override
    public void sprechen() {
        // Hier kommt etwas hin, dass ich VOR der super-Implementierung ausführen will...
        super.sprechen(); // Mit "super" greifen wir auf die Eltern-Klasse zu -> Die Implementierung von sprechen(), so wie sie in "Robot" steht
        // Hier kommt etwas hin, dass ich NACH der super-Implementierung ausführen will...

        // In unserem Fall: Nach der Initialisierung verabschiedet sich der Terminator
        System.out.println("See you later, Terminator!");
    }
}
