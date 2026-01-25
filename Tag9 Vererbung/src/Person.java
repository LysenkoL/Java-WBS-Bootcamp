public class Person {

    // Parameter "getraenk" ist vom Typ "Getraenk", d.h. Person hat eine Abhaengigkeit nach Getraenk.
    // Der Parameter akzeptiert alle spezielleren Typen von Getraenk, also auch ein Warmgetraenk.
    public void trinken(Getraenk getraenk) {
        if (getraenk instanceof Warmgetraenk) {
            System.out.println("Achtung heiß... einmal pusten bitte...");
        }

        getraenk.wirdGetrunken();
    }
}
