package fuhrpark;

public class AutoLackierer {
    public void lackiereAuto(Auto auto, String farbe) { // Öffentliche methode zum Modifizieren von einer Variable, die package private ist.
        auto.lackfarbe = farbe; // Weil AutoLackierer im selben Paket wie Auto ist, können wir hier auf Auto.lackfarbe zugreifen.
    }
}
