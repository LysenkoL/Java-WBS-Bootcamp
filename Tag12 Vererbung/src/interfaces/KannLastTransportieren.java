package interfaces;

public interface KannLastTransportieren {

    // Ich definiere die öffentliche Signatur (also ohne Methoden-Körper)
    public void ladeLastEin(String last);
    public String ladeLastAus();

    //"public" ist hier optional. Alle Methoden in einem Java Interface sind standardmäßig public. (Den Zugriffsmodifizierer wegzulassen ist also NICHT package-private!)
}
