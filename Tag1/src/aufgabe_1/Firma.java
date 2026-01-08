package aufgabe_1;

public class Firma {
    private String name;
    private double[] konten;

    public Firma(String name, double[] konten) {
        this.name = name;
        this.konten = konten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getKonten() {
        return konten;
    }

    public void setKonten(double[] konten) {
        this.konten = konten;
    }

    public double getSumme(){
        double summe  = 0;
        for (int i = 0; i < this.konten.length; i++) {
            summe = summe + this.konten[i];
        }
        System.out.println("Gesamtbeitrag von Firma " + this.name + " ist: " + summe + " Euro");
        return summe;
    }
}
