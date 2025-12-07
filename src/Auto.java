public class Auto {
    private String marke;
    private String modell;;
    private int baujahr;

    public Auto(String marke, String modell, int baujahr){
        this.marke = marke;
        this.modell=modell;
        this.baujahr=baujahr;
    }

    public void zeigeInfos() {
        System.out.println("Auto: " + marke + " " + modell + " Baujahr: " + baujahr);
    }
    public int getBaujahr() {
        return this.baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    // ######################## Hausafgabe Tag 5
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public void setModell(String modell) {
        this.modell = modell;
    }
    public String getMarke() {return this.marke;}
    public String getModell() {return this.modell;}
    public int berechneAlter(int aktuellesJahr){
        return aktuellesJahr - baujahr;
    }
    public boolean istNeu(int aktuellesJahr){
        if (aktuellesJahr-baujahr < 3) {
            return true;}
        return false;
    }

}

