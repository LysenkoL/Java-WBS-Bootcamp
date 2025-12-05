public class Sprung {
    public static void main(String[] args) {
        int [] zahlen = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < zahlen.length; i++) {
            int zahl = zahlen[i];

            if (zahl%2 !=0) {
                continue;
            }
            System.out.println("Gerade Zahlen: " + zahl);

        }


        //############################
        int [] noten = {3,5,1,4,2,6,1};
        for (int i = 0; i < noten.length; i++) {
            int note = noten [i];

            if (note<4)
                continue;

            if (note == 1) {
                System.out.println("Note 1 gefunden, Schleife wird beendet");
                break;
            }

        }
    }
}

