public class ogrenci extends  magaza{

     int vergi(){
        return 1 * ara_fiyat();
    }

    int toplam(){
        return ara_fiyat() > 1300 ? vergi()*4/5: vergi();
    }
}
