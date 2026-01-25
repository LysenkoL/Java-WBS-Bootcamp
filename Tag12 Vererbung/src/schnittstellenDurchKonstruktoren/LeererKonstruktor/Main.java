package schnittstellenDurchKonstruktoren.LeererKonstruktor;

public class Main {
    public static void main(String[] args) {
        Pflanze pflanze = new Baum("an Land");
    }
}

class Pflanze {
    protected String woWachseIch = "überall";

    public Pflanze(String woWachseIch) {
        this.woWachseIch = woWachseIch;
    }

    // "Konstruktorüberladung"
    public Pflanze() { // Alternativer Konstruktor für Pflanze. Beide Varianten (mit und ohne woWachseIch Parameter) sind jetzt erlaubt.
        //der Standardwert von woWachseIch bleibt
    }
}

class Baum extends Pflanze {
    public Baum(String woWachseIch) {
        //super(woWachseIch); // Möglichkeit 1
        //super(); // Möglichkeit 2
        // Möglichkeit 3: Keinen super-Konstruktor hinschreiben, weil Pflanze einen leeren Konstruktor hat, der dann automatische genutzt wird

        super.woWachseIch = woWachseIch; // so oder so: wir können natürlich auch anders die Werte manipulieren
    }
}

/*
* Fürs Verständnis: Wenn wir den Konstruktor einer Kind-Klasse benutzen, müssen wir sicherstellen,
* dass die öffentliche Schnittstelle von der Eltern-Klasse eingehalten wird.
* Also: Wir müssen irgendwie einen der erlaubten Konstruktoren verwenden.
* */