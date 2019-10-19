package ba.unsa.etf.rpr;

public class Korpa {
  private   Artikl[] artikli;
  private   int kapacitet;
 private    int br_artikala;

    public Korpa() {
        artikli=new Artikl[50];
        kapacitet=50;
        br_artikala=0;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    public int getBr_artikala() {
        return br_artikala;
    }

    public void setBr_artikala(int br_artikala) {
        this.br_artikala = br_artikala;
    }


    public boolean dodajArtikl(Artikl a) {
        if(br_artikala==kapacitet) return false;
        for(int i=0; i<kapacitet; i++){
            if(artikli[i]==null) artikli[i]=a;
            break;
        }
        br_artikala++;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<br_artikala; i++){
            if(artikli[i].getKod().equalsIgnoreCase(kod)){
                Artikl a=artikli[i];
                artikli[i]=null;
                br_artikala--;
                return a;
        }}
        return null;
    }


    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(int i=0; i<kapacitet; i++){
            suma+=artikli[i].getCijena();
        }
        return suma;
    }
}
