/*
 * Vor der Implementierung der Klasse Buch sollten die folgenden Schritte durchgeführt werden:
 *
 * 1. Anforderungen definieren:
 *    - Bestimmen Sie, welche Eigenschaften (Attribute) das Buch haben soll (z.B. Titel, Autor, Seitenanzahl).
 *    - Überlegen Sie, welche Methoden benötigt werden (z.B. zur Ausgabe von Informationen, zur Aktualisierung von Attributen).
 *
 * 2. Entwurf der Klasse:
 *    - Skizzieren Sie die Struktur der Klasse, einschließlich der Attribute und Methoden.
 *    - Überlegen Sie, wie die Methoden miteinander interagieren sollen.
 *
 * 3. Überlegen Sie, wie die Benutzer mit der Klasse interagieren werden:
 *    - Welche Informationen müssen beim Erstellen eines Buchobjekts bereitgestellt werden?
 *    - Wie werden die Methoden aufgerufen und welche Rückgabewerte werden erwartet?
 *
 * 4. Testfälle planen:
 *    - Überlegen Sie sich, wie Sie die Funktionalität der Klasse testen möchten.
 *    - Erstellen Sie Testfälle für verschiedene Szenarien, z.B. für die Bewertung des Buches, die Verfügbarkeit usw.
 *
 * 5. Entwicklungsumgebung einrichten:
 *    - Stellen Sie sicher, dass Ihre Entwicklungsumgebung (IDE) korrekt konfiguriert ist.
 *    - Überprüfen Sie, ob alle benötigten Bibliotheken und Abhängigkeiten vorhanden sind.
 *  Wir wollen Bücher aufnehmen in unsere Bibliothek mit Geanuer Beschreibung
 *  Attribute => Titel, Autor, Seitenzahl, Kategorie, Verfügbar, Bewertung
 *  Konstruktor wird benötigt
 *  Metoden für den zugriff wie Buchinformation, setter und getter Methoden, Methode zur Rückgabe der
 *  Bewerungen usw.*/


public class Buch {
    private String titel;
    private String autor;
    private int  seitenzahl;
    private String kategorie;
    private boolean verfuegbar;
    private double bewertung;

    // Konstruktor der Klasse Buch
    public Buch(String titel, String autor, int seitenzahl, String kategorie, boolean verfuegbar, double bewertung){
        this.titel = titel;
        this.autor=autor;
        this.seitenzahl=seitenzahl;
        this.kategorie = kategorie;
        this.verfuegbar = verfuegbar;
        this.bewertung = bewertung;
    }

    //methode Ausgabe alle Information
    public void zeigeInfo(){
        System.out.println("Buch: " + titel + " von " + autor +
                ", Seitenanzahl: " + seitenzahl +
                ", Kategorie: " + kategorie +
                ", Verfügbar: " + verfuegbar +
                ", Bewertung: " + bewertung);
    }

    // Methode zur Seitenzahl Akrualisierung
    public void setSeitenanzahl (int seitenzahl){
        this.seitenzahl = seitenzahl;
    }

    // Methode zur Zeigen Seitenzahl
    public int getSeitenzahl(){
        return seitenzahl;
    }

    // Methode um Verfügbarkeit zu setzen
    public void setVerfuegbar(boolean verfuegbar){
        this.verfuegbar = verfuegbar;
    }

    // Methode zur Bewertung
    public void setBewertung(double bewertung){
        if(bewertung>= 1.0 && bewertung<=5.0){
            this.bewertung = bewertung;
        } else {
            System.out.println("Falsche Eingabe. Bewertung kann nur zwischen 1.0 und 5.0 sein");
        }
    }

    // Methode zur Rückgabe der Bewertung
    public double getBewertung(){
        return bewertung;
    }
}
