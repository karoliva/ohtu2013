package ohtu.verkkokauppa;

public class Kauppa implements Shoppi {

    public ShoppiIO io;

    public Kauppa(Varasto varasto, Pankki pankki, Viitegeneraattori viitegen) {
        io= new ShoppiIO(varasto, pankki, viitegen);
    }

    @Override
    public void aloitaAsiointi() {
        io.aloitaAsiointi();
    }

    @Override
    public void poistaKorista(int id) {
        io.poistaKorista(id);
    }

    @Override
    public void lisaaKoriin(int id) {
        io.lisaaKoriin(id);
    }

    @Override
    public boolean tilimaksu(String nimi, String tiliNumero) {
        return io.tilimaksu(nimi, tiliNumero);
    }
}
