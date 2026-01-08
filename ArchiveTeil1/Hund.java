public class Hund extends Tier {
    private String rasse;
    private double groesse;

    // Konstr

    public Hund (String name, int alter, String rasse, double groesse){
        super (name, alter);
        this.rasse = rasse;
        this.groesse = groesse;
    }

    @Override
    public  void beschreibung(){
        super.beschreibung();
        System.out.println("Rasse: " + rasse + " Größe: " + groesse);
    }

}
