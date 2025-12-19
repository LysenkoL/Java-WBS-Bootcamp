public class Praktikant extends Person implements Identifizierbar {
    private String praktikumsStelle;
    private String betreuer;

    public Praktikant(String name, int alter, String adresse, String praktikumsStelle, String betreuer){
        super(name, alter, adresse);
        this.praktikumsStelle = praktikumsStelle;
        this.betreuer = betreuer;
    }

    @Override
    public String getId(){
        return praktikumsStelle;
    }

    public String getBetreuer(){
        return betreuer;
    }
}
}
