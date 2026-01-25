package fehlerUndWoSieZuFindenSind;

public class CheckedUnchecked {
    public static void main(String[] args) {
        try {
            grüße("Alice"); // Beim Verwenden der Methode MÜSSEN wir uns um die (checked) Exception kümmern.
            // grüße(""); // Fehlerfall
        } catch (DasIstKeinRichtigerNameException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void grüße(String name) throws DasIstKeinRichtigerNameException { // "throws" -> Wir erklären, dass diese Methode eine alternative Ausgabe hat, nämlich unseren Fehlerfall
        if (name.length() == 0) { // Unsere Validierung, bei der dieser Fehler geworfen wird
            throw new DasIstKeinRichtigerNameException();
        }

        // Ansonsten läuft alles richtig:
        System.out.println("Hallo " + name + "! Schön, dass Du da bist!");
    }
}
