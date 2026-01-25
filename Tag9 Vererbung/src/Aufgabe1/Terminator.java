package Aufgabe1;


public final class Terminator extends Robot {
    private String targetName;

    public Terminator(String name, boolean isHostile, String targetName) {
        super(name, isHostile);
        this.targetName = targetName;
    }

    @Override
    public void sprechen() {
        System.out.println("Terminator spricht: ");
    }


}
