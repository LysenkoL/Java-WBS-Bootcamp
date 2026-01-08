public class PlatzhalterBeispiele {
    public static void main(String[] args) {
        // Verschiedene Varianten
        // Variante 1: %d - für Ganzzahlen
        int ganzZahl = 42;
        // printf -> ermöglicht formatierte Ausgaben, was bedeuted dass wir Platzhalter verwenden können.
        // %d gibt die Ganzzahl an der Stelle des Pöatzhalters aus
        // %n sorgt für einen Zeilenumbruch, da printf keinen Zeilenumbruch von sich aus hat.
        System.out.printf("Beispiel 1: Ganzzahl: %d%n", ganzZahl);

        // Nr. 2: %f - für Fließkommazahlen
        double gleitKommaZahl = 3.14159;
        // %.2f gibt die Gleitkommazahl mit zwei Dezimalstellen aus, ohne Rundung!
        System.out.printf("Beispiel 2: Gleitkommazahl: %.2f%n", gleitKommaZahl);

        //Nr. 3: %s - für Strings
        String text = "Hallo Welt!";
        System.out.printf("Beispiel 3: Text: %s%n", text);

        // Nr. 4: %c - für Char
        char zeichen = 'A';
        System.out.printf("Beispiel 4: Zeichen: %c%n", zeichen);

        // Nr. 5: %b - für boolean
        Boolean wahrheitsWert = true;
        System.out.printf("Beispiel 5: Wahrheitswert: %b%n", wahrheitsWert);

        // Nr. 6: %e - wissenschaftliche Notation
        double wissenschaftlich = 1234567.89;
        System.out.printf("Beispiel 6: Wissenschaftlich: %e%n", wissenschaftlich);

        // Nr. 7: %x - Hexadezimale Anzeige
        int hexZahl = 255;
        System.out.printf("Beispiel 7: Hexadezimal: %x%n", hexZahl);

        // Nr. 8: %o - für oktale Darstellung
        System.out.printf("Beispiel 8: Oktale Darstellung: %o%n", hexZahl);

        // Beispiel mit mehreren Platzhalter und Argumenten
        String name = "Maxi Million";
        int alter = 30;
        double gehalt = 2545.43;
        boolean angestellt = true;
        // Beachte die Reihenfolge der Platzhalter und der Argumente
        System.out.printf("Name: %s, Alter: %d, Gehalt: %.2f, Angestellt: %b%n", name, alter, gehalt, angestellt);

    }
}
