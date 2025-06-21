public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("beach_pic.jpg");
        Image image2 = new ProxyImage("mountain_pic.jpeg");

        image1.display();
        System.out.println();

        image1.display();
        System.out.println();

        image2.display();
        System.out.println();

        image2.display();
    }
}
