import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto ( "Audi", "A4",  2008);
        Auto auto2 = new Auto ( "VW",  "Jetta",  2018);
        Auto auto3 = new Auto ( "Mitsubishi",  "Outlander",  2023);

        auto1.zeigeInfos();
        auto2.zeigeInfos();
        auto3.zeigeInfos();

        auto1.zeigeInfos();
        auto1.setBaujahr(2010);
        auto1.zeigeInfos();
        int baujahr = auto1.getBaujahr();
        System.out.println("Das aktuelle Baujahr ist " + baujahr);

        //############ Tag 5 Prüfen
        auto1.setMarke("Opel");
        auto1.setModell("Unbekannt");
        System.out.println("Das steht jeztt in der Marke: " + auto1.getMarke());
        System.out.println("Das steht jeztt als Modell: " + auto1.getModell());

        System.out.println("Das Auto ist " + auto1.berechneAlter(2025) + " Jahre alt");

        System.out.println("Ist das Auto noch neu? " +  auto1.istNeu(2025));
        System.out.println("Ist das Auto noch neu? " +  auto2.istNeu(2025));
        System.out.println("Ist das Auto noch neu? " +  auto3.istNeu(2025));



        Buch buch1 = new Buch("java", "R.Müller", 549, "Fachbuch", true, 4.5);

        buch1.zeigeInfo();



    }
}

