package protectedAttributes.subRobots;

import protectedAttributes.baseRobots.Robot;

public class Android extends Robot {
    public Android() {
        this.name = "C-3PO";
        this.isHuman = true;
        // this.manufacturerId // kein Zugriff von hier
        // this.creationDate // kein Zugriff von hier
    }
}
