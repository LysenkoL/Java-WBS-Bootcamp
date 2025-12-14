/*
Statische Obstliste
Ziel: Erstellen Sie eine Java-Klasse, die eine statische Liste von Obstsorten enthält. Das
Programm soll die Obstsorten in der Konsole ausgeben und zusätzlich die Obstsorten filtern, die
eine bestimmte Anzahl von Buchstaben haben.
Anforderungen:
1. Erstellen Sie eine ArrayList<String>, um die Obstsorten zu speichern.
2. Fügen Sie mindestens fünf Obstsorten statisch zur Liste hinzu.
3. Geben Sie alle Obstsorten in der Liste auf der Konsole aus.
4. Filtern Sie die Obstsorten und geben Sie nur die Obstsorten aus, die eine bestimmte
Anzahl von Buchstaben haben (z.B. 5 Buchstaben).
 */

import java.util.ArrayList;
import java.util.List;




public class Obstsorten {
    public static void filterNachBuchstaben(List<String> liste, int anzahl) {
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i).length() == anzahl) {
                System.out.println("Diese Obstsort hat " + anzahl + " Buchstaben: " + liste.get(i));
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<String> obstsorten = new ArrayList<String>();
        obstsorten.add("Mango");
        obstsorten.add("Äpfel");
        obstsorten.add("Banane");
        obstsorten.add("Birne");
        obstsorten.add("Trauben");

        System.out.println("Alle gespeicherte Obssorten - " + obstsorten);

        /*
        for (int i = 0; i < obstsorten.size(); i++) {
            if(obstsorten.get(i).length() == 5) {
                System.out.println("Diese Obstsort hat 5 Buchstaben: " + obstsorten.get(i));
            }
        }
        */
        filterNachBuchstaben(obstsorten, 6);
    }
}
