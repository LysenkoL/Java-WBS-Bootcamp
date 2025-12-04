import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben sie die Anzahl der Artikel ein: ");
        int anzahl = scanner.nextInt();
        String[] artikel = new String[anzahl];
        double[] preise = new double[anzahl];

        // Schleife zur Eingabe
        for (int i = 0; i < anzahl; i++) {
            System.out.println("Geben Sie des Namen des Artikels " + (i+1) + " ein: ");
            artikel[i] = scanner.next();
            System.out.println("Geben Sie des Preise für" + artikel[i] + " ein: ");
            preise[i] = scanner.nextDouble();
        }

        System.out.println("Einkaufsübersicht: ");
        for (int i = 0; i < anzahl; i++) {
            System.out.println(artikel[i] + " " + preise[i] + " Euro");
        }
    }
}