public class LKW extends Fahrzeug{
    private double ladeKapazitaet;

    //Konstruktor
    public LKW(String marke, String modell, String farbe, String motor, int   baujahr, double leistungInKW, double ladeKapazitaet){
        super(marke, modell, farbe, motor, baujahr, leistungInKW);
        this.ladeKapazitaet = ladeKapazitaet;
    }

    @Override
    public void zeigeInfos(){
        super.zeigeInfos();
        System.out.println("Ladekapazität ist: " + ladeKapazitaet);
    }

}
