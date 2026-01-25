/* Level 1
    Zeichnen Sie bitte eine UML-Notation für die folgende Klasse:
    - Name: Fußballfeld
    - Member:
      3 private Felder:
        breite (Integer)
        länge (Integer)
        dfbTauglich (Boolean)
      1 public Methode:
        Name: zeigeAlle
        Übergabewerte: Keine
        Funktion: Gibt die Werte der drei Felder auf der Konsole aus
        Rückgabewert: Keiner
      1 Konstruktor:
        Name: Fußballfeld
        Übergabewerte: Länge und Breite des Fußballfeldes
        Funktion: - initialisiert die Felder "breite" und "länge" mit den Übergabewerten
                  - setzt dfbTauglich auf True, falls 45<=breite<=55 UND 90<=länge<=110, sonst dfbTauglich=False
        Rückgabewert: Keiner

    Schreiben Sie bitte in Programm, in dem ...
    - die Klasse 'Fußballfeld' implementiert wird
    - im Main die Funktionalität der Klasse getestet wird
*/


package Aufgabe1.my;

public class Main {
    public static void main(String[] args) {

        Fussballfeld feld = new Fussballfeld(50, 85);
        Fussballfeld feld2 = new Fussballfeld(50, 105);

        feld.zeigeAlle();
        feld2.zeigeAlle();


    }
}
