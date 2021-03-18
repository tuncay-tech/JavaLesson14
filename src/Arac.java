public class Arac {   // consractar ismi ile sınıf isimi aynı olmalıdır

    private String marka;
    private String renk;
    private int model;
    private int fiyat;

    public Arac() {  // boş consractar  açalım  --- sınıf isimleri ile consractar isimleri aynıdır
    }

    // consractar ismi ile sınıf isimi aynı olmalıdır
    //  public Arac(String marka) {   // sadece markayı içeren bir constractor acalım
    //  this.marka = marka;}

    // dolu consractar actık. kolay açma yolu sağ tık ve genarete
    public Arac(String marka, String renk, int model, int fiyat) {
        this.marka = marka;
        this.renk = renk;
        this.model = model;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
