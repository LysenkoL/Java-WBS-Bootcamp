package abstrakteKlassen;

public abstract class Wurzel { // Von einer abstrakten Klasse muss geerbt werden, um ein Objekt instanziieren zu können.
    public void wachsen() { // Methode, wie wir sie kennen
        System.out.println("Wenn ich groß bin, will ich ein Wald sein.");
    }

    public abstract void wasserTrinken(); // Diese Methode MUSS überschrieben werden. -> Dieser Teil der Schnittstelle soll je nach Spezialisierung etwas Besonderes tun!

    public final void luftAtmen() { // Diese methode DARF NICHT überschrieben werden.
        System.out.println("Alle Pflanzen atmen Luft immer gleich.");
    }
}
