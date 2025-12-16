public class NotenBeispiel {
    public static void main(String[] args) {
        // 3D-Array erstellen
        // 4 Klassen, 4 Schüler pro Klasse, 3 Fächer
        int[][][] noten = {
                { // Klasse 1
                        {85, 90, 78}, // Schüler 1 in Klasse 1: Mathe, Englisch, Bio
                        {87, 76, 90}, // Schüler 2 in Klasse 1: Mathe, Englisch, Bio
                        {92, 85, 82}, // Schüler 3 in Klasse 1: Mathe, Englisch, Bio
                        {75, 80, 82}  // Schüler 4 in Klasse 1: Mathe, Englisch, Bio
                },
                { // Klasse 2
                        {85, 98, 78}, // Schüler 1 in Klasse 2: Mathe, Englisch, Bio
                        {78, 82, 84}, // Schüler 2 in Klasse 2: Mathe, Englisch, Bio
                        {91, 89, 88}, // Schüler 3 in Klasse 2: Mathe, Englisch, Bio
                        {88, 78, 91}  // Schüler 1 in Klasse 2: Mathe, Englisch, Bio
                },
                { // Klasse 3
                        {72, 75, 95}, // Schüler 1 in Klasse 3: Mathe, Englisch, Bio
                        {81, 93, 70}, // Schüler 2 in Klasse 3: Mathe, Englisch, Bio
                        {96, 79, 88}, // Schüler 3 in Klasse 3: Mathe, Englisch, Bio
                        {70, 85, 90}  // Schüler 4 in Klasse 3: Mathe, Englisch, Bio
                },
                { // Klasse 4
                        {99, 81, 74}, // Schüler 1 in Klasse 4: Mathe, Englisch, Bio
                        {77, 94, 86}, // Schüler 2 in Klasse 4: Mathe, Englisch, Bio
                        {83, 71, 92}, // Schüler 3 in Klasse 4: Mathe, Englisch, Bio
                        {90, 88, 79}  // Schüler 4 in Klasse 4: Mathe, Englisch, Bio
                }
        };
        System.out.println("Noten der Schüler: ");
        for (int i = 0; i < noten.length; i++) {
            System.out.printf("Klasse %d%n", (i+1));
            for (int j = 0; j < noten[i].length; j++) {
                System.out.printf("Schüler %d: ", (j+1));
                for (int k = 0; k < noten[i][j].length; k++) {
                    System.out.printf("%d ", noten[i][j][k]);

                }
                System.out.println();
            }
            System.out.println();
        }
        //Schleife über die Noten zum Ausgeben in 1 bis 6
        for (int i = 0; i < noten.length; i++) {
            System.out.printf("Klasse %d: %n", (i+1));
            for (int j = 0; j < noten[i].length; j++) {
                System.out.printf("Schüler %d: ", (j+1));
                for (int k = 0; k < noten[i][j].length; k++) {
                    //Umwandlung der Prozente in Noten
                    int note = berechneNoten(noten[i][j][k]);
                    System.out.printf("%d ", note);
                }
                System.out.println();
            }
            System.out.println();
        }
    }



    // Methode zur Berechnung der Noten aus Prozentwerten
    public static int berechneNoten(int prozent) { // no usages
        if(prozent >= 90) {
            return 1; // Note 1
        } else if(prozent >= 80) {
            return 2;
        } else if(prozent >= 70) {
            return 3;
        } else if(prozent >= 60) {
            return 4;
        } else if(prozent >= 50) {
            return 5;
        } else {
            return 6;
        }
    }
}



