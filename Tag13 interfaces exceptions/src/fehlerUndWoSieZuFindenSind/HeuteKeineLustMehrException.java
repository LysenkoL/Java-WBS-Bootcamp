package fehlerUndWoSieZuFindenSind;

public class HeuteKeineLustMehrException extends RuntimeException {
    public HeuteKeineLustMehrException() {
        super("Is' gut für heute!");
    }
}
