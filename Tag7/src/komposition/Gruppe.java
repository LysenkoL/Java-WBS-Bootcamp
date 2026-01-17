package komposition;

import java.util.ArrayList;

public class Gruppe {
    public String gruppenname;
    private ArrayList<Abenteurer> abenteurerInDerGruppe = new ArrayList<>();

    public ArrayList<Abenteurer> getAbenteurerInDerGruppe() {
        return abenteurerInDerGruppe;
    }

    public void addAbenteurer(Abenteurer abenteurer) {
        abenteurerInDerGruppe.add(abenteurer);
    }

    // Für die Komposition: Wir geben der Gruppe die Fähigkeit, Abenteurer selbst zu erstellen und konfigurieren die neuen Abenteurer direkt passend zur Gruppe
    public Abenteurer createAbenteurer(String vorname) {
        Abenteurer abenteurer = new Abenteurer(vorname + " von " + gruppenname);
        addAbenteurer(abenteurer);
        return abenteurer;
    }
}
