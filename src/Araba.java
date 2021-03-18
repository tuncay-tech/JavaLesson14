public class Araba {

    private int model;
    private String renk;

    public static int araba_sayısı = 0; // 0 a eşitlersek +1 artırarak gidecek

    // consractor oluşruracağız

    public Araba(int model, String renk) {
        this.model = model;
        this.renk = renk;
        araba_sayısı++;
    }


}
