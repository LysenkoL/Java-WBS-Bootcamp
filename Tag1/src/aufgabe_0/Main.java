/* Level 1
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * string "titel", int "dauerSekunden", string "interpret"
 * passenden Getter und Setter für die Attribute
 * und der Methode "spielen", die auf der Konsole alle Informationen über den Song ausgibt (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
 *
 * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
 * Erstellen Sie außerdem ein UML Klassendiagramm für die Klasse "Song".
 */


package aufgabe_0;

public class Main {
    public static void main(String[] args) {

        Song mySong = new Song();
        mySong.setTitel("Shape of my heart");
        mySong.setDauerSekunden(456);
        mySong.setInterpret("Sting");

        mySong.spielen();
    }
}