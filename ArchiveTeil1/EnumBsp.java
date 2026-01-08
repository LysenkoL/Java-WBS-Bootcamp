import java.util.Scanner;

public class EnumBsp {
    private SGrad schwierigkeitsgrad; // Aktueller Schwierigskeitgrad der Spielerinstanz

    // Konstruktor der den SG setzt
    public EnumBsp(SGrad schwierigkeitsgrad){
        this.schwierigkeitsgrad = schwierigkeitsgrad;
    }
    //Methode die das Spiel basierend auf den SG startet
    public void spiele(){
        switch (schwierigkeitsgrad){
            case LEICHT:
                System.out.println("Leichter Spiel gestartet. Viel Spaß!");
                break;
            case MITTEL:
                System.out.println("Mittleres Spiel gestartet. Viel Spaß!");
                break;
            case SCHWER:
                System.out.println("Scwereres Spiel gestartet. Viel Spaß!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wähle den Schwierigkeitsgrad aus: ");
        System.out.println("1 - Leicht");
        System.out.println("2 - Mittel");
        System.out.println("3 - Schwer");

        int auswahl = scanner.nextInt();
        SGrad schwierigkeitsgrad;
        switch (auswahl){
            case 1:
                schwierigkeitsgrad = SGrad.LEICHT;
                break;
            case 2:
                schwierigkeitsgrad = SGrad.MITTEL;
                break;
            case 3:
                schwierigkeitsgrad = SGrad.SCHWER;
                break;
            default:
                System.out.println("Ungültige Eingabe. Automatisch Leicht gesetzt");
                schwierigkeitsgrad = SGrad.LEICHT;
                break;
        }

        //Erstellen einer Spielerinstanz mit dem ausgewählten SchwKG und starten das Spiel
        EnumBsp spiel = new EnumBsp(schwierigkeitsgrad); // Erstelle ein neues Spiel mit der gewählten SGrad
        spiel.spiele();//Methode Spiel aufrufen zum Start des Spieles

        scanner.close();
    }

}
