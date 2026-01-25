package Aufgabe1.my;

public class Fussballfeld {
    private Integer breite;
    private Integer laenge;
    private boolean dfbTauglich;

    public Fussballfeld(Integer breite, Integer laenge) {
        this.breite = breite;
        this.laenge = laenge;
        if((breite >= 45 && breite<=55) && (laenge>=90 && laenge<=110)){
            this.dfbTauglich = true;
        }
        else{
            this.dfbTauglich = false;
        }

    }

    public void zeigeAlle() {
        System.out.println("Breite " + breite + " Laenge " + laenge + " " + " " + dfbTauglich );
    }

}
