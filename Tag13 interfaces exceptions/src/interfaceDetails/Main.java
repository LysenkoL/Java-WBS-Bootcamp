package interfaceDetails;

public class Main {
    public static void main(String[] args) {
        System.out.println(LKW.toterWinkel); // Konstante vom Typ LKW
        System.out.println(LKW.kmBisManZumTÜVMuss); // Konstante vom Typ KannFahren, direkt vom Typ LKW aufgerufen
        System.out.println(KannFahren.getNummernschildRegeln()); // Statische Methoden müssen am Typ aufgerufen werden, von dem sie kommen

        LKW lkw = new LKW();
        lkw.fahren();
    }
}

// Im Interface gelten ein paar andere Regeln was Modifizierer angeht:
interface KannFahren {
    public static final int kmBisManZumTÜVMuss = 100_000; // "public static final" redundant -> Attribute sind standardmäßig Konstanten
    public abstract void fahren(); // "public abstract" redundant -> methoden sind standardmäßig wie öffentliche, abstrakte Methoden von abstrakten Klassen

    public static String getNummernschildRegeln() { // "public" wieder redundant
        return "DIN 123ABC von 1990";
    }

    // Wie und warum private? ->
    static boolean unfallgefahr(KannFahren a, KannFahren b) {
        float abstand = abstandsNebenrechnung(a, b);
        return abstand < 5;
    }

    private static float abstandsNebenrechnung(KannFahren a, KannFahren b) {
        // komplizierte Mathematik....
        return 10;
    }
}

abstract class Fahrzeug implements KannFahren {
    // fahren() aus dem Interface funktioniert wie eine abstrakte Methode, und wird hier einfach an die Kind-Klassen weitergereicht
}

class LKW extends Fahrzeug {
    public static final int toterWinkel = 20; // Konstante am Typ LKW

    @Override
    public void fahren() { // Dass wir diese Methode überschreiben müssen, wurde vom Interface bis hierher durchgereicht
        System.out.println("Brumm, brumm");
    }
}