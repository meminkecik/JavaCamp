public class Methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int [] sayilar = new int[]{1,3,5,7,9,0,2};
        int aranacak = 6;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
            }
        }
        if (varMi){
            mesajVer("Sayı mevcuttur " +aranacak);
        }else {
           mesajVer("Sayı mevcut değildir " +aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
