public class Main {
    public static void main(String[] args) {
        // classlar referans tiptir.
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; // Bu işlemi yaptığımızda customer manager artık customer manager2nin referansını tutar.
        customerManager.Add();
        customerManager.Update();
        customerManager.Remove();

    }
}
