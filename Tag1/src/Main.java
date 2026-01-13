public class Main {
    public static void main(String[] args) {
        Auto meinAuto = new Auto("Grün", "XX AB123"); // Instanziierung
        System.out.println(meinAuto.lackfarbe); // Zugriff auf das öffentliche Attribut "lackfarbe" von dem Objekt hinter der Variable "meinAuto"
        System.out.println(meinAuto.nummernschild);

        Auto deinAuto = new Auto("Rot", "XX CD456"); // Eine weitere Instanz vom Typ Auto
        System.out.println(deinAuto.lackfarbe);

        Auto unserAuto = new Auto("Blau"); // Eine dritte Instanz vom Typ Auto. Wir benutzen den alternativen Konstruktor mit nur einem Parameter.
        System.out.println(unserAuto.nummernschild); // Das Attribut "nummernschild" hat dann den Standardwert aus diesem Konstruktor.
    }
}