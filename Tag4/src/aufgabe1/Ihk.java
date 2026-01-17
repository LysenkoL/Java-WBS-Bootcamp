package aufgabe1;

public enum Ihk {

    SehrGut(92),
    Gut(81),
    Befriedigend(67),
    Ausreichend(50),
    Mangelhaft(30),
    Ungenuegend(0);

    private final int punktNiveau;

    Ihk(int punktNiveau) {
        this.punktNiveau = punktNiveau;
    }
    public static Ihk getNiveau(int punktNiveau) {
        for (int i = 0; i < Ihk.values().length; i++) {
            if(Ihk.values()[i].punktNiveau <= punktNiveau) {
                return Ihk.values()[i];
            }
        }
        return  null;
        //throw new RuntimeException("Nicht gefunden");
    }
}


