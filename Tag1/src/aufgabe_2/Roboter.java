package aufgabe_2;

public class Roboter {
    private Integer batterieLaufzeit;
    private String aufgabe;

    public Integer getBatterieLaufzeit() {
        return batterieLaufzeit;
    }

    public void setBatterieLaufzeit(Integer batterieLaufzeit) {
        this.batterieLaufzeit = batterieLaufzeit;
    }

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    public boolean istBatterieLaufzeitNiedrig () {
        if (batterieLaufzeit <2) {
            return true;
        }
        return false;
    }

    public void fuehreAufgabeAus (){

        if (istBatterieLaufzeitNiedrig() == false)
        {
            System.out.println(getAufgabe());
            this.batterieLaufzeit--;
            //setBatterieLaufzeit(this.batterieLaufzeit - 1);
            // setBatterieLaufzeit(batterieLaufzeit--); не работает потому что сперва передаст 5 а потом уменьшит внутри метода и не передаст больше
        }
        else
        {
            System.out.println("Ich muss aufgeladen werden.");
        }
    }
}
