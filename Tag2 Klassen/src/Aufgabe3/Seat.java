package Aufgabe3;

/*
Klasse Seat:
	Erstellen Sie eine Klasse Seat mit den folgenden Attributen:
		int row: Die Zeile des Sitzplatzes.
		int column: Die Spalte des Sitzplatzes.
		boolean isReserved: Gibt an, ob der Sitzplatz reserviert ist oder nicht.
	Implementieren Sie einen Konstruktor, der die Zeile und Spalte initialisiert und isReserved auf false setzt.
	Implementieren Sie eine Methode reserve(), die den Sitzplatz reserviert (d.h., isReserved auf true setzt).
 */

public class Seat
{
	private int row;
	private int column;
	private boolean reserved;

	public int getRow()
	{
		return row;
	}

	public int getColumn()
	{
		return column;
	}

	public boolean isReserved()
	{
		return reserved;
	}

	public Seat(int row, int column)
	{
		this.row = row;
		this.column = column;
		this.reserved = false;
	}

	public void reserve()
	{
		reserved = true;
	}
}
