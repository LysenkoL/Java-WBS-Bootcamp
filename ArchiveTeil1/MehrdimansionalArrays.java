public class MehrdimansionalArrays {
    public static void main(String[] args) {
        verkaufszahlenVerarbeiten();

    }

    // Methode zur Verarbeitung von Verkaufszahlen verschiedener Produkte
    public static void verkaufszahlenVerarbeiten() { // no usages
        // 2D-Array für Verkaufszahlen: [Produkte][Monate]
        // Jede Zeile steht für ein Produkt und jede Spalte für die Verkaufszahlen in einem Monat
        int[][] verkaufszahlen = {
                {150, 200, 250}, // Produkt 1: Verkäufe in Monat 1, Monat 2, Monat 3
                {90, 129, 180},  // Produkt 2: Verkäufe in Monat 1, Monat 2, Monat 3
                {300, 350, 400}, // Produkt 3: Verkäufe in Monat 1, Monat 2, Monat 3
                {50, 60, 70}     // Produkt 4: Verkäufe in Monat 1, Monat 2, Monat 3
        };
        // Ausgabe der Verkaufszahlen für jedes Produkt
        System.out.println("Verkaufszahlen der Produkte: ");
        for (int i = 0; i < verkaufszahlen.length; i++) {
            int gesamt = 0;
            for (int j = 0; j < verkaufszahlen[i].length; j++) {
                gesamt = gesamt + verkaufszahlen[i][j];
            }
            System.out.printf("Produkt %d: %d Verkäufe%n", (i+1), gesamt );
           // String ausgabe = String.format("Produkt %d: %d Verkäufe%n", (i+1), gesamt);
           // System.out.print(ausgabe);
        }

    }

    }

