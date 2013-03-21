package ohtu.verkkokauppa;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Kauppa implements Shoppi {

    public ShoppiIO io;
@Autowired
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
