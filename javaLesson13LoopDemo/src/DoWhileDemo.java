public class DoWhileDemo {
    public static void main(String[] args) {
        //bu döngünün while döngüsünden farkı şart sağlanmasa bile do çalışır. Örneğin döngü çalışmasa bile log atabiliriz.
        int i =1;
        do {
            System.out.println(i);
            i++;
        }while (i<10);
        System.out.println("Döngü bitti.");
    }
}
