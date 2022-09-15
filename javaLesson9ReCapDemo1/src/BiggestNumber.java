public class BiggestNumber {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyukSayi = sayi1;
        if (sayi1<sayi2){
            enBuyukSayi = sayi2;
        } else if (sayi1<sayi3) {
            enBuyukSayi=sayi3;
        } else if (sayi2<sayi3) {
            enBuyukSayi=sayi3;
        }
        System.out.println("En büyük sayı : " +enBuyukSayi);
    }
}
