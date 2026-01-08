public class Methoden {
    public static void begruessung() {
        System.out.println("Willkommen zum Programmieren.");
    }
    public static void ausgabeText(String text){
        System.out.println(text);
    }

    public static void wiederholeText(String text, int anzahl){
        for (int i = 0; i < anzahl; i++) {
            System.out.println(text);
        }
    }

    public static String addieren(int zahl1, int zahl2){
        int summe = zahl1 + zahl2;
        return String.valueOf(summe);
    }
    public static int multiplizieren(int zahl1, int zahl2){
        return zahl1 * zahl2;
    }

    public static double durchschnitt(int zahl1, int zahl2, int zahl3){
        return (zahl1 + zahl2 + zahl3) / 3.0 ;
    }

    public static void main(String[] args) {
        begruessung();
        ausgabeText("Beispiel");
        wiederholeText("Wieder", 5);
        String ergebnis = addieren(5,4);
        System.out.println(" Das Ergebnis ist " + ergebnis);
        int result = multiplizieren(5,4);
        System.out.println(" Das Result ist " + result);
        System.out.println(" Das Result ist " + durchschnitt(3,6,34));
    }
}
