 {public class Student extends Person implements Identifizierbar {
    private String martikelNummer;
    private String studiengang;

    // Konstruktor
    public Student(String name, int alter, String adresse, String martikelNummer, String studiengang){
        super(name, alter, adresse); // Aufruf des Konstruktor der Super-Klasse Person
        this.martikelNummer = martikelNummer;
        this.studiengang = studiengang;
    }

    // Implementierung der getId-Methode aud dem Interface
    @Override
    public String getId(){return martikelNummer;}; // Gibt die Martikelnummer zurück
     //Methode zur Rückgabe des Studiengangs
     public String getStudiengang(){
     return studiengang}
 }
}

