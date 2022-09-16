public class AsalMi {
    public static void main(String[] args) {
        int number = 13;
        boolean asalMi=true;

        for (int i=2;i<number;i++){
            if (number%i==0){
                asalMi=false;
            }
        }
        if (number<2){
            System.out.println("En küçük asal sayı 2'dir.");
        }else {
            if (asalMi){
                System.out.println("Sayı asaldır");
            }else {
                System.out.println("Sayı asal değildir.");
            }
        }

    }
}
