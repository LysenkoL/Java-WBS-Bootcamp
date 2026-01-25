package Aufgabe2.my;

public class Kurs {
    private Integer kursnummer;
    private static int zaehler = 0;
    private static int maxWert;

    private static Kurs [] array;

    public Kurs(Integer x) {
       if
        this.kursnummer = x;
       array.add
       else
           this.kursnummer = this.kursnummer - 1;
    }

    public static ausgabe () {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].kursnummer);
        }
    }

}
