// Die super-klasse Fahrzeug
public class Fahrzeug {
    private String marke;
    private String modell;
    private String farbe;
    private String motor;
    private int baujahr;
    private double leistungInKW;

    // Konstruktor
    public Fahrzeug (String marke, String modell, String farbe, String motor, int   baujahr, double leistungInKW){
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.motor = motor;
        this.baujahr = baujahr;
        this.leistungInKW = leistungInKW;
    }

    // Methode
    public void zeigeInfos() {
        System.out.println("Marke: " + marke + ", Modell: " + modell + ", Farbe: " + farbe + ", " +
                "Motor: (Benzin/Diesel)" + motor + ", Baujahr: " + baujahr + ", Leistung in KW: " + leistungInKW);
    }

}
