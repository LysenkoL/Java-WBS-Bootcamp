public class Main {
    public static void main(String[] args) {

        GetraenkeAutomat automat = new GetraenkeAutomat();
        Person person = new Person();

        automat.neuAuffuellen(new Warmgetraenk("Tee", TrinkTemperatur.ZU_HEISS));
        automat.neuAuffuellen(new Warmgetraenk("Kaffee", TrinkTemperatur.GENAU_RICHTIG));
        automat.neuAuffuellen(new Kaltgetraenk("Saft"));
        automat.neuAuffuellen(new Kaltgetraenk("Wassser"));
        automat.neuAuffuellen(new Kaltgetraenk("Brause"));
        automat.neuAuffuellen(new Getrank("Irgendwas"));

        person.etwasTrinken(automat);
        person.etwasTrinken(automat);
        person.etwasTrinken(automat);
        person.etwasTrinken(automat);

    }
}