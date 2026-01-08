import java.util.Arrays;

public class Abfragestruckturen {
    public static void main(String[] args) {

        int anfrage = 0;
        int maximalAnfragen =5;

        while (anfrage<maximalAnfragen)
        {
            anfrage++;
            System.out.println("Anfrage = " + anfrage + " wurde gesendet");

        }
        System.out.println("Maximal Anzahl an Anfragen erreicht");




        String korrektePasswort = "geheim";
        String eingegebenesPasswort;
        int versuche = 0;
        int maximaleVersuche = 3;


        do {
            eingegebenesPasswort = "falsch";
            versuche++;
            if (eingegebenesPasswort.equals(korrektePasswort)){
                System.out.println("Zugriff gewährt");
                break;
            }
            else {
                System.out.println("Falsches Passwort. Versuch " + versuche + " von " + maximaleVersuche);
            }
        } while(versuche<maximaleVersuche);


    }
}
