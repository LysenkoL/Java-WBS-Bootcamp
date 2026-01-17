package aufgabe_1;

import java.util.List;

public class Firma {
    private String name;
    // private double[] konten; - мое не поняла что надо лист а не арр
    private List<Double> konten;
    /* мое неправильно поняла что конструктор не надо в задании
    public Firma(String name, double[] konten) {
        this.name = name;
        this.konten = konten;
    }
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getKonten() {
        return konten;
    }

    public void setKonten(List<Double> konten) {
        this.konten = konten;
    }

    public double getSumme(){
        double summe  = 0;
        for (int i = 0; i < this.konten.size(); i++) {
            summe = summe + this.konten.get(i);
        }

        /* через фор ич
         for (double konto : konten) {
            summe = summe + konto;
        }
         */
        System.out.println("Gesamtbeitrag von Firma " + this.name + " ist: " + summe + " Euro");
        return summe;
    }
}
