package aufgabe_4;

import java.util.Random;

public class Schachfeld {
     Random rand = new Random();
    private  String linie(){
        String [] buchstaben = {"A", "B", "C", "D", "E", "F", "G", "H"};
        return buchstaben[rand.nextInt(8)];
    }

    private  String reihe(){
        String [] zahlen = {"1", "2", "3", "4", "5", "6", "7", "8"};
        return zahlen[rand.nextInt(8)];
    }

    public  String getZufallsfeld(){
        return linie() +reihe();
    }
}
