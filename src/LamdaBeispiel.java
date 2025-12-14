import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LamdaBeispiel {
    public static void main(String[] args) {
        List<String> elemente = new ArrayList<>();
        elemente.add("A");
        elemente.add("B");
        elemente.add("C");
        elemente.add("D");
        elemente.add("E");

        System.out.println("Ursprüngliche Liste: " + elemente);
        List<Integer> indizesEntfernen = new ArrayList<>();
        indizesEntfernen.add(1);
        indizesEntfernen.add(3);


      // Ausgeb => [1, 3] Umdrehen => [3, 1]

        indizesEntfernen.sort((a, b) -> b - a); // Ergebnis: [3, 1] Lambda Abfrage

        System.out.println("Sortierte Indizes (absteigend): " + indizesEntfernen); // Вывод: [3, 1]

    }
}

