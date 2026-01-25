public class Warmgetraenk extends Getrank {
   private TrinkTemperatur temperatur;

    public Warmgetraenk(String name, TrinkTemperatur temperatur) {
        super(name);
        this.temperatur = temperatur;
    }

    public TrinkTemperatur getTemperatur() {
        return temperatur;
    }
}
