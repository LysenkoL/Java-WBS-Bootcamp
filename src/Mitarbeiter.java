public class Mitarbeiter extends Person implements Identifizierbar{
    private String mitarbeiterID;
    private String abteilung;

    public Mitarbeiter(Srting name, int alter, String adresse, String mitarbeiterID, String abteilung){
        super(name, alter, adresse);
        this.mitarbeiterID = mitarbeiterID;
        this.abteilung = abteilung;
    }

    @Override
    public String getID(){
        return mitarbeiterID;
    }
    public String getAbteilung(){
        return abteilung;
    }


}
