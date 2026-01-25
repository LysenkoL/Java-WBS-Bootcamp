package protectedAttributes.baseRobots;

public class Robot {
    public String name; // Überall sichtbar
    protected boolean isHuman; // Nur in der Vererbung sichtbar
    String manufacturerId; // Nur in diesem Paket (baseRobots) sichtbar
    private int creationDate; // Nur in dieser Klasse sichtbar
}
