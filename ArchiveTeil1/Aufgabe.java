import java.util.ArrayList;

enum Aufgabestatus{
    OFFEN,
    IN_BEARBEITUNG,
    ABGESCHLOSSEN
}
public class Aufgabe {
    private String titel;
    private Aufgabestatus status;

    //Konstruktor
    public Aufgabe(String titel, Aufgabestatus status) {
        this.titel = titel;
        this.status = status;
    }
}

/*public static void main(String[] args) {
    // ############## Tag 7 Teil 3 ##################

    ArrayList<Aufgabe> aufgabenListe = new ArrayList<>();  //ArrayList<String> Aufgaben = new ArrayList<>();!!!!
    aufgabenListe.add("LearnSpase öffnen", Aufgabestatus.OFFEN);
    aufgabenListe.add("Intellij öffnen", Aufgabestatus.IN_BEARBEITUNG);
    aufgabenListe.add("Tag 7 öffnen", Aufgabestatus.ABGESCHLOSSEN);
    aufgabenListe.add("Aufgabe enum öffnen", Aufgabestatus.OFFEN);
    aufgabenListe.add("Alles zeigen", Aufgabestatus.IN_BEARBEITUNG);
    aufgabenListe.add("Feierabend", Aufgabestatus.OFFEN);

    for (int i = 0; i < aufgabenListe.size(); i++) {

    switch (aufgabenListe.get(i).status) {
        case OFFEN:
            System.out.println(aufgabenListe.get(i).titel);
            System.out.println("Die Aufgabe ist noch nicht begonnen.");
            break;
        case IN_BEARBEITUNG:
            System.out.println(aufgabenListe.get(i).titel);
            System.out.println("Die Aufgabe wird gerade bearbeitet");
            break;
        case ABGESCHLOSSEN:
            System.out.println(aufgabenListe.get(i).titel);
            System.out.println("Die Aufgabe ist abgeschlossen");
            break;
    }

}*/
