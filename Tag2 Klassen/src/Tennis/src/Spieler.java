package Tennis.src;

public class Spieler {
    private String name;
    private int wins;

    // Konstruktor ohne wins
    public Spieler(String name) {
        this.name = name;
    }

    //Methode inkl. reset und add
    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
    public void addWin() {
        this.wins = wins + 1;
    }
    public void resetWins() {
        this.wins = 0;
    }
}
