package fehlerUndWoSieZuFindenSind;

public class DasIstKeinRichtigerNameException extends Exception { // Weil das eine Exception (checked) und keine RuntimeException (unchecked) ist, MUSS sie gefangen werden.
    public DasIstKeinRichtigerNameException() {
        super("Der angegebene Name ist nicht lang genug!");
    }
}
