package abstrakteKlassen;

public final class Blatt extends Ast {
    @Override
    public void wachsen() { // Wir "überschreiben" die Implementierung der methode der abstrakten Eltern-Klasse.
        super.wachsen();
        System.out.println("... mit gaaaanz vielen grünen Blättern.");
    }
}
