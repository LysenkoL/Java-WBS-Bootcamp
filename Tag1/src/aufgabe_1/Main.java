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

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        /* нет конструктора надо через методы
        Firma erste = new Firma("LVB", new double[]{155.5, 200, 500, 200});
        Firma zweite = new Firma("LeipzigTech", new double []{333.5, 77, 777});

         */
        Firma f1 = new Firma();
        f1.setName("LVB");
        List<Double> kontenF1 = new ArrayList<>();
        kontenF1.add(10.50);
        kontenF1.add(20.0);
        kontenF1.add(5.99);
        f1.setKonten(kontenF1);

        Firma f2 = new Firma();
        f2.setName("McDonalds");
        List<Double> kontenF2 = new ArrayList<>();
        kontenF2.add(13.01);
        kontenF2.add(12.07);
        kontenF2.add(19.04);
        f2.setKonten(kontenF2);

        f1.getSumme();
        f2.getSumme();

        /* Muster
         Firma f1 = new Firma();
        f1.setName("Meine Firma 1");
        f1.setKonten(new ArrayList<>(Arrays.asList(1999.95, 0.05, 1234.10)));

        Firma f2 = new Firma();
        f2.setName("Meine andere Firma");
        f2.setKonten(new ArrayList<>(Arrays.asList(11.35, 987.65, 1.0)));

        List<Firma> firmenliste = new ArrayList<Firma>();
        firmenliste.add(f1);
        firmenliste.add(f2);

        for (Firma element : firmenliste)
        {
            System.out.println(element.getName()+ " : " + element.getSumme());
        }
         */


        //
    }
}