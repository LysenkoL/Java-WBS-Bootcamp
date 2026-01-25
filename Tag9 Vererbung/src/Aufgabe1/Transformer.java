package Aufgabe1;

public class Transformer extends Robot {
    private String faction;

    public Transformer(String name, boolean isHostile, String faction) {
        super(name, isHostile);
        this.faction = faction;
    }

    @Override
    public void sprechen () {
        super.sprechen();
        System.out.println("Stimme von Transformer");
    }
}
