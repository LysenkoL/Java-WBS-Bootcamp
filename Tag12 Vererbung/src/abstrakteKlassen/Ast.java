package abstrakteKlassen;

public class Ast extends Wurzel {
    @Override
    public void wasserTrinken() {  // Wir "implementieren" die Methode, was uns durch die abstrakte Methode der abstrakten Eltern-Klasse vorgegeben wurde.
        System.out.println("Wasser fließt durch die Holzzellen...");
    }
}
