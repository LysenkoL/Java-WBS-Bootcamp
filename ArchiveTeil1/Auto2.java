// extends - zeigt an dass Auto von der Klasse Fahrzeug erbt
public class Auto2 extends Fahrzeug {
    private int anzahlTueren;

    //Konstruktor
    public Auto2 (String marke, String modell, String farbe, String motor, int baujahr, double leistungInKW, int anzahlTueren){
        super(marke, modell, farbe, motor, baujahr, leistungInKW);
        this.anzahlTueren = anzahlTueren;
    }

    // Überschreibung der Methode zur Anzeige der Fahrzeuginformationen

    @Override
    public void zeigeInfos(){
        super.zeigeInfos();
        System.out.println("Anzahl der Türen: " + anzahlTueren); //zusatzliche Information zur Superklassse
    }

}
