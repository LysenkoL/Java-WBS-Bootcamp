package nochMehrSuperKlassen;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Android();

        System.out.println(robot.getClass()); // Zu Analysezwecken: Es gibt Objekte, die extra Information über Klassen und Typen speichern.
        System.out.println(robot.getClass().getSuperclass().getSuperclass()); // Kleiner Einblick: Alle Klassen erben von java.lang.Object
    }
}
