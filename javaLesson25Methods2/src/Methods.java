public class Methods {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int toplam = topla(2,3);
        System.out.println(toplam);

    }
    public static void ekle(){
        System.out.println("Müşteri eklendi.");
    }
    public static void sil(){
        System.out.println("Müşteri silindi.");
    }
    public static void guncelle(){
        System.out.println("Müşteri güncellendi.");
    }
    public static String sehirVer(){
        return "Ankara";
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
}
