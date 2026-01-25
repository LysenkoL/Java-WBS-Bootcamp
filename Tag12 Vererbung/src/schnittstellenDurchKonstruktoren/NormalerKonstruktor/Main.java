package schnittstellenDurchKonstruktoren.NormalerKonstruktor;

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
}

class Baum extends Pflanze {
    public Baum(String woWachseIch) {
        super(woWachseIch);
        // super.woWachseIch = woWachseIch; // unnötig, weil wir dafür den super-Konstruktor benutzen wollen
    }
}