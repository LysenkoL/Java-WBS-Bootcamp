public class Motorrad extends Fahrzeug {
    private boolean hatBeiwagen;

    //Konstruktor
    public Motorrad(String marke, String modell, String farbe, String motor, int baujahr, double leistungInKW, boolean hatBeiwagen) {
        super(marke, modell, farbe, motor, baujahr, leistungInKW);
        this.hatBeiwagen = hatBeiwagen;
    }

    @Override
    public void zeigeInfos(){
        super.zeigeInfos();
        System.out.println("Hat Beiwagen: " + (hatBeiwagen ? "Ja" : "Nein"));
    }


}
