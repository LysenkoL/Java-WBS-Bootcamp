import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WorterAusText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> text = new HashSet<String>();

        System.out.println("Bitte geben Sie einen Text ein. Um Programm zu beenden schreiben Sie exit!");

            while (true) {
            String wort = sc.next();
            wort = wort.toLowerCase();
            if (wort.equals("exit")) break;
            text.add(wort);
        }

        System.out.println("Ingesamt haben Sie " + text.size() + " verschiedene Wörter eingegeben!");

        sc.close();
    }
}
