package komposition;

public class Main {
    public static void main(String[] args) {
        Gruppe dieDreiLustigenVier = new Gruppe();
        dieDreiLustigenVier.gruppenname = "Die 3 lustigen 4";

        // Für die Komposition: Wir erstellen die Abenteurer über die Gruppe automatisch
        dieDreiLustigenVier.createAbenteurer("Alice");
        dieDreiLustigenVier.createAbenteurer("Bob");
        dieDreiLustigenVier.createAbenteurer("Charlotte");

        for (Abenteurer abenteurer : dieDreiLustigenVier.getAbenteurerInDerGruppe()) {
            System.out.println(abenteurer.getName());
        }
    }
}
