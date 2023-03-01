public class isci extends  magaza{


     int vergi(){
        return 115 * ara_fiyat() / 100;
    }

    int toplam(){
        return ara_fiyat() > 1500 ? vergi()*3/4: vergi();
    }
}
