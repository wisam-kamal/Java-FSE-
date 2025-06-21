public class Main {
    public static void main(String[] args) {
        Computer com1 = new Computer.Builder("Intel i8","4GB",128).build();
        Computer com2 = new Computer.Builder("Intel i5","8GB",256).build();
        com1.showSpecs();
        com2.showSpecs();

    }
}