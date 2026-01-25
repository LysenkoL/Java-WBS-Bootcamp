/* Level 1
 * Basisklasse Robot
 *  - Attribute: name, isHostile
 * Subklasse Terminator, erbt von Robot
 *  - Attribute: targetName
 * Subklasse Transformer, erbt von Robot
 *  - Attribute: faction
 * Subklasse Android, erbt von Robot
 *  - Attribute: isHuman
 *
 * Erstellen Sie von jeder Klasse ein Objekt und weisen sie den Attributen über die Konstruktoren beliebige Werte zu.
 * Testen Sie die Attribute durch Konsolenausgaben
 */

package Aufgabe1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Rocky", true);
        Transformer transform = new Transformer("Trik", false, "faction");
        Terminator term = new Terminator("Rex", true, "Dino");
        Android andr = new Android("Handy", true, false);

        System.out.println(robot.getName());
        System.out.println(transform.getName());
        System.out.println(term.getName());
        System.out.println(andr.getName());

        robot.sprechen();
        transform.sprechen();
        term.sprechen();
        andr.sprechen();
    }



}
