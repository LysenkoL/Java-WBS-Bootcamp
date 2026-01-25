package aggregation;

import java.util.ArrayList;

public class Gruppe {
    private ArrayList<Abenteurer> abenteurerInDerGruppe = new ArrayList<>();

    public ArrayList<Abenteurer> getAbenteurerInDerGruppe() {
        return abenteurerInDerGruppe;
    }

    public void addAbenteurer(Abenteurer abenteurer) {
        abenteurerInDerGruppe.add(abenteurer);
    }
}
