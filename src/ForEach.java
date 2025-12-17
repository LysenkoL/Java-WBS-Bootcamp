import java.util.ArrayList;
import java.util.HashSet;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> fruechteListe = new ArrayList<>();
        fruechteListe.add("Apfel");
        fruechteListe.add("Banane");
        fruechteListe.add("Orange");

        //Verwendung einer herkömmlichen for-Schleife zur Itteration über die ArrayList
        System.out.println("Inhalt der ArrayList mit for Schleife: ");
        for (int i = 0; i < fruechteListe.size(); i++) {
            String frucht = fruechteListe.get(i);
            System.out.println(frucht);
        }

        // Verwendund forEach-Methode zur Itteration über die ArryaList
        // Kürzer und lesbarer Code, Funktionale  Programmierung und Klarheit
        System.out.println("Inhalt der ArrayListe mit forEach - Methode: ");
        fruechteListe.forEach(frucht -> {
           /*
         * Die Runden Klammern sind notwendig, um die Parameterliste des Lambda-Ausdruck zu definieren.
         * In diesem Fall ist "frucht" der einzige Parameter.
         * Wenn der Lambda-Ausdruck nur ein Parameter hat, können die Klammern weggelassen werden, das
         * bedeutet das der Ausdruck auch so geschrieben werden könnte:
         * forEach(frucht -> System.out.println(frucht));
         * Besser ist es wegen der Lesbarkeit sie zu setzen.
         * Mehrere Parameter: (a,b) -> a+b
         * wenn keine Parameter vorhanden ist müssen leere rund Klammern verwenden werden:
         * () -> System.out.println("Keine Parameter");
            */
            System.out.println(frucht);


        });

        HashSet<String> set = new HashSet<>();
        set.add("Kiwi");
        set.add("Mango");
        set.add("Ananas");

        System.out.println("Inhalt des Hashsets mit For-Each Methode: ");
        set.forEach(frucht ->{
            System.out.println(frucht);
        });



    }

}
