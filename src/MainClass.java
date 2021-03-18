public class MainClass {
    public static void main(String[] args) {

        Arac bmw1 = new Arac("BMW", "mavi", 2020, 100000);
        // bmw1 in bilgilerini consractar içine yazdık

        Arac bmw2 = new Arac();   // arac sınıfından iki tane bmw1 ve bmw2 gibi nesne oluşturduk
        bmw2.setMarka("BMW");
        bmw2.setRenk("kırmızı");    // bmw2 in bilgilerini set ter ile aldık
        bmw2.setModel(2010);
        bmw2.setFiyat(50000);

        // bmw1 bilgilwein bilgilerini alalım
        int bmw1_fiyat = bmw1.getFiyat();
        String bmw1_marka = bmw1.getMarka();
        int bmw1_model = bmw1.getModel();
        String bmw1_renk = bmw1.getRenk();


    }
}
