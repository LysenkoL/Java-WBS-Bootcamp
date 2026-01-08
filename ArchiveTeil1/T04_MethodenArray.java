import java.util.Scanner;

public class T04_MethodenArray {
    /*
      Aufgabe 1: Gibt eine persönliche Begrüßung aus.
      text Name, der begrüßt werden soll.
     */

    public static void personBegruesung (String text)
    {
        System.out.println("Hallo " + text + "!");
    }

    /*
      Aufgabe 2: Gibt die größere von zwei Ganzzahlen zurück.
     return größere Zahl (a oder b).
     */

    public static int findeGrosser (int a, int b)
    {
        // Prüft, ob a größer als b ist.
        if (a>b) return a;
        // Gibt b zurück, falls a kleiner oder gleich b ist
        return b;
    }

    /*
     Aufgabe 3: Überprüft, ob eine Zahl gerade oder ungerade ist.
     return text "gerade" oder "ungerade".
     */

    public static String geradeOderNein(int a)
    {
        // Modulo-Prüfung auf Rest 0 (gerade Zahl).
        if (a%2==0) return "gerade";
            // Wenn nicht gerade, dann ungerade.
        else return "ungerade";
    }

    /*
     Aufgabe 4: Berechnet die Summe aller Zahlen in einem Array.
     return berechnete Summe.
     */

    public static int summeArr (int zahlen [])
    {
        int summe = 0;
        // for-Schleife zur Summierung alle Array-Elemente.
        for (int i = 0; i < zahlen.length; i++)
        {
            summe=summe + zahlen[i];
        }
        return summe;
    }

    public static void main(String[] args) {

        // Test der Methode 1
        personBegruesung("Lena");

        // Test der Methode 2
        System.out.println("Die Zahl " + findeGrosser(7,3) + " ist grosser!");

        // Test der Methode 3
        System.out.println("Die Zahl ist " + geradeOderNein(13));

        //  (Aufgabe 4) ---
        System.out.println("Geben Sie bitte wie viele Zahl Ihr arr haben soll? ");

        // Initialisierung des Scanner-Objekts.
        Scanner scanner = new Scanner(System.in);

        // Liest die Array-Größe vom User.
        int anzahl = scanner.nextInt();

        // Erstellt das Array mit eingegebenen Größe.
        int[] meineZahlen = new int[anzahl];

        // Füllt das Array in einer Schleife mit Benutzer-Eingaben.
        for (int i = 0; i < anzahl; i++)
        {
            System.out.println("Geben Sie bitte " + (i+1) + " Zahl ein");
            meineZahlen[i] = scanner.nextInt();
        }

        // Ruft die Summierungs-Methode auf und gibt das Ergebnis aus.
        System.out.println("Summe in dieser Arr ist " +  summeArr(meineZahlen));

        // Schließt den Scanner (wichtig für die Freigabe der Systemressourcen).
        scanner.close();
    }
}
