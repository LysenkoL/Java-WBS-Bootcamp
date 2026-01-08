import java.io.*;// Importieren der Klassen für Ein- und Ausgabe, einschließlich BufferedReader und BufferedWriter
import java.util.ArrayList;
import java.util.List; // Die List-Schnittstelle Importieren

public class ToDoListe {
    private List<ToDoElement> elemente;  // Liste, die alle To-Do-Elemente speichert.
    private final String dateiname = "todo.txt"; // final ist das Schlüsselwort wenn man den Inhalt nicht mehr ändern soll.

    // Konstruktor
    public ToDoListe(){
        elemente = new ArrayList<>(); // Initialisieren der ArrayList, um To-Do-Elemente zu speichern
        lade(); // Laden der Aufgaben aus der Datei, wenn die Liste erstellt wird.
    }

    // Methode zum Hinzufügen eines To-Do-Elements zur Liste
    public void fuegeElementHinzu(String aufgabe){
        elemente.add(new ToDoElement(aufgabe)); // Neues To-Do-Element mit der Übergebenen Aufgabe zur Liste hinzufügen
    }

    // Methode zum Entfernen eines To-Do-Elements anhand des Index
    public void entferneElement(int index){
        if(index >= 0 && index < elemente.size()){ // Überprüft, ob der Index gültig ist, innerhalb der Liste
            elemente.remove(index); // Element an dem angebenen Index aus der Liste entfernen
        }
    }

    // Methode zum Enfernen aller To-Do-Elmente
    public void entferneAlleElmente(){
        elemente.clear();// Alle Elemente aus der Liste entfernen, nützlich um die gesamnte Liste zu löschen.
    }

    /* Beispiel für Autoboxing
    public void beispielAutoboxing(){
         Hier wird eine neue ArrayList erstelt vom Typ Integer. ArrayList kann nur Objekte enthalten, daher
        müssen prmitive Datentypen in ihre entsprechenden Wrapper-Klassen umgewandelt werden

        List<Integer> liste = new ArrayList<>();
        // Primitive Datentypen wie int sind einfache Werte und benötigen keine zusätzlichen Speicher für Metadaten
        int zahl = 10;
        Wenn wir die primitive int-Variable zur Liste hinzufügen wollen, geschied Folgendes:
        JAVA führt eine automatische umwandlung durch, die als Autoboxing bezeichnet wird.
        Dabei wird der primitive Wert 'zahl' in ein Integer-Objekt umgewandelt,
        weil die ArrayList nur Objekte Speichern kann, jedoch keine primitiven Datentypen.

        liste.add(zahl); // Hier wird Autoboxing durchgeführt, automatisch wird er in ein Integer gewandelt.
    }*/

    // Methode zum Enfernen mehrerer To-Do-Elemente anhand einer Liste Indizes
    public void entferneMehrereElemente(List<Integer> indizes){
        /* 'indizes' ist eine Liste von Integer-Werten, die die Position der To-Do-Elemente in der Hauptliste
        repräsentiert. Eine Liste ermöglicht es uns mehrere Werte zu Speichern und einfach darauf zuzugreifen.
        In Java ist 'List' ein Interface, das eine Sammlung von Elementen definiert, die in einer bestimmten Reihenfolge
        angeordnet sind. Wir können Elemente hinzufügen, entfernen und auf sie zugreifen, indem wir ihre Position
        (Index) verwenden.
        Wir benutzen die sort-Methode und rifen diese auf um die Liste in richtiger Reuihenfolge zu Sortieren in
        absteigender Reihenfolge.
        Der Comperator wird hier durch einen Lambda-Ausdruck bereitgestellt.
        (a, b) -> b - a ist ein Lambda Ausdruck, der zwei Parameter (a,b) annimmt.
        Diese Parameter repräsentieren zwei Indizes die verglichen wreden.
        Der Ausdruck b - a gibt eine positive Zahl zurück, wenn b größer als a ist,
        eine negative Zahl, wenn a größer als b ist, und 0, wenn sie gleich sind.
        Dadurch wird die Liste in absteigender Reihenfolge sortiert, was für das Entfernen der Elemente notwendig ist.
         */
        indizes.sort((a,b) -> b -a); // Sortiert die liste der Indizes in absteigender Reihenfolge.
        // Durchlaufe die sortierte Liste
        for(int i = 0; i < indizes.size(); i++){
            /*Hier wird Unboxing durchgeführt: der Integer-Wert der an der Position i in der Liste steht
            wird hier in einen Primitiven int umgewandelt, um die Methode 'enferneElement' aufzurufen, die einen
            primitiven int  erwartet.
             */
            int index = indizes.get(i);
            // Entferne jedes Element an den angegebenen Indizes.
            entferneElement(index);
        }
    }

    // Methode zum ändern eines To-Do-Elements
    public void aendereElement(int index, String neueAufgabe){
        if(index >= 0 && index < elemente.size()){
            elemente.get(index).setAufgabe(neueAufgabe);// Die Aufgabe des Elemnts mit dem angegebenen Index ändern.
        }
    }

    // Methode zum anzeigen der To-Do-Liste
    public List<ToDoElement> getElemente(){
        return elemente;// Rückgabe der Liste der To-Do-Elemente
    }

    // Methode zum Speicher als txt der Datei
    public void speichere(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(dateiname))) {// BufferWriter zum schreiben in die Datei
            for(int i = 0; i < elemente.size(); i++){
                writer.write(elemente.get(i).getAufgabe());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Fehler beim Speichern der Datei: " + e.getMessage());
        }
    }

    // Methode zum Lesen der To-Do-Elemente in der txt Datei
    public void lade(){
        try(BufferedReader reader = new BufferedReader(new FileReader(dateiname))){
            String zeile;// Variable zum Speichern der gelesene Zeile
            while ((zeile = reader.readLine()) != null){ // Solange es Zeilen gibt.
                fuegeElementHinzu(zeile);// Jede gelesene Zeile als neues To-Do-Element zur Liste hinzufügen
            }
        }catch (IOException e){
            System.out.println("Fehler beim Laden der Datei: " + e.getMessage());
        }
    }
}
