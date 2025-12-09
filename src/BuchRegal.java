/*

1. Erstellen Sie ein Programm, das eine Liste von Buchtiteln in einem Array
speichert und die Anzahl der Bücher sowie die Titel anzeigt.

Anforderungen:

Erstellen Sie ein Array von String für die Buchtitel.
Fügen Sie einige Buchtitel in das Array ein.
Geben Sie die Anzahl der Bücher und die Titel aus.

2. Erstellen Sie ein Programm, das eine Liste von Kontakten in einer ArrayList speichert und die Kontakte anzeigt.

Anforderungen:

Erstellen Sie eine ArrayList<String> für die Kontaktnamen.
Fügen Sie einige Kontaktnamen in die Liste ein.
Geben Sie die Anzahl der Kontakte und die Namen aus.

3. Erstellen Sie ein Programm, das eine Liste von Aufgaben mit verschiedenen Status verwaltet,
die in einem Enum definiert sind.

Anforderungen:

Definieren Sie ein Enum Aufgabestatus mit den Werten OFFEN, IN_BEARBEITUNG, ABGESCHLOSSEN.
Erstellen Sie eine Klasse Aufgabe, die die Attribute titel und status hat.
Fügen Sie einige Aufgaben in eine ArrayList ein und geben Sie die Aufgaben mit ihrem Status aus.

 */

import java.util.ArrayList;

public class BuchRegal {
    public static void main(String[] args) {
        ArrayList<String> buchtitel = new ArrayList<String>();
        buchtitel.add ("Harry Potter");
        buchtitel.add ("Java");
        buchtitel.add ("Basis");
        buchtitel.add ("Hexe Lili");
        buchtitel.add ("Liselotta");

        for (int i = 0; i < buchtitel.size(); i++) {
            System.out.println(i+1 + ". Buchtitel: " + buchtitel.get(i));
        }
        System.out.println("Unser arr hat Größe: " + buchtitel.size());


        //#################### Arr statt ArrListe

        String buecher [] = new String[] {
                "Harry Potter",
                "Java",
                "Basis",
                "Hexe Lili",
                "Liselotta"
        };
        for (int i = 0; i < buecher.length; i++) {
            System.out.println(i+1 + ". Buchtitel: " + buecher[i]);
        }
        System.out.println("Unser arr hat ingesamt " + buecher.length + " Bücher");

    }
}
