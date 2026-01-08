/*
Aufgabe 1: Einfache Verwendung der Integer Wrapper-Klasse
Aufgabe: Erstelle eine Integer-Variable, setze sie auf den Wert 42 und gib diesen Wert in der
Konsole aus.
Aufgabe 2: Autoboxing und Unboxing
Aufgabe: Deklariere eine primitive int-Variable mit dem Wert 10. Wandle sie in eine Integer
Variable um (Autoboxing) und gib den Wert der Integer-Variable aus. Wandle die Integer-Variable
wieder in einen int zurück (Unboxing) und gib diesen Wert ebenfalls aus.
Aufgabe 3: Konvertierung zwischen String und Wrapper-Klasse
Aufgabe: Erstelle einen String mit dem Wert "12345". Wandle diesen String in eine Integer
Variable um. Überprüfe, ob die Zahl gerade oder ungerade ist, und gib eine entsprechende
Nachricht in der Konsole aus. Achte darauf, dass du eine Ausnahmebehandlung für den Fall
einfügst, dass die Konvertierung fehlschlägt.
Aufgabe 4: Verwendung von Wrapper-Klassen in einer ArrayList
Aufgabe: Erstelle eine ArrayList von Integer-Objekten und füge die Zahlen 1 bis 5 hinzu.
Berechne die Summe aller Zahlen in der Liste und gib das Ergebnis in der Konsole aus.
Verwende dabei die Wrapper-Klasse Integer und eine Schleife.
 */


import java.util.ArrayList;

public class Tag8Wrapper {
    public static void main(String[] args) {
        //#####################################
        Integer myWert = 42;
        System.out.println("Ich habe Integer Wert " + myWert + " gegeben");

//################################
        int nurInt = 10;
        Integer boxInt = nurInt;
        int primitivNeu = boxInt;
        System.out.println(primitivNeu);

//#############################
        String text = "12345";
        try {
            int zahl = Integer.parseInt(text);
            if(zahl%2 == 0)
                System.out.println("Deine Zahl " + zahl +  " ist gerade");
            else
                System.out.println("Deine Zahl " + zahl + " ist ungerade");
        }
        catch(NumberFormatException e){
            System.out.println("Fehler bei der Konvertierung");
        }

//###########################
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        int summe =0;

        for (int i = 0; i < myList.size(); i++) {
            summe = summe + myList.get(i);
        }
        System.out.println("Summe: " + summe);

    }
}
