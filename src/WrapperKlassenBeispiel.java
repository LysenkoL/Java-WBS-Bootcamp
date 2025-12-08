/*
Wrapper Klassen in Java sind spezielle Klassen, die primitive Datentypen in Objekte umwandelt.
Sie ermöglichen es, primitive Typen wie int, char, boolean usw. als Objekte zu behandeln.
Dies ist besonders nützlich, wenn man mit Datenstrukturen wie ArrayList,
 die nur Objekte speichern können, arbeiten möchte.

Hauptgründe:
Objektorientierung: Wrapper-Klassen ermöglichen die erst das Primitive Datentypen als Objekte Verwendet werden können.
// Примитивы получают методы и свойства объектов.
Datenstruktur: ArrayList, HashMap können nur Objekte speichern.
Wrapper-Klassen ermöglichen das. // Позволяют использовать примитивы в коллекциях.

Wrapper-Klassen für Primitive Datentypen: // Классы-обертки для примитивных типов
int     => Integer      // Самый частый пример. Используется в ArrayList<Integer>.
boolean => Boolean
char    => Character    // Единственная обертка, начинающаяся с 'C' (Char).
byte    => Byte
short   => Short
long    => Long
float   => Float
double  => Double
// Дополнение: Java автоматически выполняет Autoboxing (int -> Integer) и Unboxing (Integer -> int).
*/

import java.util.ArrayList;

public class WrapperKlassenBeispiel {
    public static void main(String[] args) {
        // Erstellen eine ArrayList als Integer
        ArrayList<Integer> zahlen = new ArrayList<>(); // in zweite Teil kann man Integer weg lassen
        zahlen.add(10);
        zahlen.add(20);
        zahlen.add(30);

        // Zugriff auf ein Element in der Liste
        Integer ersteZahl = zahlen.get(0);
        System.out.println("Erste Zahl: " + ersteZahl);

        // Umwandlung eines Strings in eine Integerzahl
        String zahlString = "42";
        Integer konvertierteZahl = Integer.parseInt(zahlString);
        System.out.println("Konvertierte Zahl aus String: " + konvertierteZahl);
        String zahlString2 = "36";
        Integer konvertierteZahl2 = Integer.parseInt(zahlString2);
        System.out.println("Multiplikation: " +  konvertierteZahl * konvertierteZahl2);

        Boolean istWahr = Boolean.TRUE;
        if(istWahr){
            System.out.println("Die Bedingung ist wahr");
        }

        Character buchstabe = 'A';
        System.out.println("Der Buchstabe ist: " + buchstabe);


    }

}
