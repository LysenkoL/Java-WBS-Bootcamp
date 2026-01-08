/*Schreibe ein Java-Programm, das zwei Würfel simuliert. Die Würfel sollen Zufallszahlen im Wertebereich
von 1 bis 6 generieren und in einer Endlosschleife geworfen werden, bis der Benutzer das Programm selbst beendet.

Anforderungen:

Zufallszahlen für die Würfel:
Verwende die Random-Klasse, um zwei Zufallszahlen zwischen 1 und 6 zu generieren (die beiden Würfel).

Endlosschleife:
Das Programm soll eine Endlosschleife enthalten, die immer dann ein neues Würfelergebnis ausgibt, wenn der
Benutzer die Enter-Taste drückt.

Beenden des Programms:
Das Programm soll beendet werden, wenn der Benutzer den Text exit eingibt.

Ausgabe:
Bei jedem Wurf sollen die beiden Würfelergebnisse angezeigt werden (z.B. "Wurf 1: 4, 2").

Benutzereingabe:
Nach jedem Wurf wartet das Programm auf die Eingabe des Benutzers:
Drückt der Benutzer Enter, wird ein neues Würfelergebnis generiert.
Gibt der Benutzer exit ein, wird das Programm beendet.*/

import java.util.Random;
import java.util.Scanner;

public class WuerfelSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zwei Zufällige Würfelzahlen zwischen 1 und 6: ");
        System.out.println("Drücke Enter um zu würfeln oder exit um raus zu gehen");
        int counter = 1;
        while (true) {
            String wunsch = scanner.nextLine();
            if (wunsch.equalsIgnoreCase("exit")) {
                System.out.println("Programm beendet");
                break;
            } else {
                int wurf1  = random.nextInt(6) + 1;
                int wurf2  = random.nextInt(6) + 1;
                System.out.println("Deine " + counter + ". Wurf ist " + wurf1 + " und " + wurf2);
                counter++;
            }
        }
        scanner.close();
    }

}
