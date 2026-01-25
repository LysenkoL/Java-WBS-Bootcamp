package protectedAttributes;

import protectedAttributes.subRobots.Android;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        System.out.println(android.name);
        //System.out.println(android.isHuman); // kein Zugriff von hier
        //System.out.println(android.manufacturerId); // kein Zugriff von hier
        //System.out.println(android.creationDate); // kein Zugriff von hier
    }
}
