public class SesliHarfler {
    public static void main(String[] args) {
        char harf = 'I';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Harf kalın seslidir");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Harf ince seslidir.");
                break;
            default:
                System.out.println("Lütfen sesli bir harf giriniz.");

        }
    }
}
