package interfaces;

public class Personenflugzeug implements KannFliegen, KannPersonenTransportieren {
    @Override
    public void fliegen() {
        System.out.println("Swooosh!");
    }

    @Override
    public void gibSicherheitshinweise() {
        System.out.println("Die Notausgänge sind vorne, hinten, oben, unten, links, und rechts...");
    }
}
