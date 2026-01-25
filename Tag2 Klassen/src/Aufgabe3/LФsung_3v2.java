package Aufgabe3;

/* Level 2

Sie sollen ein einfaches Sitzplatzreservierungssystem für ein Kino entwerfen. Die Sitzplätze werden in einem zweidimensionalen Array dargestellt, und jeder Sitzplatz ist ein Objekt der Klasse Seat.

*/

import java.util.Random;

public class Lösung_3v2
{
	/*
	Sitzplatzmatrix:
        Erstellen Sie ein zweidimensionales Array Seat[][] mit einer Größe von 5x5, um die Sitzplätze im Kino darzustellen.
	 */
	private static Seat[][] kino = new Seat[5][5];

	private static Random random = new Random();

	public static void main(String[] args)
	{
		for (int row = 0; row < kino.length; row++)
		{
			for (int column = 0; column < kino[row].length; column++)
			{
				kino[row][column] = new Seat(row, column);
				int reservieren = random.nextInt(3);
				if (reservieren == 0 || reservieren == 1)
					kino[row][column].reserve();
			}
		}

		printSeats();

		/*
		Testen:
        Reservieren Sie einige Sitzplätze manuell, um den Suchalgorithmus zu testen.
        Rufen Sie die Methode findAndReserveFirstAvailableSeat() auf und überprüfen Sie, ob der Sitzplatz korrekt reserviert wurde.
		 */

		boolean success;
		// Die Methode so lange aufrufen, bis alle Sitzplätze reserviert sind
		do
		{
			Seat s = findAndReserveFirstAvailableSeat();
			if (s != null) // Der reservierte Sitzplatz wird zurückgegeben.
			{
				success = true;
				System.out.printf("kino[%d][%d] reserviert.\n", s.getRow(), s.getColumn());
			}
			else // Konnte kein Sitzplatz reserviert werden, setzen wir success auf false und beenden die Schleife.
				success = false;

		} while (success);

		System.out.println("Keine weiteren freien Sitzplätze verfügbar.");

		printSeats();
	}

	/*
	    Suchalgorithmus:
        Implementieren Sie eine Methode findAndReserveFirstAvailableSeat(), die den ersten nicht reservierten Sitzplatz im Array sucht und reserviert. Geben Sie die Position des reservierten Sitzplatzes auf der Konsole aus. Falls kein Sitzplatz verfügbar ist, geben Sie eine entsprechende Nachricht aus.
	 */
	public static Seat findAndReserveFirstAvailableSeat()
	{
		for (int row = 0; row < kino.length; row++)
		{
			for (int column = 0; column < kino[row].length; column++)
			{
				if (kino[row][column].isReserved() == false)
				{
					Seat s = kino[row][column];
					s.reserve();
					return s;
				}
			}
		}

		// Wir geben null zurück, wenn wir keine freien Sitze mehr haben.
		return null;
	}

	public static void printSeats()
	{
		for (int row = 0; row < kino.length; row++)
		{
			for (int column = 0; column < kino[row].length; column++)
			{
				// "%-7s" für eine linksbündige Ausgabe
				System.out.printf("%-7s", kino[row][column].isReserved());
			}
			System.out.println();
		}
	}
}
