import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamensEingabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> namen = new ArrayList<>();
        System.out.println("Bitte geben Sie den Namen ein: ");
        while (true) {
            String name = scanner.nextLine();
            if(namen.equals("fertig")) {
                break;
            }
            namen.add(name);

        }
        System.out.println("Alle eingegebene Namen: ");
            for (int i = 0; i < namen.size() ; i++) {
                String name = namen.get (i);
                System.out.println(namen);

        }
        System.out.print("\n\nMöchten Sie Namen die mit einem bestimmten Buchstaben beginnen anzeigen? (j/n): ");
        String antwort = scanner.nextLine();

        if(antwort.equals("j")){
            System.out.print("Bitte geben Sie den Buchstaben ein: ");
            char buchstabe = scanner.nextLine().charAt(0);
            System.out.println("\nNamen, die mit '" + buchstabe + "' beginnen:");

            for (int i = 0; i <namen.size() ; i++) {
                String name = namen.get(i);
                if(name.charAt(0)==buchstabe) {
                    System.out.println(namen);}
            }
            }
    }
}
