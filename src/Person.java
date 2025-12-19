 public class Person {
    // Attribute für die Person-Klasse
    private String name;
    private int alter;
    private String adresse;

    // Konstruktor
    public Person(String name, int alter, String adresse){
        this.name = name;
        this.alter = alter;
        this.adresse = adresse;
    }

    // Methode zur Darstellung der Person mit Platzhalter
    public String beschreibung(){
        return String.format("Name: %s, Alter: %d, Adresse: %s", name, alter, adresse);
    }
}{
}
