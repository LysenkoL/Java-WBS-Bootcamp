package aufgabe3;

import java.util.ArrayList;

public class Fahrzeug {
   String kennzeichen;
   String lackierung;
   String marke;
   autoTyp fahrzeugTyp;


    public Fahrzeug(String kennzeichen, String lackierung, String marke, autoTyp fahrzeugTyp) {
        this.kennzeichen = kennzeichen;
        this.lackierung = lackierung;
        this.marke = marke;
        this.fahrzeugTyp = fahrzeugTyp;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getLackierung() {
        return lackierung;
    }

    public String getMarke() {
        return marke;
    }

    public autoTyp getFahrzeugTyp() {
        return fahrzeugTyp;
    }
}


