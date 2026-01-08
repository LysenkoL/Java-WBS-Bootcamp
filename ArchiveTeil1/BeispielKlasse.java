/* public => ist öffentlich
die Klasse von anderen Klassen in dem selben Paket verwendet werden kann
Der Zweck der Verwendung von 'public' ist es, eine API (Application Programming Interface)
zu schaffen, die von anderen Entwickler genutzt werden kann
*/
public class BeispielKlasse {
    // Eine private Variable, die nur innerhalb dieser Klasse sichtbar ist.
    // => bedeutet das diese Variable nicht von außen zugänglich ist.
    // Der Zweck von 'private' ist es, die Kapselung zu fördern, sodass die Implementierungsdetails
    // der Klasse verborgen bleiben und nur über öffentliche Methoden (Getter/Setter) darauf zugegriffen werden kann.
    private int zahl;

    // Konstruktoren haben den gleichen Namen wie die Klasse und keinen Rückgabewert.
    // Hier wird 'public' verwendet, damit der Konstruktor von anderen Klassen aufgerufen werden kann.
    // Der Zweck ist es, Objekte der Klasse zu erstellen und initialisieren.
    public BeispielKlasse(int zahl) {
        this.zahl = zahl; // Setzt die private Variable 'zahl' auf den übergebenen Wert.
    }

    // 'static' bedeutet das diese Methode zur Klasse selbst gehört und nicht zu einer Instanz der Klasse.
    // Sie kann aufgerufen werden ohne ein Objekt der Klasse zu erstellen.
    //Zweck ist es Utility-Methoden oder Konstanten zu definieren, die unabhängig von einer bestimmten
    //Instanz der Klasse ist.

    public static void zeigeZahl(){
        // Methode getZahl aufrufen, die nicht statisch ist (static).
        // Eine statische Methode kann keine nicht-statischen Variablen oder Methode direkt zugreifen.
        // Daher wird hier ein instanz der Klasse benötigt, um auf die nicht-statische Methode zuzugreifen.
        BeispielKlasse beispiel = new BeispielKlasse(10);
        System.out.println("Die Zahl ist: " + beispiel.getZahl());
    }

    // Eine geschützte Methode, die von Klassen im selben Paket oder abgeleiteten Klassen
    // (Unterklassen) verwendet werden kann, auch wenn sie sich in einem anderen Paket befindet.
    // Der Zweck von 'protectet' ist es, eine gewisse Flxibilität zu bieten,
    // indem man die Sichtbarkeit aus Subklassen einschränkt, während man gleichzeitig den
    // Zugriff innerhalb des Pakets ermöglicht.
    protected int getZahl(){
        return zahl;
    }

    // Methode die keinen Rückgabewert hat.
    // 'void' bedeutet das diese Methode nichts zurückgibt, wenn sie aufgerufen wird.
    // Der Zweck von 'void' is Methoden zu definieren, die eine bestimmte Aktion ausführen,
    // aber keine Daten zurückgeben, z.B. das Setzen von Werten oder das Drucken von Ausgeben.
    public void setZahlen(int zahl){
        this.zahl = zahl; // Setzt die private Variable 'zahl' auf den übergebenen Wert
    }


}
