import java.util.Scanner;
import java.io.File;// die File-Lasse für den Umgang mit Dateien
import java.io.FileNotFoundException;// Umgang mit Fehlern mit Dateien
import java.io.PrintWriter;// Das wir in Dateien Schreiben können
import java.util.InputMismatchException; // Für ungültige Eingaben

public class TryCatchBeispiel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Beispiel 1: Division durch Null
        try{
            System.out.print("Bitte geben Sie die erste Zahl für Division ein: ");
            int a = scanner.nextInt();
            System.out.print("Bitte geben Sie die zweite Zahl für Divison ein: ");
            int b = scanner.nextInt();
            int result = divide(a,b);
            System.out.println("Das ergebnis der Division ist: " + result);
        }catch (ArithmeticException e){
            // Dieser Block wird Ausgeführt wenn die Eingabe b = 0 ist
            System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
        }catch (InputMismatchException e){
            // Wenn die Eingabe keine Zahl ist, Buchstaben oder Sonderzeichen
            System.out.println("Fehler: Bitte geben sie eine gültige ganze Zahl ein.");
        }finally {
            // Der finally-Block wird immer ausgeführt, unabhängig davon ob eine Ausnahme aufgetreten ist.
            // Bestandteil der Ausnahmebehandlung in Java, der im zusammenhang mit Try Catch verwendet wird.
            // Wird verwendet wenn was Aufgeräumt oder geschlossen werden soll.
            // Er kann Resorsen Schließen wie Dateien oder Datenbanken.
            // Ist entscheident damit keine Speicherlecks entstehen.
            scanner.nextLine(); // Leeren den Eingabepuffer
        }

        // Beispiel 2: Datei lesen
        try{
            System.out.print("Bitte geben Sie den Dateinamrn ein, den sie lesen möchten: ");
            String fileName = scanner.nextLine();

            File file = new File(fileName);// Erstelle ein File-Objekt für die angegebene Datei
            Scanner fileScanner = new Scanner(file);// Erstellt einen Scanner für die Datei

            // Lliest den Inhalt der Datei Zeile für Zeile
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        }catch (FileNotFoundException e){
            // Der Block wird Ausgeführt wenn die Datei nicht gefunden wird
            System.out.println("Fehler: Die Datei wurde nicht gefunden.");
        }catch (InputMismatchException e){
            // Wenn die Eingabe keine gültige Datei ist.
            System.out.println("Fehler: Bitte geben Sie einen gültigen Dateinamen ein.");
        }

        //Beispiel 3: Schreiben in eine Datei
        try {
            System.out.print("Bitte geben Sie den Datainamen ein, in dem Sie schreiben möchten: ");
            String outpuFileName = scanner.nextLine();

            PrintWriter writer = new PrintWriter(outpuFileName);
            System.out.print("Bitte geben sie den Text ein, den sie in die Datei schreiben möchten: ");
            String textToWrite = scanner.nextLine();

            writer.println(textToWrite);// Schreibt den Text in die Datei
            writer.close();
            System.out.println("Text wurde erfolgreich in die Datei geschrieben.");
        }catch (FileNotFoundException e){
            System.out.println("Fehler: Die Datei konnte nicht erstellt oder gefunden werden.");
        }catch (InputMismatchException e){
            System.out.println("Fehler: Bitte geben sie einen gültigen Text ein.");
            // Sonderzeichen aus der Programmierung
        }


    }
    // Methode zu Durchführen der Division
    public static int divide(int x, int y){
        return x / y;
    }
}
