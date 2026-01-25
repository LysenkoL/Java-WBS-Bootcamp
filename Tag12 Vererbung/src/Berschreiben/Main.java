package Berschreiben;

import java.lang.Terminator;

public class Main {
    public static void main(String[] args) {
        Robot terminator = new java.lang.Terminator("Bob");
        Robot android = new Android("C-3PO", true);

        System.out.println("Vorstellung der Robots:");
        System.out.println(terminator.name);
        System.out.println(android.name);

        System.out.println("Die Robots sprechen:");
        android.sprechen();
        terminator.sprechen();
    }
}
