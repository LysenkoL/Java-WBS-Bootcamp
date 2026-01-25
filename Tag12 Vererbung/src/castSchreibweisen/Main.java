package castSchreibweisen;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Android();

        Android robotAsAndroid = Android.class.cast(robot); // Was im Hintergrund passiert
        System.out.println(robotAsAndroid);

        robotAsAndroid = (Android) robot; // Die Schreibweise, die wir uns merken wollen
        System.out.println(robotAsAndroid);
    }
}