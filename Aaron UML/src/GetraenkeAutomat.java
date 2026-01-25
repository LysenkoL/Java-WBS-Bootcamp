import java.util.ArrayList;

public class GetraenkeAutomat {
    private ArrayList<Getrank> gentaenke = new ArrayList<>();

    public void neuAuffuellen (Getrank getrank){
        gentaenke.add(getrank);
        System.out.println("Getrank " + getrank.getName() + " wird gespeichert");
    }

    public Getrank entnehmeGetraenk () {
        if(gentaenke.size()==0){
            return null;
        }
        System.out.println("Getrank " + gentaenke.get(0).getName() + " wird getrunken!");
        return gentaenke.remove(0);

    }
}
