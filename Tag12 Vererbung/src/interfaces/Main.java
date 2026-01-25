package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Verwenden des Interfaces
        LKW lkw = new LKW();
        lkw.ladeLastEin("Ein Klavier");
        lkw.fahren();
        lkw.ladeLastEin("Ein Klafünf");
        System.out.println("Wir entladen: " + lkw.ladeLastAus());

        Personenflugzeug personenflugzeug = new Personenflugzeug();
        personenflugzeug.fliegen();

        // Polymorphie mit Interfaces
        ArrayList<KannFahren> meinFuhrpark = new ArrayList<>();
        meinFuhrpark.add(lkw);
        meinFuhrpark.add(new LKW());
        meinFuhrpark.add(new KombiAuto());
        meinFuhrpark.add(new KombiAuto());

        for (KannFahren etwasDasFahrenKann : meinFuhrpark) {
            etwasDasFahrenKann.fahren();

            // einige Objekte sind zwar LKWs, aber in der Liste meinFuhrpark unterscheiden wir diese nicht.
            // Also kann ich hier nur Methoden verwenden, die durch das Interface der Liste festgelegt sind. (KannFahren)
            //etwasDasFahrenKann.ladeLastEin("");
        }
    }
}
