import java.util.ArrayList;

public class Kontakten {
    public static void main(String[] args) {
        ArrayList<String> kontakten = new ArrayList<>();
        kontakten.add("Dima");
        kontakten.add("Semen");
        kontakten.add("Artem");
        kontakten.add("Anton");
        kontakten.add("Vova");
        kontakten.add("Mid");
        kontakten.add("Tolya");

        for (int i = 0; i <kontakten.size(); i++) {
            System.out.println(i+1 + ". Kontakt ist: " + kontakten.get(i));
        }
        System.out.println("Ingesamt habe ich " + kontakten.size() + " Kontakten");
    }

}
