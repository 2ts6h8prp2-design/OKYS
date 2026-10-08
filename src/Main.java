public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("978-1", "Nutuk", "M. Kemal Atatürk");
        KitapKopyasi k1 = new KitapKopyasi("B001", kitap);
        KitapKopyasi k2 = new KitapKopyasi("B002", kitap);

        Kullanici ali = new Kullanici(1, "Ali");

        OduncKaydi kayit = new OduncKaydi(ali, k1);
        System.out.println(kayit);
        System.out.println("B001 müsait mi? " + k1.isMusait()); // false

        kayit.iadeEt();
        System.out.println("İade sonrası müsait mi? " + k1.isMusait()); // true
        System.out.println("Toplam kopya: " + kitap.getKopyalar().size()); // 2
    }
}