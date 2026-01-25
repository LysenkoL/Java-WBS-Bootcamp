package Aufgabe1;

public class Android extends Robot {
    private boolean isHuman;

    public Android(String name, boolean isHostile, boolean isHuman) {
        super(name, isHostile);
        this.isHuman = isHuman;
    }

    @Override
    public void sprechen() {
        System.out.println("Android sagt: ");
    }


}
