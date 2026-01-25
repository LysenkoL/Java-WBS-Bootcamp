package Aufgabe1;

public class Robot {
    private String name;
    private boolean isHostile;

    public Robot(String name, boolean isHostile) {
        this.name = name;
        this.isHostile = isHostile;
    }

    public String getName() {
        return name;
    }

    public void sprechen() {
        System.out.println("Bla-bla-bla");
    }
}
