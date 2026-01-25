package aggregation;

import java.util.ArrayList;

public class Abenteurer {
    public static ArrayList<Abenteurer> alleAbenteurer = new ArrayList<>();

    private String name;

    public Abenteurer(String name) {
        this.name = name;
        alleAbenteurer.add(this); // Für die Aggregation: Abenteurer existieren allein und reihen sich zu Beginn die statische Liste alle Abenteurer ein
    }

    public String getName() {
        return name;
    }
}
