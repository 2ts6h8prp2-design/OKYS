import java.util.ArrayList;
import java.util.List;

public class Kitap {
    private String isbn;
    private String baslik;
    private String yazar;
    private List<KitapKopyasi> kopyalar = new ArrayList<>();

    public Kitap(String isbn, String baslik, String yazar) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
    }

    public void kopyaEkle(KitapKopyasi k) { kopyalar.add(k); }
    public String getBaslik() { return baslik; }
    public List<KitapKopyasi> getKopyalar() { return kopyalar; }
}

