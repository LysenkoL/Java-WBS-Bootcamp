package fehlerUndWoSieZuFindenSind;

public class Main {
    private static int lustOMeter = 0;
    private static String[] menüs = {"Haupt", "Einstellungen", "Beenden"};

    public static void main(String[] args) {
        String aktuellesMenü = null; // ich versuche, diese Variable im Try zu befüllen, werde sie aber auch außerhalb vom Try brauchen

        try {
            String meineNutzereingabe = "2";
            //String meineNutzereingabe = "2m"; // Exception 1
            //String meineNutzereingabe = "100"; // Exception 2

            // Schritt 1
            int eingabeAlsZahl = Integer.parseInt(meineNutzereingabe);

            // Schritt 2
            aktuellesMenü = menüs[eingabeAlsZahl - 1];
        }
        // Es folgen die möglichen Fehlerfälle (so wie case im switch)
        catch (NumberFormatException e) { // Ausnahmezustand 1, falsches Format
            System.err.println("Entschuldigung, Ihre Eingabe beinhaltet keine normale Zahl, sondern etwas anderes. Bitte nochmal versuchen!");
        }
        catch (ArrayIndexOutOfBoundsException e) { // Ausnahmezustand 2, (logisch) fehlerhafte Eingabe
            System.err.println("Entschuldigung, für Ihre Eingabe gibt es kein Menü, bitte versuchen Sie es nochmal!");
        }
        catch (Exception e) { // "Catch-All" -> Jede Exception (so wie default in switch)
            System.err.println("Oooops! Da ging was schief, bitte schicken Sie eine E-Mail an unser Entwicklerteam, hängen sie bitte folgende Information an: " + e.getMessage());
        }

        System.out.println(aktuellesMenü); // Programm geht weiter

        // Eigene Exception werfen
        try {
            if (lustOMeter <= 0) {
                throw new HeuteKeineLustMehrException(); // "throw" ist der Aufruf von einem Ausnahmezustand
                //throw new IllegalArgumentException("Falsche menge an Lust wurde heute übergeben!"); // Wir können Fehlerobjekte erstellen

                // Oder, wer zu faul ist, "qualifizierte" Exceptions zu benutzen, nimmt einfach die zwei Standardtypen
                //throw new RuntimeException("Meine Fehlermeldung"); // unchecked
                //throw new Exception("Meine Fehlermeldung"); // checked
            }
            else {
                System.out.println("Alles gut!");
            }
        } catch (HeuteKeineLustMehrException e) {
            System.err.println(e.getMessage());
        }
    }

    // Finally wird am Ende ausgeführt, sogar nach einem Return, und ist vor allem dazu gedacht, unfertige Aufgaben aufzuräumen:
    public static float eineRechnungBeiDerEtwasSchiefGehenKann(float a, float b) {
        String pfadZuEinerDatei = "ein/toller/pfad.txt"; // Diese Datei soll in jedem Fall freigegeben werden.
        try {
            // komplexe Mathematik...
            return 5; // Ausgabe, wenn alles gut geht.
        }
        catch (RuntimeException e) {
            System.err.println("Fehler!");
            return 0; // Ausgabe im Fehlerfall
        }
        finally {
            pfadZuEinerDatei = ""; // Passiert immer
        }
    }
}
