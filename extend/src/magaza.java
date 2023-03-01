abstract class magaza {

    magaza(){
        pantolon = 0;
        gomlek = 0;
        tshirt = 0;
        ayakkabi = 0;
        ceket = 0;
    }

    private int pantolon;
    private int gomlek;
    private int tshirt;
    private int ayakkabi;
    private int ceket;

    private int p_fiyat = 250;
    private int g_fiyat = 150;
    private int t_fiyat = 100;
    private int a_fiyat = 500;
    private int c_fiyat = 600;

    void setPantolon(int x){
        pantolon = x;
    }
    void setGomlek(int x){
        gomlek = x;
    }
    void setTshirt(int x){
        tshirt = x;
    }
    void setAyakkabi(int x){
        ayakkabi = x;
    }
    void setCeket(int x){
        ceket = x;
    }

    int ara_fiyat(){
        int top = 0;
        top += pantolon * p_fiyat;
        top += gomlek * g_fiyat;
        top += tshirt * t_fiyat;
        top += ayakkabi * a_fiyat;
        top += ceket * c_fiyat;

        return top;
    }

    abstract int vergi();

    int toplam(){
        return vergi();
    }
}
