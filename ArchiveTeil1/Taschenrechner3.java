 import java.util.Scanner;
public class Taschenrechner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rechner rechner = new Rechner();
        boolean weiterRechnen = true;

        while (weiterRechnen) {
            System.out.print("Gib bitte die erste Zahl ein: ");
            double zahl1 = scanner.nextDouble();

            System.out.print("Wähle die Operation (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Gib bitte die zweite Zahl ein: ");
            double zahl2 = scanner.nextDouble();

            if (operator == '/') {
                while (zahl2 == 0) {
                    System.out.println("Man darf  durch 0 nicht teilen.");
                    zahl2 = scanner.nextDouble();
                }
            }

            try {
                double ergebnis = rechner.berechne(zahl1, zahl2, operator);
                System.out.println("Ergebnis: " + ergebnis);
            } catch(ArithmeticException | IllegalArgumentException e){
                System.out.println("Fehler: " + e.getMessage());
            }

            System.out.print("Weiterrechnen? (ja/nein): ");
            String antwort = scanner.next();
            if (antwort.equalsIgnoreCase("nein")){
                weiterRechnen = false;
            }

        }
        scanner.close();
        System.out.println("Programm beendet. Auf Wiedersehen!");
    }
}