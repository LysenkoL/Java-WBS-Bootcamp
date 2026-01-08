package aufgabe_0;

public class Song {
    private String titel;
    private int dauerSekunden;
    private String interpret;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getDauerSekunden() {
        return dauerSekunden;
    }

    public void setDauerSekunden(int dauerSekunden) {
        this.dauerSekunden = dauerSekunden;
    }

    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public void spielen()
    {
        System.out.println("Titel von Song ist: " + titel);
        System.out.println("Diese Song dauert: " + dauerSekunden/60 + ":" + dauerSekunden%60);
        System.out.println("Interpret " + interpret);
    }
}
