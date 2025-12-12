import java.util.ArrayList;

public class ListenInJava {
    public static void main(String[] args) {
        ArrayList<String>  einkaufsListe = new ArrayList();
        einkaufsListe.add("Brot");
        einkaufsListe.add("Milch");
        einkaufsListe.add("Wurst");
        einkaufsListe.add("Welt");
        System.out.println("Einkaufsliste " + einkaufsListe);

        einkaufsListe.remove("Brot");
        System.out.println("Einkaufsliste " + einkaufsListe);
    }
}
