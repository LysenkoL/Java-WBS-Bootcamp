import org.w3c.dom.ls.LSOutput;

public enum KyuGrad {
    Braun (1),
    Blau(2),
    Gruen(3),
    OrangeGruen(4),
    Orange(5),
    GelbOrange(6),
    Gelb(7),
    WeissGelb(8),
    Weiss(9);

    private final int zahlGrad;

    KyuGrad(int zahlGrad) {
        this.zahlGrad = zahlGrad;
    }

    public static KyuGrad getFarbeVonZahl (int zahlGrad){
        for (int i = 0; i < KyuGrad.values().length; i++) {

            if (KyuGrad.values()[i].zahlGrad == zahlGrad)
                return KyuGrad.values()[i];
        }
        throw new RuntimeException("Nicht gefunden");
        //return null; - auch eine Möglichkeit
    }

    public static int getZahlVonFarbe (String farbeEingabe){
        for (int i = 0; i < KyuGrad.values().length; i++) {

            if (KyuGrad.values()[i].name().equalsIgnoreCase(farbeEingabe))
                //return KyuGrad.values()[i].zahlGrad;
                //return KyuGrad.values()[i].ordinal() + 1;
                return i+1;
        }
        throw new RuntimeException("Nicht gefunden");
        //return null; - auch eine Möglichkeit
    }

}
