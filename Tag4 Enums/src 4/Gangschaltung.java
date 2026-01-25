public enum Gangschaltung { // Eigener Datentyp "Gangschaltung", mit 7 möglichen Zuständen
    Parken,
    Rückwerts,
    Drive,
    Sport,
    Manuell1,
    Manuell2,
    Manuell3; // Nach Semikolon keine Aufzählung der möglichen Werte mehr

        public boolean Manuell() { // Alle Werte ab Manuell1 sollen 'true' ausgeben
            return this.ordinal() >= Manuell1.ordinal(); // this: Der konkrete Enum-Wert, auf dem die Methode benutzt wird.
        }
}
