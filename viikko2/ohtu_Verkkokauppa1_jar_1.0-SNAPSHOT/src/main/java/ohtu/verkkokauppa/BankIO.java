package ohtu.verkkokauppa;

public class BankIO implements Bank {
    
    public Kirjanpito kirjanpito;
    public BankIO(Kirjanpito kirjanpito){
        this.kirjanpito=kirjanpito;
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");
        return true;
    }
}
