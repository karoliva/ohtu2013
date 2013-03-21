package ohtu.verkkokauppa;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Pankki implements Bank {

    public BankIO io;
    
    @Autowired
    public Pankki(Kirjanpito kirjanpito) {
        io = new BankIO(kirjanpito);
    }

    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        return io.tilisiirto(nimi, viitenumero, tililta, tilille, summa);
    }
}
