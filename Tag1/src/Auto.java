public class Auto {
    public String lackfarbe;
    public String nummernschild;
    //public Uhrzeit kaufzeit; //TODO

    public Auto(String lackfarbe, String nummernschild) {
        this.lackfarbe = lackfarbe; // Parameter "lackfarbe" und Attribut "lackfarbe" sind nicht dieselben.
        this.nummernschild = nummernschild;
        // Wir lesen aus dem Parameter der Methode und schreiben in das Attribut des Objekts (das gerade von diesem Konstruktor erstellt wird).
    }

    public Auto(String lackfarbe) { // Alternativer Konstruktor mit nur einem Parameter
        this.lackfarbe = lackfarbe; // Zuweisung wie bei dem anderen Konstruktor
        this.nummernschild = "XX XX000"; // Ein Standardwert für das Attribut "nummernschild", wenn das Objekt über diesen alternativen Konstruktor erstellt wird.
    }
}
