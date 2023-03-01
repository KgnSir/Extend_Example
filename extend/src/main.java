public class main {
    public static void main(String[] args) {
        isci a = new isci();
        ogrenci b = new ogrenci();
        yazilimci c = new yazilimci();

        a.setGomlek(1);
        a.setPantolon(0);
        a.setAyakkabi(4);
        a.setCeket(1);
        a.setTshirt(3);

        System.out.println("iscinin ara toplamı: " + a.ara_fiyat() + ", vergilendirilmis fiyat: " + a.vergi() + ", final fiyat: " + a.toplam());


        b.setGomlek(2);
        b.setPantolon(0);
        b.setAyakkabi(5);
        b.setCeket(1);
        b.setTshirt(3);

        System.out.println("öğrencinin ara toplamı: " + b.ara_fiyat() + ", vergilendirilmis fiyat: " + b.vergi() + ", final fiyat: " + b.toplam());


        c.setGomlek(2);
        c.setPantolon(0);
        c.setAyakkabi(4);
        c.setCeket(0);
        c.setTshirt(3);

        System.out.println("yazılımcının ara toplamı: " + c.ara_fiyat() + ", vergilendirilmis fiyat: " + c.vergi() + ", final fiyat: " + c.toplam());
    }
}
