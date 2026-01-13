/* Level 2
        *  Erstellen Sie ein Java-Programm, in dem Sie
        *  - den enum Kyu fortlaufend nummeriert {
    braun = 1, Blau, Grün, OrangeGrün, Orange, GelbOrange, Gelb, WeißGelb, Weiß } einführen
    *
        *  - dem Benutzer in einer Schleife eine Auswahl präsentieren
        *      - Kyu-Grad (1)
        *      - Gürtel-Farbe (2)
        *      - Nächste Prüfung (3)
        *  - Bei der ersten Auswahl gibt der Benutzer seinen Kyu-Grad (zwischen 1 und 9) ein und bekommt die Gürtelfarbe ausgegeben
        *  - Bei der zweiten Auswahl sollen dem Benutzer die möglichen Gürtelfarben ausgegeben werden.
        *      - anschließend gibt der Benutzer eine Farbe ein und bekommt den Kyu-Grad als Ausgabe.
        *  - Bei der dritten Auswahl sollen dem Benutzer wieder die möglichen Gürtelfarben ausgegeben werden.
        *      - Der Benutzer gibt seine aktuelle Gürtelfarbe ein und bekommt als Ausgabe die Farbe des nächsten Gürtels.
        *
        *  Hinweis: Kyu sind die Ränge in japanischen Kampfkünsten, hier speziell die Ränge des deutschen Judo-Bundes.
        *  Der höchste Rang ist der braune Gürtel (also der 1. Kyu) der niedrigste der weiße (der 9. Kyu).
        */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int convertEingabe;
        do {
            System.out.println("Geben Sie bitte Zahl zwischen 1 und 9 ein");
            String zahlEingabe = scan.nextLine();
            convertEingabe = Integer.parseInt(zahlEingabe);
            //KyuGrad kyuAuswahl = KyuGrad.valueOf(zahlEingabe);
        } while (convertEingabe<0 || convertEingabe>9);

        System.out.println(KyuGrad.getFarbeVonZahl(convertEingabe));

        System.out.println("Jetzt wählen Sie eine Farbe: ");
        System.out.println(Arrays.toString(KyuGrad.values()));

        String farbeEingabe = scan.nextLine();

        System.out.println("Dein nummer von Gürtel ist " + KyuGrad.getZahlVonFarbe(farbeEingabe));

        System.out.println("Alle Farben von Gürteln: ");
        System.out.println(Arrays.toString(KyuGrad.values()));
        System.out.println("Geben Sie bitte Ihre aktualle Gürtelfarbe um zu wissen, welche Farbe wird nächste");

        String aktuelleFarbeEingabe = scan.nextLine();

        System.out.println("Deine nächste Gürtelfarbe ist " + KyuGrad.getFarbeVonZahl(KyuGrad.getZahlVonFarbe(aktuelleFarbeEingabe) + 1) );







    }
}
