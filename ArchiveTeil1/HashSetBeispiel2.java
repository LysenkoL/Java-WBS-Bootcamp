import java.util.HashSet;
import java.util.Set;

public class HashSetBeispiel2 {
    public static void main(String[] args) {
        // HashSet ist eine Implementierung der Set-Schnittstelle, Sammlung von einzigartigen Elementen.
        // Erlaubt keine Duplikate
        // Grundlegende Operationen für Mengen
        // Hauptunterschied zwischen Set und HashSet ist, dass Set eine abstrakte Datenstruktur ist,
        // die die grundlegenden Eigenschaften und Methoden für Mengen beschreibt, während HashSet
        // die spezifische Implementierung dieser Eigenschaften bereitstellt.

        HashSet<String> farben = new HashSet<>();

        farben.add("Rot");
        farben.add("Blau");
        farben.add("Grün");
        farben.add("Gelb");

        //Versuche ein Dublikat hinzufügen

        farben.add("Rot");

        System.out.println(farben);

        Set<Integer> lottozahlen = new HashSet<>();
    }
}
