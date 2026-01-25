package interfaces;

public class KombiAuto implements KannFahren, KannPersonenTransportieren {
    @Override
    public void fahren() {
        System.out.println("Huiii");
    }

    @Override
    public void gibSicherheitshinweise() {
        System.out.println("Bitte anschnallen!");
    }
}
