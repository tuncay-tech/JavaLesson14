public class MainClass2 {

    public static void main(String[] args) {
        // dortişlem sınıfını kullanmamız için bir tane nesne oluşturalım

        Dortİslem i̇slem = new Dortİslem();
        int toplam = i̇slem.topla(15, 15,20);
        System.out.println("topla: " + toplam);

        int cıkar = i̇slem.cıkar(50,40);
        System.out.println("cıkar: " + cıkar);

        int carpma = i̇slem.carpma(50,40);
        System.out.println("carpma: " + carpma);

        int bolme = i̇slem.bolme(10,5);
        System.out.println("bolme: " + bolme);

    }
}
