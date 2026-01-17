package aggregation;

public class Main {
    public static void main(String[] args) {
        Gruppe dieDreiLustigenVier = new Gruppe();

        // Für die Aggregation: Wir erstellen Abenteurer und fügen sie manuell der Gruppe hinzu (nicht automatisch)
        dieDreiLustigenVier.addAbenteurer(new Abenteurer("Alice"));
        dieDreiLustigenVier.addAbenteurer(new Abenteurer("Bob"));
        dieDreiLustigenVier.addAbenteurer(new Abenteurer("Charlotte"));

        for (Abenteurer abenteurer : dieDreiLustigenVier.getAbenteurerInDerGruppe()) {
            System.out.println(abenteurer.getName());
        }
    }
}
