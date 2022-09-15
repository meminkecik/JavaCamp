public class WhileDemo {
    public static void main(String[] args) {
        //while döngüsünde şart sağlanmazsa döngüye girmez.
        int i = 1;
        while (i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("Döngü bitti.");
    }
}
