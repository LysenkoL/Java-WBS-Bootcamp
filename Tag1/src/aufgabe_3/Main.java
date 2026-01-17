/* Level 1
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - eine Klasse 'Produkt' definiert wird
   + Klassenmember sind:
     - name (String, private)
        + normaler Getter und Setter
     - mindestpreis (Integer, private)
        + kein Getter, normaler Setter
     - verkaufspreis (Integer, private)
        + normaler Getter; Setter: nur FALLS value>=mindestpreis SONST verkaufspreis=mindestpreis
 - im Main alle obigen "Feature" getestet werden
*/

package aufgabe_3;

public class Main {
    public static void main(String[] args) {

        Produkt firstProd =  new Produkt();
        firstProd.setName("Tea");
        firstProd.setMindestpreis(15);
        firstProd.setVerkaufspreis(20);

        Produkt secondProd = new Produkt();
        secondProd.setName("Kaffee");
        secondProd.setMindestpreis(25);
        secondProd.setVerkaufspreis(10);

        System.out.println("First Produkt : " + firstProd.getName() + " Verkaufspreis: " + firstProd.getVerkaufspreis());
        System.out.println("Second Produkt : " + secondProd.getName() + " Verkaufspreis: " + secondProd.getVerkaufspreis());
    }
}