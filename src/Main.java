import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto ( "Audi", "A4",  2008);
        Auto auto2 = new Auto ( "VW",  "Jetta",  2018);
        Auto auto3 = new Auto ( "Mitsubishi",  "Outlander",  2022);

        auto1.zeigeInfos();
        auto2.zeigeInfos();
        auto3.zeigeInfos();

        auto1.zeigeInfos();
        auto1.setBaujahr(2010);
        auto1.zeigeInfos();

        int baujahr = auto1.getBaujahr();
        System.out.println("Das aktuelle Baujahr ist " + baujahr);
    }
}

