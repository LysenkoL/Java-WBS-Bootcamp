public class Tier {
    private String name;
    private int alter;

    // Konstr

    public Tier(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public void beschreibung () {
        System.out.println("Dieser Tier heißt - " + name + " und ist " + alter + " Jahre alt");
    }
}
