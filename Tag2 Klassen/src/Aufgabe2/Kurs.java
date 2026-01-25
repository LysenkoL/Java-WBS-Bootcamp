package Aufgabe2;

public class Kurs
{
    private static Kurs[] kurse;
    private static int zähler = 0;
    private static int maxWert = -1;

    private int kursnummer;

    public Kurs(int kursnummer)
    {
        this.kursnummer = kursnummer;

        for (int i = 0; i < zähler; i++)
        {
            if (kurse[i].kursnummer == kursnummer)
            {
                this.kursnummer = -1;
                System.out.println("Kursnummer " + kursnummer + " existiert schon.");
                break;
            }
        }

        kurse[zähler] = this;
        zähler++;
    }

    public static int getMaxWert()
    {
        return maxWert;
    }

    public static void setMaxWert(int maxWert)
    {
        if (Kurs.maxWert == -1)
        {
            Kurs.maxWert = maxWert;
            kurse = new Kurs[Kurs.maxWert];
        }
    }

    public static void ausgabe()
    {
        for (Kurs k : kurse)
        {
            if (k.kursnummer != -1)
                System.out.println(k.kursnummer);
            else
                System.out.println("Fehler");
        }
    }
}
