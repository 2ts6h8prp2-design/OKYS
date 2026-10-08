import java.util.ArrayList;
import java.util.List;

public class Kullanici {
    private int id;
    private String ad;
    private List<OduncKaydi> kayitlar = new ArrayList<>();

    public Kullanici(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public void kayitEkle(OduncKaydi k) { kayitlar.add(k); }
    public String getAd() { return ad; }
    public List<OduncKaydi> getKayitlar() { return kayitlar; }
}
