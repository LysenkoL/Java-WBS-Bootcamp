enum Aufgabestatus{
    OFFEN,
    IN_BEARBEITUNG,
    ABGESCHLOSSEN
}
public class Aufgabe {
    private String titel;
    private Aufgabestatus status;

    //Konstruktor
    public Aufgabe(String titel, Aufgabestatus status){
        this.titel = titel;
        this.status = status;
    }


}
