package Berschreiben;

public class Android extends Robot {
    public boolean inHuman;

    public Android(String name, boolean inHuman) {
        super(name); // Mit "super" greifen wir auf die Basis-Klasse (aka Eltern-Klasse) zu. Hier: Konstruktorüberladung
        // Bis hier haben wir also schon einmal den Robot-Anteil vom Objekt konstruiert...

        this.inHuman = inHuman; // Mit "this" greifen wir auf das konkrete Objekt zu
        // Hier haben wir dan auch den Android-Anteil vom Objekt konstruiert.
    }

    @Override // <- Java-Annotation: Sagt dem Compiler, dass wir die spezielle Variante dieser Methode verwenden wollen
    public void sprechen() { // Dieselbe Signatur (Sichtbarkeit, Rückgabetyp, Name, Parameterliste) wie von der Methode der Eltern-Klasse
        System.out.println("Oh, Du meine Güte!");
    }
}
