import fuhrpark.Auto;
import fuhrpark.AutoLackierer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> fuhrpark = new ArrayList<>();
        fuhrpark.add(new Auto(50));
        fuhrpark.add(new Auto(30));
        fuhrpark.add(new Auto(20));

        // Simulation
        for (Auto auto : fuhrpark) {
            System.out.println("Auto fährt 2 Stunden:");
            System.out.println(auto.getZurückgelegteStreckeKm());
            auto.eineStundeFahren();
            System.out.println(auto.getZurückgelegteStreckeKm());
            auto.eineStundeFahren();
            System.out.println(auto.getZurückgelegteStreckeKm());
        }

        // Auf der Strecke wird das erste Fahrzeug vom Fuhrpark zur Kontrolle angehalten.
        fuhrpark.get(0).setGeschwindigkeitKmH(0);

        for (Auto auto : fuhrpark) {
            System.out.println("Eine weitere Stunde vergeht:");
            System.out.println(auto.getZurückgelegteStreckeKm());
            auto.eineStundeFahren();
            System.out.println(auto.getZurückgelegteStreckeKm());
        }

        //----------------------------------------------------------------------------
        // Beispiel für package private
        AutoLackierer lackierer = new AutoLackierer();
        lackierer.lackiereAuto(fuhrpark.get(0), "Grün"); // Über die öffentliche Methode vom AutoLackierer haben wir Zugriff auf die Lackfarbe
        // fuhrpark.get(0).lackfarbe // Java-Fehler: Außerhalb vom Paket "fuhrpark" können wir auf Auto.lackfarbe nicht zugreifen.
    }
}