public class Computer {
    private String CPU;
    private String RAM;
    private int Storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage= builder.Storage;
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private int Storage;

        public Builder (String CPU, String RAM, int Storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.Storage = Storage;
        }


        public Computer build() {
            return new Computer(this);
        }
    }
    public void showSpecs()  {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + Storage +"GB");
    }
}





