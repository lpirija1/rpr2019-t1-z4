package ba.unsa.etf.rpr;

public class Supermarket {
  private  Artikl[] artikli;
  private int kapacitet;
  private int br_artikala;

    public Supermarket() {
        artikli=new Artikl[1000];
        kapacitet=1000;
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

    public void dodajArtikl(Artikl a) {
        for(int i=0; i<kapacitet; i++){
            if(artikli[i]==null) artikli[i]=a;
            break;
        }
        br_artikala++;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<kapacitet; i++){
            if(artikli[i].getKod().equalsIgnoreCase(kod)){
                Artikl a=artikli[i];
                artikli[i]=null;
                br_artikala--;
                return a;
            }
        }
        return null;
    }
}
