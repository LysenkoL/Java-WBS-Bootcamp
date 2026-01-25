package interfaces;

public class LKW implements KannLastTransportieren, KannFahren, KannPersonenTransportieren { // LKW implementiert KannLastTransportieren UND KannFahren. (nicht "erbt von")
    private String last = "";

    @Override // Dieselbe Annotation wie bei der Vererbung
    public void ladeLastEin(String last) {
        if (this.last.equals("")) {
            this.last = last;
        }
        else {
            System.out.println("Fehler: Ladenraum ist schon voll!");
        }
    }

    @Override
    public String ladeLastAus() {
        String ausladen = last;
        last = "";
        return ausladen;
    }

    @Override
    public void fahren() {
        System.out.println("Brumm, brumm!");
    }

    @Override
    public void gibSicherheitshinweise() {
        System.out.println("Achtung beim Bremsen, wenn eine schwere Last geladen wurde!");
    }
}
