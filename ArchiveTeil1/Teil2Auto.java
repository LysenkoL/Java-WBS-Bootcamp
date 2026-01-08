public class Teil2Auto {

    private float geschwindigkeitKmH;
    private float zuruekgelegteStrecke;


    public void setGeschwindigkeitKmH(float geschwindigkeitKmH) {
        if (geschwindigkeitKmH >=0)
            this.geschwindigkeitKmH = geschwindigkeitKmH;
        else
            System.out.println("Eine negative Geschwindigkeit ist nicht zulässig!");
    }


    public Teil2Auto(float startGeschwindigkeitKmH) {
        setGeschwindigkeitKmH(startGeschwindigkeitKmH);
    }

    public float getZuruekgelegteStrecke() {
        return zuruekgelegteStrecke;
    }

    /*public void setZuruekgelegteStrecke(float zuruekgelegteStrecke) {
        this.zuruekgelegteStrecke = zuruekgelegteStrecke;
    }
    */

    public void eineStundeFahren(){
        zuruekgelegteStrecke = zuruekgelegteStrecke + geschwindigkeitKmH;
    }


}
