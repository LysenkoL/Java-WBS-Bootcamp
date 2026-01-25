public class Main {
    public static void main(String[] args) {
        Warmgetraenk warmgetraenk = new Warmgetraenk();
        warmgetraenk.fuellmenge = 5; // Wiederverwenden von Code -> fuellmenge ist in der Klasse "Warmgetraenk" nicht nochmal definiert
        warmgetraenk.wirdGetrunken(); // Wiederverwendung auch der Methoden

        Getraenk getraenk = new Getraenk();

        // "Mehrgestalt" oder "Polymorphie" -> Ein Objekt vom Typ Warmgetraenk kann sowohl als Warmgetraenk als auch als Getraenk verwendet werden.
        Person person = new Person();
        person.trinken(getraenk);
        person.trinken(warmgetraenk); // Ein "Warmgetraenk" IST AUCH ein "Getraenk".

        // Vererbungsrichtung muss bei den Typen beachtet werden
        Getraenk irgendeinGetraenk = new Warmgetraenk();
        //Warmgetraenk fehler = new Getraenk(); // Nicht speziell genug. Es fehlt z.B. das Attribut "aufwaermzeit".

        // ... und ansonsten muessen wir uns natuerlich an Typen halten.
        Nahrung nahrung = new Nahrung();
        //person.trinken(nahrung); // Typ-Fehler


        // ueberblick ueber Spezialisierungen behalten:
        boolean istDasObjektVomTypGetraenk = warmgetraenk instanceof Getraenk;
        System.out.println(istDasObjektVomTypGetraenk);
        boolean istDasObjektVomTypWarmgetraenk = getraenk instanceof Warmgetraenk;
        System.out.println(istDasObjektVomTypWarmgetraenk);
    }
}