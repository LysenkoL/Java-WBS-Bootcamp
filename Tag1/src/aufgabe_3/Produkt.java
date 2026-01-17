package aufgabe_3;

public class Produkt {
    private String name;
    private Integer mindestpreis;
    private Integer verkaufspreis;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMindestpreis(Integer mindestpreis) {
        this.mindestpreis = mindestpreis;
    }

    public Integer getVerkaufspreis() {
        return verkaufspreis;
    }
    public void setVerkaufspreis(Integer verkaufspreis) {
        if (verkaufspreis >= mindestpreis) {
            this.verkaufspreis = verkaufspreis;
        }
        else {
            this.verkaufspreis = mindestpreis;
        }
    }
}
