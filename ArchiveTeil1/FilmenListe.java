import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class FilmenListe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> filmeListe = new HashSet<String>();
        System.out.println("Geben Sie bitte den Namen Ihren Lieblingsfilmen ein: ");

        while(filmeListe.size()<5){
            String antwort = sc.nextLine();
            filmeListe.add(antwort);
        }

        ArrayList<String> Filmen = new ArrayList<String>(filmeListe);
        for (int i = 0; i < Filmen.size(); i++) {
            System.out.println("Deine " + (i+1) + ". Film ist: " + Filmen.get(i));
        }
        System.out.println("Welche Film gefällt Ihnen am besten in dieser Liste? ");
        String best = sc.nextLine();

        if(Filmen.contains(best)){
            System.out.println("Diese Film ist in deiner Liste");
        } else {
            System.out.println("Diese Film steht in deiner Liste noch nicht!");
        }
        sc.close();
    }
}


