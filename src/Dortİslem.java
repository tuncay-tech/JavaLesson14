public class Dortİslem {

   private int sayı1;
   private int sayı2;


    // şimidide toplamanın metodunu yazmalıyız
    public int topla(int i, int sayı1, int sayı2){
        int sonuc = sayı1 + sayı2;
        return sonuc;
    }
        // artık çıkarma metodunu tanımladıktan sonra artık maincallsımız çıkarma işlemini yapacak
    public int cıkar(int sayı1, int sayı2){
        int sonuc = sayı1 - sayı2;
        return sonuc;
    }

    public int carpma(int sayı1, int sayı2){
        int sonuc = sayı1 * sayı2;
        return sonuc;

    }

    public int bolme(int sayı1, int sayı2){
        int sonuc = sayı1 / sayı2;
        return sonuc;

    }

}
