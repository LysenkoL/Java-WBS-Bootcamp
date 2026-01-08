import java.util.ArrayList;
import java.util.List;

public class ListenInJava {
    public static void main(String[] args) {
        ArrayList<String>  einkaufsListe = new ArrayList();
        einkaufsListe.add("Brot");
        einkaufsListe.add("Milch");
        einkaufsListe.add("Wurst");
        einkaufsListe.add("Äpfel");
        System.out.println("Einkaufsliste " + einkaufsListe);

        einkaufsListe.remove("Brot");
        System.out.println("Einkaufsliste " + einkaufsListe);

        if (einkaufsListe.contains("Äpfel")) {
            System.out.println("Äpfel sind auf der Einkaufsliste");
        } else {
            System.out.println("Äpfel sind nicht auf der Einkaufsliste");
        }

        System.out.println("Anzahl der Artikel in der EL: " +  einkaufsListe.size());

        List<String> andereEL = new ArrayList<>();
        andereEL.add("Eier");
        andereEL.add("Käse");

        System.out.println("Andere EL: " + andereEL);

    }
}
