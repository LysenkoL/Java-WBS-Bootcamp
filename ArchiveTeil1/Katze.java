public class Katze extends Tier{

        private String farbe;
        private int anzahlLebensjahre;

        // Konstr

        public Katze (String name, int alter, String farbe, int anzahlLebensjahre){
            super (name, alter);
            this.farbe = farbe;
            this.anzahlLebensjahre = anzahlLebensjahre;
        }
        @Override
        public void beschreibung(){
            super.beschreibung();
            System.out.println("Farbe: " + farbe + " Anzahl der Lebensjahre, die eine Katze schon hat (1 Jahr = 7 Menschenjahre): " + anzahlLebensjahre);
        }

    }

