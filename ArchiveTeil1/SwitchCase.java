import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args)
    {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Wählen Sie eine Zahl von 1 bis 3: ");
        System.out.println("1-Hund");
        System.out.println("2-Katze");
        System.out.println("3-Vogel");
        System.out.println("Ihre Wahl");

        int wahl = scanner.nextInt();

        switch (wahl)
        {
            case 1:
                System.out.println("Sie haben einen Hund gewählt.");
                break;
            case 2:
                System.out.println("Sie haben eine Katze gewählt.");
                break;
            case 3:
                System.out.println("Sie haben einen Vogel gewählt.");
                break;
            default:
                System.out.println("Ungültige Auswahl.");
                break;
        }


        scanner.close();
    }
}
