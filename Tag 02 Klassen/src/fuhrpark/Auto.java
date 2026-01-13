package fuhrpark;

public class Auto {
    // Erstellen Sie eine Autoklasse, deren Objekte eine Geschwindigkeit haben,
    // die aktuelle Strecke speichern, und die Fähigkeit besitzen, eine Stunde lang zu fahren.

    private float geschwindigkeitKmH;
    private float zurückgelegteStreckeKm;

    String lackfarbe; // In Java -> Kein Zugriffsmodifizierer bedeutet package private. (Siehe AutoLackierer)

    public Auto (float startGeschwindigkeit) {
        setGeschwindigkeitKmH(startGeschwindigkeit); // Wir benutzen unsere eigene Schnittstelle, um die Validierung auch beim Konstruktor zu verwenden.
    }

    public void setGeschwindigkeitKmH(float geschwindigkeitKmH) { // Validierung: Wir kontrollieren den Wert, der von außen übergeben wird.
        if (geschwindigkeitKmH >= 0)
            this.geschwindigkeitKmH = geschwindigkeitKmH;
        else
            System.out.println("Fehler: Eine negative Geschwindigkeit ist nicht zulässig!"); // Reicht für unser Beispiel. Eine Exception wäre vielleicht besser, in einem größeren Projekt.
    }

    public float getGeschwindigkeitKmH() { // Könnten wir auch definieren, weil der äußere Kontext die Erlaubnis hat, den Wert zu lesen. Momentan brauchen wir es aber nicht.
        return geschwindigkeitKmH;
    }

    public float getZurückgelegteStreckeKm() { // Von außen darf man diesen Wert nur lesen (kein Setter).
        return zurückgelegteStreckeKm;
    }

    public void eineStundeFahren() { // Die Fähigkeit, unsere Simulation um eine Stunde weiterlaufen zu lassen
        zurückgelegteStreckeKm = zurückgelegteStreckeKm + geschwindigkeitKmH;
    }
}
