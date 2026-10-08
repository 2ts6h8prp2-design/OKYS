import java.time.LocalDate;

public class OduncKaydi {
    private Kullanici kullanici;
    private KitapKopyasi kopya;
    private LocalDate alisTarihi;
    private LocalDate iadeTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kopya) {
        this.kullanici = kullanici;
        this.kopya = kopya;
        this.alisTarihi = LocalDate.now();
        kopya.setMusait(false);
        kullanici.kayitEkle(this);
    }

    public void iadeEt() {
        this.iadeTarihi = LocalDate.now();
        kopya.setMusait(true);
    }

    @Override
    public String toString() {
        return kullanici.getAd() + " -> " + kopya.getKitap().getBaslik()
                + " (" + alisTarihi + ")";
    }
}