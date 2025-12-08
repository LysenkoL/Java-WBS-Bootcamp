public class Rechner {
    public double berechne(double zahl1, double zahl2, char operator) {
        double ergebnis = 0;

        switch (operator) {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;
            case '-':
                ergebnis = zahl1 - zahl2;
                break;
            case '*':
                ergebnis = zahl1 * zahl2;
                break;
            case '/':
                if (zahl2 != 0) {
                    ergebnis = zahl1 / zahl2;
                } else {
                    throw new ArithmeticException("Ungültiger Operator.");
                }
                break;
            case '%':
                ergebnis = (zahl1*zahl2)/100;
                break;
            default:
                throw new IllegalArgumentException("Ungültiger Operator.");
        }
        return ergebnis;
    }
}
