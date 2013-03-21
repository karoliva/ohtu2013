package ohtu.verkkokauppa;

public class WarehouseIO implements Warehouse {

    public Kirjanpito kirjanpito;

    public WarehouseIO(Kirjanpito kirjanpito) {
        this.kirjanpito = kirjanpito;
    }

    public Tuote haeTuote(int id) {
        return null;
    }

    public void otaVarastosta(Tuote t) {
        kirjanpito.lisaaTapahtuma("otettiin varastosta " + t);
    }

    public void palautaVarastoon(Tuote t) {
        kirjanpito.lisaaTapahtuma("palautettiin varastoon " + t);
    }

    public int saldo(int id) {
        return 0;
    }
}
