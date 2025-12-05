public class Auto {
    public String marke;
    public String modell;;
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
}

