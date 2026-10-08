public class KitapKopyasi {
    private String barkod;
    private boolean musait = true;
    private Kitap kitap; // hangi kitabın kopyası

    public KitapKopyasi(String barkod, Kitap kitap) {
        this.barkod = barkod;
        this.kitap = kitap;
        kitap.kopyaEkle(this);
    }

    public boolean isMusait() { return musait; }
    public void setMusait(boolean m) { this.musait = m; }
    public Kitap getKitap() { return kitap; }
    public String getBarkod() { return barkod; }
}
