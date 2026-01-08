/* Level 1
(- und + hier in der Aufgabenstellung dienen nur zur Auflistung
der einzelnen Punkte und haben nichts mit den Zugriffsmodifizierern im UML-Diagramm zu tun)
 Schreiben Sie bitte ein Programm, in dem ...
 - eine Klasse Firma definiert wird
   + die Member der Klasse sind:
     - String: name
     - Double-Liste: konten
     - Methode: getSumme
       + Funktion: berechnet den Gesamtbetrag aller Listenelemente
       + Rückgabewert: Gesamtbetrag
     - Getter und Setter für die Attribute.

 - In der Main erstellen Sie zwei Firmen und geben die Werte testweise aus.

 Erstellen Sie zu der Klasse ein UML Klassendiagramm.
*/

package aufgabe_1;

public class Main {
    public static void main(String[] args) {


        Firma erste = new Firma("LVB", new double[]{155.5, 200, 500, 200});
        Firma zweite = new Firma("LeipzigTech", new double []{333.5, 77, 777});

        erste.getSumme();
        zweite.getSumme();


        //
    }
}