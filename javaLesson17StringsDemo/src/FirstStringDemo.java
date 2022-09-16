public class FirstStringDemo {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        //bu metot metindeki eleman sayısını verir
        System.out.println(mesaj.length());

        //bu metot istediğimiz elemanı verir.
        System.out.println("5. eleman : "+mesaj.charAt(4));

        //bu metot bir metinle diğerini birleştirir.
        System.out.println(mesaj.concat(" Yaşasın!"));

        //bu metotlar metinin ne ile başlayıp bittiğiyle ilgili true ya da false döndürür.
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));

        //bu metot metindeki istediğimiz bir bölümü alıp yeni bir metine atayabilmemize olanak sağlar.
        char [] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

        //bu metot belirttiğimiz karakterin kaçıncı indexte olduğunu bulmaya yarar. Aramaya soldan başlar
        System.out.println(mesaj.indexOf("u"));

        //bu metot belirttiğimiz karakterin kaçıncı indexte olduğunu bulmaya yarar. Aramaya sağdan başlar
        System.out.println(mesaj.lastIndexOf("u"));

        //bu metot metindeki değiştirmek istediğimiz yeri değiştirir.
        String newMessage = "";
        newMessage=mesaj.replace(" ","-");
        System.out.println(newMessage);

        // bu metot ile metini kaçıncı karakterden itibaren almak istiyorsak alabiliyoruz.
        System.out.println(mesaj.substring(2));

        //bu metot metini istediğimiz bir şey ile bölebilmemize olanak sağlıyor.
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        // bu metot metini küçük harflere döndürür.
        System.out.println(mesaj.toLowerCase());

        //bu metot metini büyük harflere döndürür.
        System.out.println(mesaj.toUpperCase());

        //bu metot ile metinin başındaki ve sonundaki boşluklar atılabilir.
        System.out.println(mesaj.trim());


    }
}
