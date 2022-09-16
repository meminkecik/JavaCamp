public class ArkadasSayilar {
    public static void main(String[] args) {
        int number1 = 17296;
        int number2 = 18416;
        int toplam1 = 0;
        int toplam2=0;

        for (int i=1;i<number1;i++){
            if (number1%i==0){
                toplam1=i+toplam1;
            }
        }
        for (int j=1;j<number2;j++){
            if (number2%j==0){
                toplam2=j+toplam2;
            }
        }
        if (toplam1==number2 && toplam2==number1){
            System.out.println("Sayılar arkadaş sayıdır.");
        }else {
            System.out.println("Sayılar arkadaş sayı değildir.");
        }
    }
}
